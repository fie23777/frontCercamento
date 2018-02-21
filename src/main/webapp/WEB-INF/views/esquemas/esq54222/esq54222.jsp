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
			<h3>Bem vindo a lista de esquema da lotofácil 18 combinações,
				5.000 cada, total de 90.000</h3>
			<ul>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/52224">Esquema 52224</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/52242">Esquema 52242</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/52422">Esquema 52422</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/54222">Esquema 54222</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/22254">Esquema 22254</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/22245">Esquema 22245</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/22542">Esquema 22542</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/22452">Esquema 22452</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/25422">Esquema 25422</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/24522">Esquema 24522</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/25224">Esquema 25224</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/25242">Esquema 25242</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/24225">Esquema 24225</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/24252">Esquema 24252</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/45222">Esquema 45222</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/42522">Esquema 42522</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/42252">Esquema 42252</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq54222/42225">Esquema 42225</a></li>

			</ul>

		</div>
</body>

</html>