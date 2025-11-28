package com.br.projetointegrador.enums;

public enum TipoCarro {

    HIBRIDO("Tanto movido por gasolina quanto etanol"),
    GASOLINA("Movido à gasolina."),
    ETANOL("Movido à etanol");

    private final String descricao;

    private TipoCarro(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}


