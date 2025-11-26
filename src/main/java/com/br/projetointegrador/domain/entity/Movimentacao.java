package com.br.projetointegrador.domain.entity;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.persistence.Id;

public class Movimentacao {

    private String movimento;
    @NotNull
    @Column(name = "Data da movimentacao",)
    private Date dataMovimentacao;
    @NotNull
    @Column(name = "Status da movimentacao",)
    private String statusMovimento;

    public Movimentacao(String movimento, String statusMovimento){


    }
    public String getStatusMovimento() {
        return statusMovimento;
    }

    public void setStatusMovimento(String statusMovimento) {
        this.statusMovimento = statusMovimento;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }
}
