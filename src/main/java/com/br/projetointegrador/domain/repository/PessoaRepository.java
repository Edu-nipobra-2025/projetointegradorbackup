package com.br.projetointegrador.domain.repository;


import com.br.projetointegrador.domain.entity.Pessoa;

import java.util.Optional;

public interface PessoaRepository {

    public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
        Optional<Pessoa> findByNomeCompleto(String nomeCompleto);

        Optional<Pessoa> findByCpfCnpj(String cpfCnpj);

        boolean existsByCpfCnpj(String cpfCnpj);

        boolean existsByNomeCompleto(String nomeCompleto);
    }

}