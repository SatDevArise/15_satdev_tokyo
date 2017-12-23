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
		<script src="<c:url value="/resources/js/COMGM002.js" />"></script>
		<title>COMGM002 メニュー画面</title>
	</head>
	<body>
	<spring:url value="/initComGm002" var="actionUrl"/>
    <form:form modelAttribute="COMGM002Form">

<br><br><br><br><br>
		 	　<input type="submit" class="btn btn-default" value="社員情報一覧表示　　　" name="goSijGm001" formaction="${actionUrl}">　　　　社員情報一覧を表示<br><br>
			　<input type="submit" class="btn btn-default" value="社員情報新規登録・編集" name="goSijGm002" formaction="${actionUrl}">　　　　社員情報を登録編集<br><br>
			　<input type="submit" class="btn btn-default" value="現場情報一覧表示　　　" name="goGbjGm001" formaction="${actionUrl}">　　　　現場情報一覧を表示<br><br>
			　<input type="submit" class="btn btn-default" value="現場情報新規登録・編集" name="goGbjGm002" formaction="${actionUrl}">　　　　現場情報を登録編集<br><br>
			　<input type="submit" class="btn btn-default" value="システム管理　　　　　" name="goGbjGm002" formaction="${actionUrl}">　　　　システム情報を管理<br><br>
			　<input type="submit" class="btn btn-default" value="ログアウト" name="goGbjGm002" formaction="${actionUrl}"><br><br>
    </form:form>

	</body>
</html>
