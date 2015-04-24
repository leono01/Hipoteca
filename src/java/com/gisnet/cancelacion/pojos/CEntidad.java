package com.gisnet.cancelacion.pojos;

public class CEntidad  implements java.io.Serializable {


     private long entidadId;
     private String nombre;
     private String clave;
     private Boolean convenio;
     

    public CEntidad() {
    }

	
    public CEntidad(long entidadId) {
        this.entidadId = entidadId;
    }
    public CEntidad(long entidadId, String nombre, String clave, Boolean convenio) {
       this.entidadId = entidadId;
       this.nombre = nombre;
       this.clave = clave;
       this.convenio = convenio;

    }
   
    public long getEntidadId() {
        return this.entidadId;
    }
    
    public void setEntidadId(long entidadId) {
        this.entidadId = entidadId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Boolean getConvenio() {
        return this.convenio;
    }
    
    public void setConvenio(Boolean convenio) {
        this.convenio = convenio;
    }
    
}


