package com.alura.gerenciador.servlet;

import java.util.Date;

public class RegistrarEmpresa {
	private Integer id;
	private String Nombre;
	private Date fecha= new Date();
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
