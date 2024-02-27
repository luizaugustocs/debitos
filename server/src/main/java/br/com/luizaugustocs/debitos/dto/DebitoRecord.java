package br.com.luizaugustocs.debitos.dto;

import br.com.luizaugustocs.debitos.domain.Debito;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public record DebitoRecord(Long id, LocalDate dataLancamento, PessoaRecord pessoa, List<ParcelaRecord> parcelas) {

    public static DebitoRecord from(Debito debito) {
        var parcelas = debito.getParcelas().stream().map(ParcelaRecord::from).toList();
        PessoaRecord pessoa = PessoaRecord.from(debito.getPessoa());
        return new DebitoRecord(debito.getId(), debito.getDataLancamento(), pessoa, parcelas);
    }
}
