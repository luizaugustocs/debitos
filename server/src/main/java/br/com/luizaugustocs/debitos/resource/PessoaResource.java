package br.com.luizaugustocs.debitos.resource;

import br.com.luizaugustocs.debitos.dto.PessoaRecord;
import br.com.luizaugustocs.debitos.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
@AllArgsConstructor
public class PessoaResource {


    private final PessoaService pessoaService;

    @GetMapping
    public Page<PessoaRecord> findAll(Pageable pageable) {
        return this.pessoaService.findAll(pageable).map(PessoaRecord::from);
    }
}
