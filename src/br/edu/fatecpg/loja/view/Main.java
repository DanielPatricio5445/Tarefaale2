package br.edu.fatecpg.loja.view;

import br.edu.fatecpg.loja.model.Faxineiro;
import br.edu.fatecpg.loja.model.Gerente;

public class Main {

	public static void main(String[] args) {
		Faxineiro fax = new Faxineiro();
		Gerente gen = new Gerente();
		fax.solicitarMaterial(); 
		gen.baterPonto(); 
		gen.realizarVenda(); 
		gen.fecharCaixa(); 
		
	}

}
