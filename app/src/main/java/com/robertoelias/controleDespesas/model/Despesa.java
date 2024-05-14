package com.robertoelias.controleDespesas.model;

import java.io.Serializable;

public class Despesa implements Serializable {

        private Long id;
        private String nomeDespesa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDespesa() {
        return nomeDespesa;
    }

    public void setNomeDespesa(String nomeDespesa) {
        this.nomeDespesa = nomeDespesa;
    }
}
