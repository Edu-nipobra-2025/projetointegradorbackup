package com.br.projetointegrador.domain.repository;

import com.br.projetointegrador.domain.entity.Carro;
import java.util.Date;
import java.util.Optional;

public interface DespesaRepository {


    public interface PessoaRepository extends JpaRepository<Carro, Long> {
        Optional<Carro> findByTipoDespesa(String tipoDespesa);

        Optional<Carro> findByDataAlteracaoDespesa(Date dataAlteracaoDespesa);

        Optional<Carro> findByStatuysDocumentacao (String statusDocumentacao);

        Optional<Carro> findByStatusManutencao (String statusManutencao);

        boolean existsPlaca(String placa);

        boolean existsByAlteracaoDespesa(Date dataAlteracaoDespesa);;

        boolean existsByStatuysDocumentacao (String statusDocumentacao);

        boolean existsByStatusManutencao (String statusManutencao);
    }

