package br.com.luizaugustocs.debitos.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Debito {

    @Id
    private Long id;

    private LocalDate dataLancamento;

    @ManyToOne
    @JoinColumn(name="id_pessoa")
    private Pessoa pessoa;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "debito")
    @JsonIgnoreProperties({"debito"})
    private List<Parcela> parcelas = new ArrayList<>();

}
