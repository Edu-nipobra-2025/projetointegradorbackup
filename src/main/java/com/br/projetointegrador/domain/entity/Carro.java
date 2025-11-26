package com.br.projetointegrador.domain.entity;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import com.br.projetointegrador.domain.entity.Pessoa;

public class Carro {

    @NotNull
    @Column(name = "Placa do Carro", length = 7, nullable = false)
    private String placa;
    @NotNull
    @Column(name = "Ano de fabricação", nullable = false)
    private String anoFabricacao;
    private String tipoCarro;
    @NotNull
    @Column(name = "data_nascimento", nullable = false)
    private Date dataRegistro;

    private Pessoa proprietario; //observar
    @Column (name = "ativo", nullable = false)
    private boolean statusAtivo;

    public Carro(String placa, String anoFabricacao, String tipoCarro, Date dataRegistro, Pessoa proprietario, boolean statusAtivo) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.tipoCarro = tipoCarro;
        this.dataRegistro = dataRegistro;
        this.proprietario = proprietario;
        this.statusAtivo = statusAtivo;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(String anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public String getTipoCarro() { return tipoCarro; }
    public void setTipoCarro(String tipoCarro) { this.tipoCarro = tipoCarro; }

    public Date getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(Date dataRegistro) { this.dataRegistro = dataRegistro; }

    public Pessoa getProprietario() { return proprietario; }
    public void setProprietario(Pessoa proprietario) { this.proprietario = proprietario; }

    public boolean isStatusAtivo() { return statusAtivo; }
    public void setStatusAtivo(boolean statusAtivo) { this.statusAtivo = statusAtivo; }
}

