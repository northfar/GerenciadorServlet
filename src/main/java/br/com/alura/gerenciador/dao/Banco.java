package br.com.alura.gerenciador.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import br.com.alura.gerenciador.pojo.Empresa;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer serialID = 1;
	
	static {
		Empresa _empresa = new Empresa();
		Empresa empresa2 = new Empresa();
		
		_empresa.setId(serialID++);
		empresa2.setId(serialID++);
		
		_empresa.setNome("Alura");
		empresa2.setNome("Caellum");
		_empresa.setDataAbertura(new Date());
		empresa2.setDataAbertura(new Date());
		
		lista.add(_empresa);
		lista.add(empresa2);

	}
	
	public void adicionar(Empresa empresa) {
		empresa.setId(Banco.serialID++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
	public void remover(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
	}
	
public Empresa buscarEmpresaPorId(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				return emp;
			}
		}
		return null;
		
	}
	
	
}
