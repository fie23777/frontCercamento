<%@page import="javax.servlet.jsp.tagext.TagLibraryInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="s"  %>

  <!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
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
      <li><a href="${contextPath}listarlotofacil/resultado">Lista de resultados</a></li>
        <li><a href="${contextPath}listarlotofacil/listar22344">Esquemas</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div>
</nav>
        <div>
          <h3>Digite os numeros a serem removido das combinações</h3>
        </div>
		<div>
		<form:form action="${s:mvcUrl('ELC#listar').build() }" method="post">
		                <label>Linha 1
		    <input type="text" class="box-shadow" name="linha1" value ="${linha1 }"size="3">
		    </label>
		    		    <label>Linha 2
		    <input type="text" class="box-shadow" name="linha2"value ="${linha2 }"size="3">
		    </label>
		    		    <label>Linha 3
		    <input type="text" class="box-shadow" name="linha3"value ="${linha3 }"size="3">
		    </label>
		    		    <label>Linha 4
		    <input type="text" class="box-shadow" name="linha4"value ="${linha4 }"size="3">
		    </label>
		    		    <label>Linha 5
		    <input type="text" class="box-shadow" name="linha5"value ="${linha5 }"size="3">
		    </label>
		    <input type="submit" value="Filtrar" id="botaoFiltrar"><br />
		    <span id="msg"></span>
		    <span class="numtirado" style="color:red;"> ${linha1 }</span>
		    <span class="numtirado" style="color:red;"> ${linha2 }</span>
		    <span class="numtirado" style="color:red;"> ${linha3 }</span>
		    <span class="numtirado" style="color:red;"> ${linha4 }</span>
		    <span class="numtirado" style="color:red;"> ${linha5 }</span>
		</form:form>
		  <table class="table" style="width:320px;">
		   <tr> 
			    <th>[Esquemas]</th>
		   </tr>
		      <c:forEach items="${numFilter }" var="numero">
			      <tr>
			        <td>${numero }</td>
			      </tr>
		      </c:forEach> 
		   </table>
		 </div>
		 </div>
</body>

</html>