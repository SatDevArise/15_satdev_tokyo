<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/SIJGM002.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
 		<script src="<c:url value="/resources/js/SIJGM002.js" />"></script>
		<title>SIJGM002 社員情報新規登録・編集画面</title>
	</head>
	<body>
	<header>
		<p>社員情報新規登録・編集画面</p>
	</header>
	    <spring:url value="/initSijGm002" var="actionUrl"/>
    	<form:form modelAttribute="SIJGM002Form" id="register">
    		<dl>
    			<dt>社員ID</dt>
    			<dd><input type="text" id="syain_id" name="syain_id" disabled></dd>
    			<dt>氏名</dt>
    			<dd><input type="text" id="name" name="name"></dd>
    			<dt>生年月日</dt>
    			<dd><input type="text" id="seinengappi" name="seinengappi"></dd>
    			<dt>住所</dt>
    			<dd><input type="text" id="address" name="address"></dd>
    			<dt>最寄り駅</dt>
    			<dd><input type="text" id="moyori_1_station" name="moyori_1_station"></dd>
    			<dt>最寄り駅2</dt>
    			<dd><input type="text" id="moyori_2_station" name="moyori_2_station"></dd>
    			<dt>最寄り駅3</dt>
    			<dd><input type="text" id="moyori_3_station" name="moyori_3_station"></dd>
    			<dt>エリアコード</dt>
    			<dd><input type="text" id="area_cd" name="area_cd"></dd>
    			<dt>市内局番</dt>
    			<dd><input type="text" id="city_cd" name="city_cd"></dd>
    			<dt>加入者番号</dt>
    			<dd><input type="text" id="subscriber_no" name="subscriber_no"></dd>
    			<dt>前職</dt>
    			<dd><input type="text" id="previous" name="previous"></dd>
    			<dt>出身地</dt>
    			<dd><input type="text" id="brth_place" name="brth_place"></dd>
    			<dt>役職</dt>
    			<dd>
    			<select id="psition" name="psition"></select>
    			</dd>
    			<dt>チーム</dt>
    			<dd><input type="text" id="team_na" name="team_na"></dd>
    			<dt>フェーズ</dt>
    			<dd><input type="text" id="phase" name="phase"></dd>
    			<dt>単価</dt>
    			<dd><input type="number" id="tanka" name="tanka"></dd>
    			<dt>現場名</dt>
    			<dd><input type="text" id="genba_na" name="genba_na"></dd>
    		</dl>

    		<input type="submit" class="btn btn-default" value="新規登録" name="entrySijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-success" value="更新" name="updateSijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-success" value="削除" name="deleteSijGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-info" value="戻る" name="backComGm002" formaction="${actionUrl}">
    		<input type="submit" class="btn btn-warning" value="戻る" name="backSijGm001" formaction="${actionUrl}">
    	</form:form>
	</body>
</html>
