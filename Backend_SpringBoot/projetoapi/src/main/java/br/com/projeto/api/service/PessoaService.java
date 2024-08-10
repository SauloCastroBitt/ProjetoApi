package br.com.projeto.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public Optional<Pessoa> findById(Long id) {
		return pessoaRepository.findById(id);
	}

	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public void deleteById(Long id) {
		pessoaRepository.deleteById(id);
	}

	public Optional<Pessoa> findByCpf(String cpf) {
		return pessoaRepository.findByCpf(cpf);
	}
}
