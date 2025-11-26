package com.br.projetointegrador.domain.repository;


import com.br.projetointegrador.domain.entity.Carro;
import com.br.projetointegrador.domain.entity.Pessoa;
import org.springframework.dData.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    Optional<Carro> findByPlaca(String placa);

    Optional<Carro> findByDataRegistro(Date dataRegistro);

    Optional<Carro> findByProprietario(Pessoa proprietario);

    Optional<Carro> findByStatusAtivo(boolean statusAtivo);

    boolean existsByPlaca(String placa);

    boolean existsByDataRegistro(Date dataRegistro);

    boolean existsByProprietario(Pessoa proprietario);

    boolean existsByStatusAtivo(boolean statusAtivo);
}
