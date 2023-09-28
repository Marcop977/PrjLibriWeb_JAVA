<%@page import="model.Libro"%>
<%@page import="presentation.MVCController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% MVCController controller = new MVCController();  %>

	<h1>Libri</h1>
	
	<a href="provami">Add libro</a>

	<table>
	  <tr>
	    <th>Titolo</th>
	  </tr>
	  
	  <% for (Libro l : controller.mostraLibri()){ %>
	  
		  <tr>
		    <td> <a target="_blank" href="https://www.google.com/search?q=<%= l.getTitolo() %>"><%= l.getTitolo() %></a> </td>
		    <td><a target="_blank" href="https://www.google.com/search?q=<%= l.getPagine() %>"><%= l.getPagine() %></a></td>
		    <td><a target="_blank" href="https://www.google.com/search?q=<%= l.getPrezzo() %>"><%= l.getPrezzo() %></a></td>
		  </tr>
	  
	  <% } %>
	</table>
	

</body>
</html>