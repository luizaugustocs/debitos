package br.com.luizaugustocs.debitos.service;

import br.com.luizaugustocs.debitos.domain.Debito;
import br.com.luizaugustocs.debitos.domain.Pessoa;
import br.com.luizaugustocs.debitos.repository.DebitoRepository;
import br.com.luizaugustocs.debitos.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DebitoService {

    private DebitoRepository debitoRepository;



    public Page<Debito> findAll(Pageable pageable) {
        return this.debitoRepository.findAll(pageable);
    }


}
