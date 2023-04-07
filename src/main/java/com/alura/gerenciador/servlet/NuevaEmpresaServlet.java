package com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//se cambia el service del metodo a doPost para solo recibir del post y no por medio de la url visible
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//con el getParameter se obtiene lo que pongamos en la pag despues del singo de " ? "
		
		System.out.println("Nueva Empresa registrada");
		String NuevaEmpresa = request.getParameter("Nombre");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Nueva Empresa Creada: "+ NuevaEmpresa);
		out.println("</body>");
		out.println("</html>");
	}

}
