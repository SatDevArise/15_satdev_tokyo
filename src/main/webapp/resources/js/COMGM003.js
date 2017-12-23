/**
 * COMGM003 検索共通画面用JavaScript
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */




/**
 * 必須チェック処理
 */
function requiredCheck()
{
	var a = document.fa.NamA.value;
	var b = a.length;
	var txt = document.fa.NamA.value;
	var result = txt.match(/[^0-9]/g);

	var syain_id;
	var seinengappi_from;
	var seinengappi_to;
	var nyusyabi_from;
	var nyusyabi_to;

	//生年月日(From)を取得する
	var sei_from_y = parseInt(seinengappi_from.substr(0,4));
	var sei_from_m = parseInt(seinengappi_from.substr(4,2)) -1;  //月は0～11で指定するため-1しています。
	var sei_from_d = parseInt(seinengappi_from.substr(6,2));
	var sei_from_dt = new Date(sei_from_y, sei_from_m, sei_from_d);

	//判定する
	return (sei_from_y == sei_from_dt.getFullYear() && sei_from_m == sei_from_dt.getMonth() && sei_from_d == sei_from_dt.getDate());

	//生年月日(To)を取得する
	var sei_to_y = parseInt(seinengappi_to.substr(0,4));
	var sei_to_m = parseInt(seinengappi_to.substr(4,2)) -1;
	var sei_to_d = parseInt(seinengappi_to.substr(6,2));
	var sei_to_dt = new Date(sei_to_y, sei_to_m, sei_to_d);

	//判定する
	return (sei_to_y == sei_to_dt.getFullYear() && sei_to_m == sei_to_dt.getMonth() && sei_to_d == sei_to_dt.getDate());

	//入社日(From)を取得する
	var nyu_from_y = parseInt(nyusyabi_from.substr(0,4));
	var nyu_from_m = parseInt(nyusyabi_from.substr(4,2)) -1;
	var nyu_from_d = parseInt(nyusyabi_from.substr(6,2));
	var nyu_from_dt = new Date(nyu_from_y, nyu_from_m, nyu_from_d);

	//判定する
	return (nyu_from_y == nyu_from_dt.getFullYear() && nyu_from_m == nyu_from_dt.getMonth() && nyu_from_d == nyu_from_dt.getDate());

	//入社日(To)を取得する
	var nyu_to_y = parseInt(nyusyabi_to.substr(0,4));
	var nyu_to_m = parseInt(nyusyabi_to.substr(4,2)) -1;
	var nyu_to_d = parseInt(nyusyabi_to.substr(6,2));
	var nyu_to_dt = new Date(nyu_to_y, nyu_to_m, nyu_to_d);

	//判定する
	return (nyu_to_y == nyu_to_dt.getFullYear() && nyu_to_m == nyu_to_dt.getMonth() && nyu_to_d == nyu_to_dt.getDate());

	if(document.fa.NamA.value == ""){
		alert("検索キーが入力されていません。");
		return false;
	} else if(b > 16) {
		alert(b +"桁入力されています。入力できる文字数は16桁です。");
		return false;
	} else if(b < 16) {
		alert(b +"桁入力されています。検索には16桁入力して下さい。");
		return false;
	} else {
		// ＊＊＊
		// OK場合はtrueを返す
		return true;
	}

	if(syain_id.length > 8){
		alert(syain_id.length +"桁入力されています。入力できる文字数は4桁です。");
		return false;
	} else if(syain_id.length < 8){
		alert(syain_id.length +"桁入力されています。検索には16桁入力して下さい。");
		return false;
	} else {
		return true;
	}

	if(seinengappi_from.length > 8){
		alert(seinengappi_from.length +"桁入力されています。入力できる文字数は4桁です。");
		return false;
	} else if(seinengappi_from.length < 8){
		alert(seinengappi_from.length +"桁入力されています。検索には16桁入力して下さい。");
		return false;
	} else {
		return true;
	}

	if(seinengappi_to.length > 8){
		alert(seinengappi_to.length +"桁入力されています。入力できる文字数は4桁です。");
		return false;
	} else if(seinengappi_to.length < 8){
		alert(seinengappi_to.length +"桁入力されています。検索には16桁入力して下さい。");
		return false;
	} else {
		return true;
	}

	if(nyusyabi_from.length > 8){
		alert(nyusyabi_from.length +"桁入力されています。入力できる文字数は4桁です。");
		return false;
	} else if(nyusyabi_from.length < 8){
		alert(nyusyabi_from.length +"桁入力されています。検索には16桁入力して下さい。");
		return false;
	} else {
		return true;
	}

	if(nyusyabi_to.length > 8){
		alert(nyusyabi_to.length +"桁入力されています。入力できる文字数は4桁です。");
		return false;
	} else if(nyusyabi_to.length < 8){
		alert(nyusyabi_to.length +"桁入力されています。検索には16桁入力して下さい。");
		return false;
	} else {
		return true;
	}

}
