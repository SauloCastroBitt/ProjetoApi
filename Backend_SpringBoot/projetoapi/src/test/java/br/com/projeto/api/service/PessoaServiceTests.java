package br.com.projeto.api.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import br.com.projeto.api.model.Pessoa;
import br.com.projeto.api.repository.PessoaRepository;

@SpringBootTest
public class PessoaServiceTests {

    @Autowired
    private PessoaService pessoaService;

    @MockBean
    private PessoaRepository pessoaRepository;

    @Test
    public void testFindByCpf() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("12345678900");

        when(pessoaRepository.findByCpf("12345678900")).thenReturn(Optional.of(pessoa));

        Optional<Pessoa> foundPessoa = pessoaService.findByCpf("12345678900");
        assertEquals("12345678900", foundPessoa.get().getCpf());
    }
}