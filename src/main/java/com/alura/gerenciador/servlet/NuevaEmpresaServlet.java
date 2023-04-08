package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date parse;

	// se cambia el service del metodo a doPost para solo recibir del post y no por
	// medio de la url visible
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegistrarEmpresa empresa = new RegistrarEmpresa();
		BD db = new BD();

		// con el getParameter se obtiene lo que pongamos en la pag despues del singo de
		// " ? "

		System.out.println("Nueva Empresa registrada");
		String NuevaEmpresa = request.getParameter("Nombre");
		String FechaEmpresa = request.getParameter("fecha");
		String[] fechaseparada= FechaEmpresa.split("-");
		String unir=fechaseparada[2]+"/"+fechaseparada[1]+"/"+fechaseparada[0];
		Date fecha=null;
		try {
			SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/YYYY");
			fecha = sdf.parse(unir);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		empresa.setNombre(NuevaEmpresa);
		empresa.setFecha(fecha);
		db.agregar(empresa);

		RequestDispatcher rd = request.getRequestDispatcher("/Mostrar.jsp");
		request.setAttribute("nombre", empresa.getNombre());
		rd.forward(request, response);

	}

}
