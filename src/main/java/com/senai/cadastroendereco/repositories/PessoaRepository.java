package com.senai.cadastroendereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.cadastroendereco.entities.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Long>{

	Pessoa findByEmail(String email);
}
