package br.com.oceanworld.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.oceanworld.api.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository <Venda, Long>{
    
}
