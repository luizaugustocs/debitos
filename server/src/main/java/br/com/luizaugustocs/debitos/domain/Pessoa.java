package br.com.luizaugustocs.debitos.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table
@Data
public class Pessoa {

    @Id
    @SequenceGenerator(name = "pessoaIdGenerator", sequenceName = "seq_pessoa")
    private Long id;

    @NotNull
    @CPF
    private String cpf;

    @NotNull
    private String nome;
}
