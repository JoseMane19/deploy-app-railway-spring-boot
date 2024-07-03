package com.bakehouse.service.BakeHouse.source.bean;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import jakarta.validation.constraints.NotBlank;

public class Bean {
    
    @Id
    private String id;
    @NotBlank(message ="Debe de ingrasar un valor" )
    private String nombre;
    private boolean activo = true;
    private LocalDate fecharegistro;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public LocalDate getFecharegistro() {
        return fecharegistro;
    }
    public void setFecharegistro(LocalDate fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

}