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
		<link href="<c:url value="/resources/css/layout.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/COMGM003.css" />" rel="stylesheet">
 		<script src="<c:url value="/resources/js/COMGM003.js" />"></script>
		<title>COMGM003 検索共通画面</title>
	</head>
	<body>
	<header>
		<h1>検索画面</h1>
	</header>
	<div id="error_hyoji"></div>
	<spring:url value="/initComGm003" var="actionUrl"/>
    	<form:form modelAttribute="COMGM003Form" name = "COM003">

			<% String gamenId = (String)  session.getAttribute("GAMENID");
			%>
			<div id="row">
			<%if(gamenId == "GBJGM001"){ %>
				<label class="left syainid"><span class="item">社員ID</span><form:input path="syainId" name="syainId" disabled="true"/></label>
			<%} %>
			<%if(gamenId == "SIJGM001"){ %>
				<label class="left syainid"><span class="item">社員ID</span><form:input path="syainId" name="syainId"/></label>
			<%} %>

			<%if(gamenId == "GBJGM001"){ %>
				<label class="right birthdate"><span class="item">生年月日</span><form:input path="seinengappiFrom" name="seinengappiFrom" disabled="true"/><span class="line">～</span><form:input path="seinengappiTo" name="seinengappiTo" disabled="true"/></label>
			<%} %>
			<%if(gamenId == "SIJGM001"){ %>
				<label class="right birthdate"><span class="item">生年月日</span><form:input path="seinengappiFrom" name="seinengappiFrom"/><span class="line">～</span><form:input path="seinengappiTo" name="seinengappiTo"/></label>
			<%} %>

			</div>
			<div id="row">
				<%if(gamenId == "GBJGM001"){ %>
				<label class="left"><span class="item">前職</span><form:input path="previous" name="previous" disabled="true"/></label>
				<%} %>
				<%if(gamenId == "SIJGM001"){ %>
				<label class="left"><span class="item">前職</span><form:input path="previous" name="previous"/></label>
				<%} %>

				<%if(gamenId == "GBJGM001"){ %>
				<label class="right"><span class="item">役職</span>
					<select name="psition" disabled>
					</select>
				</label>
				<%} %>
				<%if(gamenId == "SIJGM001"){ %>
				<label class="right"><span class="item">役職</span>
					<select name="psition">
					<option value=""></option>
					<option value="J1">J1</option>
					<option value="J2">J2</option>
					<option value="S1">S1</option>
					<option value="S2">S2</option>
					</select>
				</label>
				<%} %>

			</div>
			<%if(gamenId == "GBJGM001"){ %>
			<label class="left hiredate"><span class="item">入社日</span><form:input path="nyusyabiFrom" name="nyusyabiFrom" disabled="true"/><span class="line">～</span><form:input path="nyusyabiTo" name="nyusyabiTo" disabled="true"/></label>
			<%} %>
			<%if(gamenId == "SIJGM001"){ %>
			<label class="left hiredate"><span class="item">入社日</span><form:input path="nyusyabiFrom" name="nyusyabiFrom"/><span class="line">～</span><form:input path="nyusyabiTo" name="nyusyabiTo"/></label>
			<%} %>

			<%if(gamenId == "GBJGM001"){ %>
			<label class="left team"><span class="item">チーム</span><form:input path="teamNa" name="teamNa" disabled="true"/></label>
			<%} %>
			<%if(gamenId == "SIJGM001"){ %>
			<label class="left team"><span class="item">チーム</span><form:input path="teamNa" name="teamNa"/></label>
			<%} %>

			<%if(gamenId == "GBJGM001"){ %>
			<label class="left genba"><span class="item">現場名</span><form:input path="genbaNa" naem="genbaNa"/></label>
			<%} %>
			<%if(gamenId == "SIJGM001"){ %>
			<label class="left genba"><span class="item">現場名</span><form:input path="genbaNa" naem="genbaNa" disabled="true"/></label>
			<%} %>

			<div id="row">
				<label class="left"><span class="item">フェーズ</span>
				<select name="phase">
					<option value=""></option>
					<option value="RD">RD</option>
					<option value="BD">BD</option>
					<option value="DD">DD</option>
					<option value="PG">PG</option>
					<option value="UT">UT</option>
					<option value="IT">IT</option>
					<option value="ST">ST</option>
				</select>
				</label>
				<%if(gamenId == "GBJGM001"){ %>
				<label class="right"><span class="item">単価</span><form:input path="tanka" name="tanka" disabled="true"/></label>
				<%} %>
				<%if(gamenId == "SIJGM001"){ %>
				<label class="right"><span class="item">単価</span><form:input path="tanka" name="tanka"/></label>
				<%} %>
			</div>

			<label class="left station"><span class="item">最寄駅</span>
				<form:input path="moyori1Station" name="moyori1Station"/>
				<form:input path="moyori2Station" name="moyori2Station"/>
				<form:input path="moyori3Station" name="moyori3Station"/>
			</label>
			<label class="left address"><span class="item">住所</span><form:input path="address" name="address"/></label>

			<input type="submit" class="btn btn-default" value="検索" name="searchComGm003" formaction="${actionUrl}" onclick= "return requiredCheck()">
			<input type="submit" class="btn btn-default" value="戻る" name="back_btn">
    </form:form>
	</body>
</html>
