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
			<h3>Bem vindo a lista de esquema da lotofácil 18 esquemas com
				50.00 cada total de 900.000</h3>
			<ul class="ulesquema">
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/43332">Esquema 43332</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/43323">Esquema 43323</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/43233">Esquema 43233</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/42333">Esquema 42333</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/33342">Esquema 33342</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/33324">Esquema 33324</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/33423">Esquema 33423</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/33243">Esquema 33243</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/34233">Esquema 34233</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/32433">Esquema 32433</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/34332">Esquema 34332</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/34323">Esquema 34323</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/32334">Esquema 32334</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/32343">Esquema 32343</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/24333">Esquema 24333</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/23433">Esquema 23433</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/23343">Esquema 23343</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq43332/23334">Esquema 23334</a></li>

			</ul>

		</div>
</body>

</html>