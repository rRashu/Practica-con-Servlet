package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class ModificarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		BD bd = new BD();
		RegistrarEmpresa empresa = bd.buscarEmpresa(id);
		RequestDispatcher rd = request.getRequestDispatcher("/Modificar.jsp");

		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

		String fecha = formato.format(empresa.getFecha());
		

		String[] fechaseparada = fecha.split("/");
		String unir = fechaseparada[0] + "-" + fechaseparada[1] + "-" + fechaseparada[2];
		request.setAttribute("fecha", unir);
		request.setAttribute("empresa", empresa);
		rd.forward(request, response);
	}

}
