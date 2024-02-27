package br.com.luizaugustocs.debitos.dto;

import br.com.luizaugustocs.debitos.domain.Pessoa;

public record PessoaRecord(Long id, String cpf, String nome) {

    public static PessoaRecord from(Pessoa pessoa) {
        return new PessoaRecord(pessoa.getId(), pessoa.getCpf(), pessoa.getNome());
    }
}
