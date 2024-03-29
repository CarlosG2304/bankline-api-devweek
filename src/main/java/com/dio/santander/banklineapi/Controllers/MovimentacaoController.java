package com.dio.santander.banklineapi.Controllers;

import java.util.List;

import com.dio.santander.banklineapi.dto.NovaMovimentacao;
import com.dio.santander.banklineapi.model.Movimentacao;
import com.dio.santander.banklineapi.repository.MovimentacaoRepository;
import com.dio.santander.banklineapi.service.MovimentacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

  @Autowired
  private MovimentacaoRepository repository;

  @Autowired
  private MovimentacaoService movimentacaoService;

  @GetMapping
  public List<Movimentacao> findAll() {
    return repository.findAll();
  }

  @PostMapping
  public void save(@RequestBody NovaMovimentacao novaMovimentacao) {

    movimentacaoService.save(novaMovimentacao);
  }

  @GetMapping("/{idConta}")
  public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta) {
    return repository.findByIdConta(idConta);
  }

}
