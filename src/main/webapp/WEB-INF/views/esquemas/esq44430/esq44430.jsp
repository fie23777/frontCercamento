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
		<div class="container"><div>
			<h3>Bem vindo a lista de esquema da lotofácil 1.250 cada, total
				de 22.500</h3>
			<ul>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/34440">Esquema 34440</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/34404">Esquema 34404</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/34044">Esquema 34044</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/30444">Esquema 30444</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/44430">Esquema 44430</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/44403">Esquema 44403</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/44304">Esquema 44304</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/44034">Esquema 44034</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/43044">Esquema 43044</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/40344">Esquema 40344</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/43440">Esquema 43440</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/43404">Esquema 43404</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/40443">Esquema 40443</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/40434">Esquema 40434</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/03444">Esquema 03444</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/04344">Esquema 04344</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/04434">Esquema 04434</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44430/04443">Esquema 04443</a></li>
			</ul>

		</div>
</body>

</html>