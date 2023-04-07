package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//ejemplo
public class ListarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<RegistrarEmpresa> lista = new BD().mostrar();
		
		out.println("<html><boddy>");
		out.println("Listado de empresas");
		out.println("<ul>");
		
		for (RegistrarEmpresa registrarEmpresa : lista) {
			out.println("<li>"+registrarEmpresa.getNombre()+"</li>");
		}
		out.println("</ul>");
		out.println("</boddy></html>");
		
	}

}
