<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/COMGM001.js" />"></script>
		<title>COMGM001 ログイン画面</title>
	</head>
	<body>
    	<form:form modelAttribute="COMGM001Form">
                <form:input path="user_id" />
                <form:input path="password" />
    		<input type="submit" class="btn btn-primary" value="ログイン" name="entryComGm001">
    	</form:form>
        </body>
</html>
