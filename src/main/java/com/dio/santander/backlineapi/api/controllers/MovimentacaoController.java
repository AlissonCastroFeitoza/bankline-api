package com.dio.santander.backlineapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.backlineapi.api.dto.NovaMovimentacao;
import com.dio.santander.backlineapi.api.dto.NovoCorrentista;
import com.dio.santander.backlineapi.api.repository.CorrentistaRepository;
import com.dio.santander.backlineapi.api.repository.MovimentacaoRepository;
import com.dio.santander.backlineapi.api.services.CorrentistaService;
import com.dio.santander.backlineapi.api.services.MovimentacaoService;
import com.dio.santander.backlineapi.model.Correntista;
import com.dio.santander.backlineapi.model.Movimentacao;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
  @Autowired
  private MovimentacaoRepository repository;
  
  @Autowired
  private MovimentacaoService service;
  
  @GetMapping
  public List<Movimentacao> findAll(){
	  return repository.findAll();
  }
  @PostMapping
  public void save(@RequestBody NovaMovimentacao movimentacao) {
	  service.save(movimentacao);
  }
}
