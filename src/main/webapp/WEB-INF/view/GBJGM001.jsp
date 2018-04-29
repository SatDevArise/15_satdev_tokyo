<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/css/layout.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/GBJGM001.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script src="<c:url value="/resources/js/GBJGM001.js" />"></script>
		<title>GBJGM001 現場情報一覧表示画面</title>
	</head>
	<body>
        <!-- タイトル -->
<!--  	    <div align="left">
 		    <h1>現場情報一覧表示画面</h1> -->
	<header>
		<h1>現場情報一覧表示画面</h1>
	</header>
	<spring:url value="/initGbjGm001" var="actionUrl"/>
    	<form:form modelAttribute="GBJGM001Form" class="text-center" style="margin-top: 30px;">
    		<!-- <input type="button" class="btn btn-default" value="検索" onclick="openCOMGM003();" style="margin-left: 10px;"> -->
    		<input type="submit" class="btn btn-default" value="検索" name="initComGm003" formaction="${actionUrl}" style="margin-left: 10px;">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backComGm002" formaction="${actionUrl}" style="margin-left: 10px;">
    	</form:form>
	<!-- 現場情報一覧表示 -->
	<div align="center">
		<table class="table-bordered" style="margin-top: 30px;">
			<!-- ヘッダ -->
			<thead style="color: #FFFFFF; background-color: #191970;">
				<tr id="columnName">
					<th>現場ID</th>
					<th>現場名</th>
					<th>作業内容</th>
					<th>フェーズ</th>
				</tr>
			</thead>
			<!-- 明細 -->
			<tr>
	            <c:forEach var="genbaInfo" items="${GBJGM001FormList}">
					<th><input type="submit" class="btn btn-link"
						value="${genbaInfo.genbaId}" name="goToGbjGm002"
						formaction="${actionUrl}"></th>
					<th><c:out value="${genbaInfo.genbaNa}" /></th>
					<th><c:out value="${genbaInfo.work}" /></th>
					<th><c:out value="${genbaInfo.phase}" /></th>
				</c:forEach>
	         </tr>
		</table>
	</div>
<!-- 	</div> -->
	</body>
</html>

