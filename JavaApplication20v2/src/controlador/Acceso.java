/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Rueda;

/**
 * Clase que controla el acceso a una base de datos y las operaciones necesaria
 * para el manejo de la basse de datos por parte del programa
 *
 * @author Jose Antonio Ferre Rico
 */
public class Acceso {

    private final String dbUrl = "jdbc:mysql://localhost/taller";
    private final String username = "root";
    private final String password = "";

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    /**
     * Método para conectar con la base de datos
     *
     * @return
     */
    public int openConnection() {
        try {
            connection = DriverManager.getConnection(dbUrl, username, password);
            return 1;
        } catch (SQLException ex) {
            return -1;
        }
    }

    /**
     * Método que agrega un nuevo objeto rueda a la base de datos taller
     *
     * @param r
     * @return
     */
    public boolean agregaRuega(Rueda r) {
        boolean bControl = false;

        try {
            this.connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String sql = "INSERT INTO neumatico (codigo, marca, modelo, ancho, perfil, diametro, ic, iv, precio) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement2 = connection.prepareStatement(sql)) {
            statement2.setInt(1, r.getiCodigo());
            statement2.setString(2, r.getsMarca());
            statement2.setString(3, r.getsModelo());
            statement2.setDouble(4, r.getiAncho());
            statement2.setString(5, r.getePerfil());
            statement2.setDouble(6, r.getdDiamtro());
            statement2.setInt(7, r.getiIC());
            statement2.setString(8, r.geteIV());
            statement2.setDouble(9, r.getdPrecio());

            // Ejecutar la consulta
            statement2.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
            return false;

        }

    }

    /**
     * Método que controla el borrado de la base de datos de los elementos que
     * tengan en cumún un perfil
     *
     * @param perfil
     * @return
     */
    public boolean eliminarRuedasPorPerfil(String perfil) {
        try {
            this.connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String sql = "DELETE FROM neumatico WHERE perfil = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, perfil);

            // Ejecutar la consulta
            int rowsAffected = statement.executeUpdate();
            connection.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Método que elimina una fila de la tabla ruedas por el id
     *
     * @param codigo
     * @return
     */
    public boolean eliminarRueda(int codigo) {
        try {
            this.connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        String sql = "DELETE FROM neumatico WHERE codigo = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, codigo);
            int rowsAffected = statement.executeUpdate();

            connection.close();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Método de control de las excepciones para controlar por consola las
     * mismas
     *
     * @param e
     */
    public static void muestraErrorSQL(SQLException e) {
        System.err.println("SQL ERROR. Mensaje: " + e.getMessage());
        System.err.println("SQL Estado: " + e.getSQLState());
        System.err.println("SQL Código especifico: " + e.getErrorCode());
    }

    /**
     * Método para actualizar los campos de una rueda seleccionada
     *
     * @param r
     * @return
     */
    public boolean actualizarRueda(Rueda r) {
        try {
            this.connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        String sql = "UPDATE neumatico SET marca=?, modelo=?, ancho=?, perfil=?, diametro=?, ic=?, iv=?, precio=? WHERE codigo=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, r.getsMarca());
            statement.setString(2, r.getsModelo());
            statement.setInt(3, r.getiAncho());
            statement.setString(4, r.getePerfil());
            statement.setDouble(5, r.getdDiamtro());
            statement.setInt(6, r.getiIC());
            statement.setString(7, r.geteIV());
            statement.setDouble(8, r.getdPrecio());
            statement.setInt(9, r.getiCodigo());

            int filasActualizadas = statement.executeUpdate();
            connection.close();
            return filasActualizadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Método para descargar los elementos de la base de datos a una lista y así comtrolarlos desde el programa
     * @param query
     * @return
     */
    public ArrayList<Rueda> getRuedas(String query) {
        try {
            this.connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ArrayList<Rueda> lruedas = new ArrayList<>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Rueda r = new Rueda();
                r.setiCodigo(resultSet.getInt("codigo"));
                r.setsMarca(resultSet.getString("marca"));
                r.setsModelo(resultSet.getString("modelo"));
                r.setiAncho(resultSet.getInt("ancho"));
                r.setePerfil(resultSet.getString("perfil"));
                r.setdDiamtro(resultSet.getDouble("diametro"));
                r.setiIC(resultSet.getInt("ic"));
                r.seteIV(resultSet.getString("iv"));
                r.setdPrecio(resultSet.getDouble("precio"));
                lruedas.add(r);

            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException ex) {
            System.out.println("Excepcion SQL: " + ex.toString());
        }
        return lruedas;
    }
}
