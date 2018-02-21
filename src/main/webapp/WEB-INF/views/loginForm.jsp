<%@page import="javax.servlet.jsp.tagext.TagLibraryInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="s"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

   <style type="text/css">
        body{
            padding: 60px 0px;
        }
    </style>
</head>
<title>Login da casa do código</title>
</head>

<body>
<div class="container">

	<form:form servletRelativeAction="/login" method="post">
	   <div class="form-group">
	     <label>Email</label>
	     <input type="text" name="username" class="form-control"/>
	   </div>
	   <div class="form-group">
	    <label>Senha</label>
	    <input type="password" name="password" class="form-control"/>
	   </div>
	   <button type="submit" class="btn btn-primary">Logar</button>
	</form:form>
	</div>
</body>
</html>