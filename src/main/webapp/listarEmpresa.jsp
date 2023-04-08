<%@ page import="com.alura.gerenciador.servlet.RegistrarEmpresa"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Las Empresa</title>
</head>
<body>
	Listado de las empresas
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${ empresa.nombre }    -    <fmt:formatDate value="${empresa.fecha}" pattern="dd/MM/YYYY"/> </li>
		</c:forEach>

	</ul>




</body>
</html>