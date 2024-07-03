package com.bakehouse.service.BakeHouse.model;

import com.bakehouse.service.BakeHouse.source.bean.Bean;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Document(collection = "CLIENTEBAKE")
@Validated
public class Cliente extends Bean {

    @NotBlank(message = "Debe de ingrasar un valor")
    private String apellido;

    @NotBlank(message = "Debe de ingrasar un valor")
    private String direccion;
    private String tel;

    @NotBlank(message = "Debe de ingrasar un valor")
    private String ruta;

    @NotBlank(message = "Debe de ingrasar un valor")
    private String barcode;

    @NotBlank(message = "Debe de ingrasar un valor")
    private String observacion;

    @NotNull
    @NotBlank(message = "Debe de ingrasar un valor")
    private String colonia;

    @NotBlank(message = "Debe de ingrasar un valor")
    private String municipio;

    private boolean clienteadmon = false;

    private String frecuenciapago;

    public Cliente() {
        super();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public boolean isClienteadmon() {
        return clienteadmon;
    }

    public void setClienteadmon(boolean clienteadmon) {
        this.clienteadmon = clienteadmon;
    }

    public String getFrecuenciapago() {
        return frecuenciapago;
    }

    public void setFrecuenciapago(String frecuenciapago) {
        this.frecuenciapago = frecuenciapago;
    }

}

