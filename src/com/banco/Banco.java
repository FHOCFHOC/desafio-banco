package com.banco;
import java.util.List;
import lombok.Data;


public @Data class Banco {

	private String nome;
	private List<Conta> contas;
	

}
