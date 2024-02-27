package br.com.luizaugustocs.debitos.resource;

import br.com.luizaugustocs.debitos.domain.Debito;
import br.com.luizaugustocs.debitos.dto.DebitoRecord;
import br.com.luizaugustocs.debitos.dto.PessoaRecord;
import br.com.luizaugustocs.debitos.repository.DebitoRepository;
import br.com.luizaugustocs.debitos.service.DebitoService;
import br.com.luizaugustocs.debitos.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debito")
@AllArgsConstructor
public class DebitoResource {


    private final DebitoService debitoService;

    @GetMapping
    public Page<DebitoRecord> findAll(Pageable pageable) {
        return this.debitoService.findAll(pageable).map(DebitoRecord::from);
    }
}
