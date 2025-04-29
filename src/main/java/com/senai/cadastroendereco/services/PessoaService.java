package com.senai.cadastroendereco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Pessoa;
import com.senai.cadastroendereco.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;
	
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> listarTodos() {
		return pessoaRepository.findAll();
	}
	
	public Pessoa buscarPorId(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}
	
	public void deletarPorId(Long id) {
		pessoaRepository.deleteById(id);
	}
	
	public Pessoa buscarPorEmail(String email) {
		return pessoaRepository.findByEmail(email);
	}
	
	public Pessoa autenticarPessoa(String email, String senha) {
		Pessoa pessoa = pessoaRepository.findByEmail(email);
		
		if(pessoa != null && pessoa.getSenha().equals(senha)) {
			return pessoa;
		} else {
			return null;
		}
	}
	
}
