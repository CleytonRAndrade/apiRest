package com.elotech.api.apiRest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elotech.api.apiRest.domain.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}