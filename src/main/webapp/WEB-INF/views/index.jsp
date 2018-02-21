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
      <li><a href="${contextPath}cadastrar/resultados">Cadastrar</a></li>
      <li><a href="${contextPath}listarlotofacil/resultado">Lista de resultados</a></li>
      <li><a href="${contextPath}listarlotofacil/filtrar">Filtar jogos</a></li>
      <li><a href="${contextPath}listarlotofacil/listar22344">Pesquisa de Esquemas</a></li>
      <li><a href="${contextPath}esquemas/esquemas">Esquemas</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div>
</nav>
        <div>
          <h3>Bem vindo ao esquemas da lotofácil</h3>
          
        </div>

</div>
</body>

</html>