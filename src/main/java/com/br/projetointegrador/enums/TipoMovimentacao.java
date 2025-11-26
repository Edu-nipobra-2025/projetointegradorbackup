package com.br.projetointegrador.enums;

public enum TipoMovimentacao {
    BANCARIA ("Movimentação Bancária"),
    FISICA("Movimentação Física");

private final String descricao;

private TipoMovimentacao(String descricao) {
    this.descricao = descricao;
}

public String getDescricao() {
    return descricao;
    }
}