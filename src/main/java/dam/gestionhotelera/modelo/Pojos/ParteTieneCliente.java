package dam.gestionhotelera.modelo.Pojos;
// Generated 02-dic-2017 19:12:02 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ParteTieneCliente generated by hbm2java
 */
public class ParteTieneCliente  implements java.io.Serializable {


     private Integer idparteTieneCliente;
     private Cliente cliente;
     private Parte parte;
     private Date fechaInicio;
     private Date fechaFin;

    public ParteTieneCliente() {
    }

	
    public ParteTieneCliente(Cliente cliente, Parte parte) {
        this.cliente = cliente;
        this.parte = parte;
    }
    public ParteTieneCliente(Cliente cliente, Parte parte, Date fechaInicio, Date fechaFin) {
       this.cliente = cliente;
       this.parte = parte;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
    }
   
    public Integer getIdparteTieneCliente() {
        return this.idparteTieneCliente;
    }
    
    public void setIdparteTieneCliente(Integer idparteTieneCliente) {
        this.idparteTieneCliente = idparteTieneCliente;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Parte getParte() {
        return this.parte;
    }
    
    public void setParte(Parte parte) {
        this.parte = parte;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }




}


