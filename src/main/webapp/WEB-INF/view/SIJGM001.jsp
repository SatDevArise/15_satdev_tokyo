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

<p><div Align="right"><B><font size="3" color="#0000ff">社員情報管理システム</font></B></div></p>

<div style="height:300px; width:600px; overflow-y:scroll; overflow-x:scroll; scrollbar-base-color:#D8D8D8; scrollbar-arrow-color:#2E2EFE;">

  <table align="center" border="1" height="200" width="500">
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

    <c:forEach var="SIJ" items="${SIJGM001MAV}">
    <tr>
      <td><a href="./SIJGM002?userId=${SIJ.userId}"><c:out value="${SIJ.userId}"/></a></td>
      <td><c:out value="${SIJ.user}"/></td>
      <td><c:out value="${SIJ.title}"/></td>
      <td><c:out value="${SIJ.birthday}"/></td>
      <td><c:out value="${SIJ.team}"/></td>
      <td><c:out value="${SIJ.site}"/></td>
      <td><c:out value="${SIJ.duration}"/></td>
      <td><c:out value="${SIJ.phase}"/></td>
      <td><c:out value="${SIJ.route}"/></td>
      <td><c:out value="${SIJ.history}"/></td>
      <td><c:out value="${SIJ.price}"/></td>
    </tr>
	</c:forEach>

	</TABLE>
	</div>
    	    <input type="button" class="btn btn-default" value="検索" onclick="openCOMGM003();">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backComGm002" formaction="${actionUrl}">
    	</form:form>
	</body>
</html>
