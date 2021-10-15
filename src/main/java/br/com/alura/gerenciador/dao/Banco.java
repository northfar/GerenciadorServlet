package br.com.alura.gerenciador.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.alura.gerenciador.pojo.Empresa;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa _empresa = new Empresa();
		Empresa empresa2 = new Empresa();
		
		_empresa.setNome("Alura");
		empresa2.setNome("Caellum");
		_empresa.setDataAbertura(new Date());
		empresa2.setDataAbertura(new Date());
		
		lista.add(_empresa);
		lista.add(empresa2);

	}
	
	public void adicionar(Empresa empresa) {
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
	
}
