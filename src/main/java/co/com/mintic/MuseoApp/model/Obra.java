/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mintic.MuseoApp.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jccas
 */
@Entity
@Table(name = "obra")
public class Obra {
    
    @Id   
    @Column(name="obr_id")
    private Long obrId;   
    
    @Column(name="obr_nombre")
    private String obrNombre;
    
    @Column(name="obr_tipo")
    private String obrTipo; 
    
    @Column(name="obr_costo")
    private Double obrCosto;
    
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "exp_id")
    private Exposicion exposicion;  
    
    @OneToMany(mappedBy = "presentacionId.obra", fetch = FetchType.EAGER)
    List<Presentacion> presentaciones;

    public Long getObrId() {
        return obrId;
    }

    public void setObrId(Long obrId) {
        this.obrId = obrId;
    }

    public String getObrNombre() {
        return obrNombre;
    }

    public void setObrNombre(String obrNombre) {
        this.obrNombre = obrNombre;
    }

    public String getObrTipo() {
        return obrTipo;
    }

    public void setObrTipo(String obrTipo) {
        this.obrTipo = obrTipo;
    }

    public Double getObrCosto() {
        return obrCosto;
    }

    public void setObrCosto(Double obrCosto) {
        this.obrCosto = obrCosto;
    }

    public Exposicion getExposicion() {
        return exposicion;
    }

    public void setExposicion(Exposicion exposicion) {
        this.exposicion = exposicion;
    }

    public List<Presentacion> getPresentaciones() {
        return presentaciones;
    }

    public void setPresentaciones(List<Presentacion> presentaciones) {
        this.presentaciones = presentaciones;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
    
    
    

    
    @Override
    public String toString() {
        return "Obra{" + "obr_id=" + obrId + ", obr_nombre=" + obrNombre + ", obr_tipo=" + obrTipo + ", obr_costo=" + obrCosto + '}';
    }
    
      
    

    
    
    
    
}
