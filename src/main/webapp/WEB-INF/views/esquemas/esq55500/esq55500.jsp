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
  <%@include file="/WEB-INF/views/esquemas/cabecalhoEsq.jsp" %>
</head>

<body>

	<div class="container">
		<h3>Bem vindo a lista de esquema da lotofácil 10 esquemas um cada</h3>
		<ul>
                <li class="liesquema"><a href="${contextPath}esquemas/esq55500/55500">Esquema 55500</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/55050">Esquema 55050</a></li>
			    <li class="liesquema"><a href="${contextPath}esquemas/esq55500/55005">Esquema 55005</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/50505">Esquema 50505</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/50550">Esquema 50550</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/50055">Esquema 50055</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/05055">Esquema 05055</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/05505">Esquema 05505</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/05550">Esquema 05550</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq55500/00555">Esquema 00555</a></li>
		</ul>

	</div>

</body>

</html>