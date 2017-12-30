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
		<script src="<c:url value="/resources/js/GBJGM001.js" />"></script>
		<title>GBJGM001 現場情報一覧表示画面</title>
	</head>
	<body>
        <!-- タイトル -->
 	    <div align="left">
 		    <h1>現場情報一覧表示画面</h1>

		<spring:url value="/initGbjGm001" var="actionUrl"/>

    	<form:form modelAttribute="GBJGM001Form">
    		<input type="button" class="btn btn-default" value="検索" onclick="openCOMGM003();">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backComGm002" formaction="${actionUrl}">
    	</form:form>


            <!-- 現場情報一覧表示 -->
 			<div align="center">
 				<table>

 					<!-- ヘッダ -->
 					<thead>
 						<tr>
 							<th>現場名</th>
 							<th>作業内容</th>
 							<th>フェーズ</th>
 						</tr>
 					</thead>

 					<!-- 明細 -->
 					<tr>
                         <c:forEach var="genbaInfoList" items="${GBJGM001Form}">
 							<th><input type="submit" class="btn btn-link"
 								value="${genbaInfoList.ganbaId}" name="goToGBJGM002"
 								formaction="${actionUrl}"></th>
 							<th><c:out value="${genbaInfoList.genba_na}" /></th>
 							<th><c:out value="${genbaInfoList.work}" /></th>
 							<th><c:out value="${genbaInfoList.phase}" /></th>
 						</c:forEach>
                    </tr>
 				</table>
             </div>
         </div>
	</body>
</html>

