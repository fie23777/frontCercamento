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
 <%@include file="/WEB-INF/views/esquemas/cabecalhoEsq.jsp" %>
		<div>
		<form:form action="${s:mvcUrl('FEC#listEsqLotofacil44412').build() }" method="post">
		    <label>Filtro
		    <input type="text" class="box-shadow" name="esqParam">
		    </label>
		    <input type="submit" class="box-shadow" value="Filtrar">
		</form:form>
		  <table class="table table-bordered table-striped table-hover" style="width:300px;">
		   <tr> 
			    <th>[Esquemas]</th>
		   </tr>
		      <c:forEach items="${fieEsqLista }" var="numero">
			      <tr>
			        <td>${numero.numEsq44412 }</td>
			      </tr>
		      </c:forEach> 
		   </table>
		 </div>

	</div>

	
	
</body>
</html>