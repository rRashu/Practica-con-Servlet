package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GuardarModificadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Nombre = request.getParameter("Nombre");
		String Fecha = request.getParameter("Fecha");
		String Id = request.getParameter("Id");
		RegistrarEmpresa empresa = new RegistrarEmpresa(Id,Nombre,Fecha);
		BD bd =new BD();
		bd.guardarModificado(empresa);
		response.sendRedirect("ListarEmpresa");
	}
}
