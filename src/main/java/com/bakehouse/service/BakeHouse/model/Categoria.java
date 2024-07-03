package com.bakehouse.service.BakeHouse.model;

import com.bakehouse.service.BakeHouse.source.bean.Bean;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

@Document(collection = "CATEGORIASB")
public class Categoria extends Bean {

    // @NotBlank(message ="Debe de ingrasar un valor" )
    private String description;
    @NotBlank(message ="Debe de ingrasar un valor" )
    private String code;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

}