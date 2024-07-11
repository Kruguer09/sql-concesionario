/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 * Clase que describe y parametriza el objeto rueda que será el componente de la base de datos taller, tabla rueda. tiene sus getter y setter para acceder a sus datos
 * @author USER
 */
public class Rueda implements Serializable{
    private int iCodigo, iAncho, iIC;
    private double dPrecio, dDiamtro;
    private String sMarca, sModelo;
    
    public String ePerfil ;
    public String eIV ;

    public Rueda(int iCodigo, int iAncho, int iIC, double dPrecio, double dDiamtro, String sMarca, String sModelo, String ePerfil, String eIV) {
        this.iCodigo = iCodigo;
        this.iAncho = iAncho;
        this.iIC = iIC;
        this.dPrecio = dPrecio;
        this.dDiamtro = dDiamtro;
        this.sMarca = sMarca;
        this.sModelo = sModelo;
        this.ePerfil = ePerfil;
        this.eIV = eIV;
    }

    public Rueda() {
        
    }

    public int getiCodigo() {
        return iCodigo;
    }

    public int getiAncho() {
        return iAncho;
    }

    public int getiIC() {
        return iIC;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public double getdDiamtro() {
        return dDiamtro;
    }

    public String getsMarca() {
        return sMarca;
    }

    public String getsModelo() {
        return sModelo;
    }

    public String getePerfil() {
        return ePerfil;
    }

    public String geteIV() {
        return eIV;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public void setiAncho(int iAncho) {
        this.iAncho = iAncho;
    }

    public void setiIC(int iIC) {
        this.iIC = iIC;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    public void setdDiamtro(double dDiamtro) {
        this.dDiamtro = dDiamtro;
    }

    public void setsMarca(String sMarca) {
        this.sMarca = sMarca;
    }

    public void setsModelo(String sModelo) {
        this.sModelo = sModelo;
    }

    public void setePerfil(String ePerfil) {
        this.ePerfil = ePerfil;
    }

    public void seteIV(String eIV) {
        this.eIV = eIV;
    }
    

    
    
}
