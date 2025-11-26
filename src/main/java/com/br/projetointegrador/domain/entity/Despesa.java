package com.br.projetointegrador.domain.entity;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.persistence.Id;
public class Despesa {
    @Id
    private String idTipoDespesa;
    @NotNull
    @Column(name = "Data de alteração de despesa", nullable = false)
    private Date dataAlteracaoDespesa;
    @NotNull
    @Column(name = "Status do documento",)
    private String statusDocumentacao;
    @NotNull
    @Column(name = "Status da manutenção")
    private String statusManutencao;

    public Despesa(String tipoDespesa, Date dataAlteracaoDespesa, String statusDocumentacao, String statusManutencao) {

    }
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public Date getDataAlteracaoDespesa() {
        return dataAlteracaoDespesa;
    }

    public void setDataAlteracaoDespesa(Date dataAlteracaoDespesa) {
        this.dataAlteracaoDespesa = dataAlteracaoDespesa;
    }

    public String getStatusDocumentacao() {
        return statusDocumentacao;
    }

    public void setStatusDocumentacao(String statusDocumentacao) {
        this.statusDocumentacao = statusDocumentacao;
    }

    public String getStatusManutencao() {
        return statusManutencao;
    }

    public void setStatusManutencao(String statusManutencao) {
        this.statusManutencao = statusManutencao;
    }

}
