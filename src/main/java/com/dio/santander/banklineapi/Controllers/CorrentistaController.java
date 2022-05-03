package com.dio.santander.banklineapi.Controllers;

import java.util.List;

import com.dio.santander.banklineapi.dto.NovoCorrentista;
import com.dio.santander.banklineapi.model.Correntista;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import com.dio.santander.banklineapi.service.CorrentistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

  @Autowired
  private CorrentistaRepository correntistaRepository;

  @Autowired
  private CorrentistaService service;

  @GetMapping
  public List<Correntista> findAll() {
    return correntistaRepository.findAll();
  }

  @PostMapping
  public void save(@RequestBody NovoCorrentista correntista) {
    service.save(correntista);

  }

}
