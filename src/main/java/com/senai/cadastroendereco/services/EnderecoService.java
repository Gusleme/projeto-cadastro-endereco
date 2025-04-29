package com.senai.cadastroendereco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Endereco;
import com.senai.cadastroendereco.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco salvar(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

	public List<Endereco> listarTodos() {
		return enderecoRepository.findAll();
	}

	public Optional<Endereco> buscarPorId(Long id) {
		return enderecoRepository.findById(id);
	}

	public void deletarPorId(Long id) {
		enderecoRepository.deleteById(id);
	}
}
