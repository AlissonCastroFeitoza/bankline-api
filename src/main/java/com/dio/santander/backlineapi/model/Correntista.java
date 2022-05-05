package com.dio.santander.backlineapi.model;

public class Correntista {
   private Integer Id;
   private String cpf;
   private String nome;
   
   private Conta conta;
   
   public Conta getConta() {
	   return conta;
   }
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
   
   
}
