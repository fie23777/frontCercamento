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
			<h3>Bem vindo a lista de esquema da lotofácil 5000 cada 90.000
				no total</h3>
			<ul>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/53331">Esquema 53331</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/53313">Esquema 53313</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/53133">Esquema 53133</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/51333">Esquema 51333</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/33351">Esquema 33351</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/33315">Esquema 33315</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/33513">Esquema 33513</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/33153">Esquema 33153</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/35133">Esquema 35133</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/31533">Esquema 31533</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/35331">Esquema 35331</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/35313">Esquema 35313</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/31335">Esquema 31335</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/31353">Esquema 31353</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/15333">Esquema 15333</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/13533">Esquema 13533</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/13353">Esquema 13353</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq53331/13335">Esquema 13335</a></li>

			</ul>

		</div>
</body>

</html>