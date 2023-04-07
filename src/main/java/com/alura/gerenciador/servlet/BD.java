package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class BD {
	
	private static List<RegistrarEmpresa> lista = new ArrayList<>();

	static {
	RegistrarEmpresa empresa1 = new RegistrarEmpresa();
	RegistrarEmpresa empresa2 = new RegistrarEmpresa();
	empresa1.setNombre("Robinson sa");
	empresa2.setNombre("Casita Linda");
	lista.add(empresa1);
	lista.add(empresa2);
	}
	
	public void agregar(RegistrarEmpresa nuevaEmpresa) {
		
		BD.lista.add(nuevaEmpresa);
	}
	
	public List<RegistrarEmpresa> mostrar() {
		return BD.lista;
	}
	
}
