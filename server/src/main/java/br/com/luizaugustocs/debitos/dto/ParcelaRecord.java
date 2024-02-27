package br.com.luizaugustocs.debitos.dto;

import br.com.luizaugustocs.debitos.domain.Parcela;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ParcelaRecord(Long id, Long numero, LocalDate dataVencimento, BigDecimal valor) {

    public static ParcelaRecord from(Parcela parcela) {
        return new ParcelaRecord(parcela.getId(), parcela.getNumero(), parcela.getDataVencimento(), parcela.getValor());
    }
}
