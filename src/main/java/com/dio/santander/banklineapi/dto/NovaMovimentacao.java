package com.dio.santander.banklineapi.dto;

import com.dio.santander.banklineapi.model.MovimentaçãoTipo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NovaMovimentacao {

  private String descricao;

  private Double valor;

  private MovimentaçãoTipo tipo;

  private Integer idConta;
}
