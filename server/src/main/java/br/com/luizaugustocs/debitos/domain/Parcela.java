package br.com.luizaugustocs.debitos.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
@Data
public class Parcela {

    @Id
    private Long id;

    private Long numero;

    private LocalDate dataVencimento;

    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "id_debito")
    private Debito debito;

}
