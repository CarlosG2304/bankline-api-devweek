package com.dio.santander.banklineapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(name = "data_hora")
  private LocalDateTime dataHora;

  private String descricao;

  private Double valor;

  @Enumerated(EnumType.STRING)
  private MovimentaçãoTipo tipo;

  @Column(name = "id_conta")
  private Integer idConta;
}
