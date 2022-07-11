package com.troyka.recargas.entity;
// Generated 11/07/2022 01:07:15 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Vendedor generated by hbm2java
 */
public class Vendedor  implements java.io.Serializable {


     private BigDecimal idVendedor;
     private String numDocumento;
     private String nombre;
     private Set facturas = new HashSet(0);

    public Vendedor() {
    }

	
    public Vendedor(BigDecimal idVendedor, String numDocumento, String nombre) {
        this.idVendedor = idVendedor;
        this.numDocumento = numDocumento;
        this.nombre = nombre;
    }
    public Vendedor(BigDecimal idVendedor, String numDocumento, String nombre, Set facturas) {
       this.idVendedor = idVendedor;
       this.numDocumento = numDocumento;
       this.nombre = nombre;
       this.facturas = facturas;
    }
   
    public BigDecimal getIdVendedor() {
        return this.idVendedor;
    }
    
    public void setIdVendedor(BigDecimal idVendedor) {
        this.idVendedor = idVendedor;
    }
    public String getNumDocumento() {
        return this.numDocumento;
    }
    
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


