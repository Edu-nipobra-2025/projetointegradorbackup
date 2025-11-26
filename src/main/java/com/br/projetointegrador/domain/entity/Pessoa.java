package com.br.projetointegrador.domain.entity;

import com.br.projetointegrador.exception.PessoaException;
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.persistence.Id;


public abstract class Pessoa implements Serializable {
    private String endereco;
    private String cpfCnpj;
    private String nomeCompleto;
    private Date dataNascimento;

    public Pessoa(String endereco, String cpfCnpj, String nome, Date dataNascimento) {
        this.endereco = endereco;
        this.cpfCnpj = cpfCnpj;
        this.nomeCompleto = nome;
        this.setDataNascimento(dataNascimento);
  // usa o setter com validação
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getCpfCnpj() { return cpfCnpj; }
    public void setCpfCnpj(String cpfCnpj) { this.cpfCnpj = cpfCnpj; }

    public String getNome() { return nomeCompleto; }
    public void setNome(String nome) { this.nomeCompleto = nome; }


    public Date getDataNascimento() { return dataNascimento; }

    public void setDataNascimento(Date dataNascimento) {
        Date hoje = new Date();

        if (dataNascimento.after(hoje)) {
            throw new PessoaException.DataNascimentoInvalidaException(
                    "A data de nascimento não pode ser futura. Data fornecida: " + dataNascimento
            );
        }

        this.dataNascimento = dataNascimento;
    }
}
