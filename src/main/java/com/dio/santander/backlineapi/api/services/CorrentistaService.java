package com.dio.santander.backlineapi.api.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.backlineapi.api.dto.NovoCorrentista;
import com.dio.santander.backlineapi.api.repository.CorrentistaRepository;
import com.dio.santander.backlineapi.model.Conta;
import com.dio.santander.backlineapi.model.Correntista;

@Service
public class CorrentistaService {
	@Autowired
    private CorrentistaRepository repository;
  public void save(NovoCorrentista  novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		
		repository.save(correntista);
		
  }
}
