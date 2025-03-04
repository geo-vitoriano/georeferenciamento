package com.projeto.georeferenciamento.domain;

public enum Tipo {
    NAOAPLICA("Não se aplica");

    private String descricao;
    Tipo(String descricao) {
        this.descricao = descricao;
    }
}
