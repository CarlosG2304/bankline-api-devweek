package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.Contato;
import com.dio.santander.banklineapi.model.Endereco;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NovoCorrentista {

  @NotEmpty(message = "O nome não pode estar em branco")
  private String nome;

  private String cpf;

  private Endereco endereco;

  private List<Contato> contatos;
}
