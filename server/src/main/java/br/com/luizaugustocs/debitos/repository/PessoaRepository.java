package br.com.luizaugustocs.debitos.repository;

import br.com.luizaugustocs.debitos.domain.Pessoa;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, Long> {
}
