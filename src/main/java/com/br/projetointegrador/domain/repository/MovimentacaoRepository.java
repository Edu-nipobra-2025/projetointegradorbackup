package com.br.projetointegrador.domain.repository;

<<<<<<< HEAD
import com.br.projetointegrador.domain.entity.pessoa;

import java.util.Optional;

public interface MovimentacaoRepository {

    public interface PessoaRepository extends JpaRepository<pessoa, Long> {
        Optional<pessoa> findByStatusFinanceiro(String statusFinanceiro);

        boolean existsByStatusFinanceiro (String statusFinanceiro);
    }

=======
public interface MovimentacaoRepository {

}
