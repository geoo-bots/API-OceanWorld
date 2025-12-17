package br.com.oceanworld.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.oceanworld.api.model.Atracao;

@Repository
public interface AtracaoRepository extends JpaRepository<Atracao,Long> {
    
}
