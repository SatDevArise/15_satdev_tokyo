<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/css/layout.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/GBJGM002.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/GBJGM002.js" />"></script>
		<title>GBJGM002 現場情報新規登録・編集画面</title>
	</head>
	<body>
<!-- 		<div class = "title">社員情報管理システム</div> -->
	<header>
		<h1>現場情報新規登録・編集画面</h1>
	</header>

		<div id="error_hyoji"></div>
	    <spring:url value="/initGbjGm002" var="actionUrl"/>
    	<form:form modelAttribute="GBJGM002Form" id ="register" name = "GBJ002">
    		現場ID&emsp;&nbsp;：<form:input class = "textarea1" path = "genba_id" id = "genba_id"/><br>
    		現場名&emsp;&nbsp;：<form:input class = "textarea2" path = "genba_na" id = "genba_na"/><br>
    		住所&emsp;&emsp;&nbsp;：<form:input class = "textarea3" path = "address" id = "address"/><br>
    		最寄駅&emsp;&nbsp;：<form:input class = "textarea4" path = "moyori_1_station" id = "moyori_1_station"/>&nbsp;
    							<form:input class = "textarea4" path = "moyori_2_station" id = "moyori_2_station"/>&nbsp;
    							<form:input class = "textarea4" path = "moyori_3_station" id = "moyori_3_station"/><br>
    		作業内容&nbsp;：<form:input class = "textarea3" path = "work" id = "work"/><br>
    		フェーズ&nbsp;：<form:input class = "textarea1" path = "phase" id = "phase" /><br>

    		<div class = "btm">
    		<input type="submit" class="btn btn-default" value="新規登録" name="entryGbjGm002" formaction="${actionUrl}"onclick= "return formCheck()">
    		<input type="submit" class="btn btn-success" value="更新" name="updateGbjGm002" formaction="${actionUrl}" onclick= "return formCheck()">
    		<input type="submit" class="btn btn-success" value="削除" name="deleteGbjGm002" formaction="${actionUrl}" onclick="return confirmDelete()">
    		<input type="submit" class="btn btn-info" value="戻る" name="backComGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-warning" value="現場情報一覧画面へ戻る" name="backGbjGm001" formaction="${actionUrl}">
    		</div>



    	</form:form>
	</body>
</html>
