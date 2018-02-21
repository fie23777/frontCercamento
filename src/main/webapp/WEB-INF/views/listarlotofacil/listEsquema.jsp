<%@page import="javax.servlet.jsp.tagext.TagLibraryInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="s"  %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	  <meta charset="UTF-8">
	  <title>jcjCercamento</title>
	  <c:url value="/" var="contextPath" />
	 <script type="text/javascript"
	   src="${contextPath}resources/js/cercar.js">
	 </script>
	 <link rel="stylesheet" href="${contextPath}resources/css/bootstrap.min.css">
</head>
	<body>

<div class="container">
<nav class="navbar navbar-inverse">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <li><a href="${contextPath}">Home</a></li>
      <li><a href="${contextPath}cadastrar/resultados">Cadastrar</a></li>
      <li><a href="${contextPath}listarlotofacil/filtrar">Filtar jogos</a></li>
        <li><a href="${contextPath}listarlotofacil/listar22344">Esquemas</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div>
</nav>
		<main>
	<section class="container">
				
		 <form:form id="form-adiciona" action="${s:mvcUrl('EC#listarEsquema').build() }" method="post">
		 
	            <h2>Lista dos resultados com seus esquema</h2>
				<table class="table">
					<thead>
						<tr>
							<th>Resultado lotofacil</th>
							<th>Concurso</th>
							<th>Esquema</th>
						</tr>
					</thead>
			           <tbody id="tabela-resultado">

						   <c:forEach items="${esquema }" var="resultado">
									 <tr class="resultados" id="resultados" >
										<td class="info-resultado">${resultado.resultado }</td>
										<td class="info-resultado">${resultado.concurso }</td>
										<td class="info-resultado">${resultado.esquema }</td>
									</tr>
					      </c:forEach> 
					</tbody>
				</table>
        </form:form>
			</section>
		</main>
</div>
</body>

	<script src="js/calcula-imc.js"></script>

</html>
