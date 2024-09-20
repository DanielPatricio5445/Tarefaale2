package br.edu.fatecpg.loja.model;

public abstract class Vendedor implements Funcionario{
	public void baterPonto() {
		System.out.println("Ponto registrado!");
		
	}
	public void realizarVenda() {
		System.out.println("Vendeu!");
		
	}
}
