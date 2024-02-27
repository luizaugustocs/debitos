package br.com.luizaugustocs.debitos.service;

import br.com.luizaugustocs.debitos.domain.Pessoa;
import br.com.luizaugustocs.debitos.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PessoaService {

    private PessoaRepository pessoaRepository;



    public Page<Pessoa> findAll(Pageable pageable) {
        return this.pessoaRepository.findAll(pageable);
    }


}
