package com.br.projetointegrador.enums;

public enum TipoPessoa {
    FISICA ("Pessoa física"),
    JURIDICA ("Pessoa juridica");

private final String descricao;

private TipoPessoa(String descricao) {
    this.descricao = descricao;
}

public String getDescricao() {
    return descricao;
}
}