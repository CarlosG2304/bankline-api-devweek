package com.dio.santander.banklineapi.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movimentação {
  private Integer id;
  private LocalDateTime dataHora;
  private String descricao;
  private Double valor;
  private MovimentaçãoTipo tipo;
}
