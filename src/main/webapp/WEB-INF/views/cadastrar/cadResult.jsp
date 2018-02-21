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
      <li><a href="${contextPath}listarlotofacil/resultado">Lista de resultados</a></li>
      <li><a href="${contextPath}listarlotofacil/filtrar">Filtar jogos</a></li>
        <li><a href="${contextPath}listarlotofacil/listar22344">Esquemas</a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div>
</nav>
			<div class="container">
			
			<a href="addresulttxt">cadastrar resultados do txt</a>
			
				<h2>Cadastrar resultados da lotofácil</h2>
				
					 <form:form id="form-adiciona" action="${s:mvcUrl('CC#listarResult').build() }" method="post">
					 
							<label for="filtrar-tabela">Filtar:</label>
							<input type="text" class="form-control" name="nunConcurso" id="filtrar-tabela" placeholder="Digite o número do concurso">
							<button id="lotofacil" class="btn btn-primary">Buscar por concurso</button>
							<table class="table">
								<thead>
									<tr>
										<th>Resultado lotofacil</th>
										<th>Concurso:</th>
									</tr>
								</thead>
						           <tbody class="container">
			
									   <c:forEach items="${resultados }" var="resultado">
												<tr class="resultados" id="resultados" >
													<td class="info-resultado">${resultado.resultado }</td>
										            <td class="info-concurso">${resultado.nunConcurso }</td>
												</tr>
								      </c:forEach> 
								</tbody>
							</table>
			        </form:form>
			</div>
		<div class="container">
		    <h2 id="titulo-form">Adicionar Resultado</h2>

				<ul id="mensagens-erros">

				</ul>
		    <form:form id="form-adiciona" action="${s:mvcUrl('CC#gravar').build() }" method="post">
		        <div class="">
		          <label for="nunConcurso">Numero do concurso:</label>
		            <input id="resultado" class="form-control" name="nunConcurso" type="text" placeholder="digite o numero do concurso">
		          <label for="resultado">Resultado:</label>
		            <input id="resultado" class="form-control" name="resultado" type="text" placeholder="digite o resultado da lotofácio">

		        </div>

						<button id="lotofacil" class="btn btn-primary">Cadastrar Resultados</button>

		    </form:form>
		</div>
</div>
</body>

	<script src="js/calcula-imc.js"></script>

</html>
