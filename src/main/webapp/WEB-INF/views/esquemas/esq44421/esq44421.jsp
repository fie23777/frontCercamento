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
				6.250 cada, total de 112.500</h3>
			<ul>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/14442">Esquema 14442</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/14424">Esquema 14424</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/14244">Esquema 14244</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/12444">Esquema 12444</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/44412">Esquema 44412</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/44421">Esquema 44421</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/44124">Esquema 44124</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/44214">Esquema 44214</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/41244">Esquema 41244</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/42144">Esquema 42144</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq44421/41442">Esquema 41442</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq41424/41424">Esquema 41424</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq42441/42441">Esquema 42441</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq42414/42414">Esquema 42414</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq21444/21444">Esquema 21444</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq24144/24144">Esquema 24144</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq24414/24414">Esquema 24414</a></li>
				<li class="liesquema"><a href="${contextPath}esquemas/esq24441/24441">Esquema 24441</a></li>

			</ul>

		</div>
</body>

</html>