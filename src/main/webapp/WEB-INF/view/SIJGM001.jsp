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
		<script src="<c:url value="/resources/js/SIJGM001.js" />"></script>
		<title>SIJGM001 社員情報一覧表示画面</title>
	</head>
	<body>
		<spring:url value="/initSijGm001" var="actionUrl"/>
    	<form:form modelAttribute="SIJGM001Form">
    		<form:input path="user" />
    		<input type="submit" class="btn btn-primary" value="編集" name="goToSijGm002" formaction="${actionUrl}">
    	    <input type="button" class="btn btn-default" value="検索" onclick="openCOMGM003();">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backComGm002" formaction="${actionUrl}">
    	</form:form>
    	<div style="height:100px; width:750px; overflow-y:scroll;">
    	<table border="1" height="100" width="750" bgcolor="#9999ff">
    	    <tr>
    	        <th>社員ID</th>
    	        <th>氏名</th>
    	        <th>役職</th>
    	        <th>生年月日</th>
    	        <th>チーム</th>
    	        <th>現場名</th>
    	        <th>経過年数</th>
    	        <th>フェーズ</th>
    	        <th>使用路線</th>
    	        <th>社歴</th>
    	        <th>単価</th>
    	    </tr>
    	    <tr>
    	        <td>1234</td>
    	        <td>山田太郎</td>
    	        <td></td>
    	        <td>19900101</td>
    	        <td>田中チーム</td>
    	        <td>株式会社Suzuki</td>
    	        <td>000103</td>
    	        <td></td>
    	        <td>JR山手線</td>
    	        <td>000103</td>
    	        <td>100</td>
    	    </tr>
    	</table>
    	</div>
	</body>
</html>
