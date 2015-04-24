package com.gisnet.cancelacion.pojos;
// Generated 23/04/2015 09:05:31 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CCaso generated by hbm2java
 */
public class CCaso  implements java.io.Serializable {


     private long casoId;     
     private CNotario CNotario;
     private int numeroDeCredito;
     private int numeroDeCaso;
     private Date fechaDeCreacion;
     private Date fechaDeCierre;
     private Long proyectoDeCancelacion;
     private String nombreAcreditado;
     

    public CCaso() {
    }

	
    public CCaso(long casoId) {
        this.casoId = casoId;
    }
    public CCaso(long casoId, CNotario CNotario, int numeroDeCredito, int numeroDeCaso, Date fechaDeCreacion, Date fechaDeCierre, Long proyectoDeCancelacion, String nombreAcreditado) {
       this.casoId = casoId;
       
       this.CNotario = CNotario;
       
       this.numeroDeCredito = numeroDeCredito;
       this.numeroDeCaso = numeroDeCaso;
       this.fechaDeCreacion = fechaDeCreacion;
       this.fechaDeCierre = fechaDeCierre;
       this.proyectoDeCancelacion = proyectoDeCancelacion;
       this.nombreAcreditado = nombreAcreditado;
       //this.CBitacoraCasos = CBitacoraCasos;
    }
   
    public long getCasoId() {
        return this.casoId;
    }
    
    public void setCasoId(long casoId) {
        this.casoId = casoId;
    }
    
    public CNotario getCNotario() {
        return this.CNotario;
    }
    
    public void setCNotario(CNotario CNotario) {
        this.CNotario = CNotario;
    }
    
    public int getNumeroDeCredito() {
        return this.numeroDeCredito;
    }
    
    public void setNumeroDeCredito(int numeroDeCredito) {
        this.numeroDeCredito = numeroDeCredito;
    }
    public int getNumeroDeCaso() {
        return this.numeroDeCaso;
    }
    
    public void setNumeroDeCaso(int numeroDeCaso) {
        this.numeroDeCaso = numeroDeCaso;
    }
    public Serializable getFechaDeCreacion() {
        return this.fechaDeCreacion;
    }
    
    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    public Serializable getFechaDeCierre() {
        return this.fechaDeCierre;
    }
    
    public void setFechaDeCierre(Date fechaDeCierre) {
        this.fechaDeCierre = fechaDeCierre;
    }
    public Long getProyectoDeCancelacion() {
        return this.proyectoDeCancelacion;
    }
    
    public void setProyectoDeCancelacion(Long proyectoDeCancelacion) {
        this.proyectoDeCancelacion = proyectoDeCancelacion;
    }
    public String getNombreAcreditado() {
        return this.nombreAcreditado;
    }
    
    public void setNombreAcreditado(String nombreAcreditado) {
        this.nombreAcreditado = nombreAcreditado;
    }
    
}


