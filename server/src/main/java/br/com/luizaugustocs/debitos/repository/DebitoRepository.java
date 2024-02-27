package br.com.luizaugustocs.debitos.repository;

import br.com.luizaugustocs.debitos.domain.Debito;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitoRepository extends PagingAndSortingRepository<Debito, Long> {
}
