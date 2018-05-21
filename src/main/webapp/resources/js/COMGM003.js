/**
 * COMGM003 検索共通画面用JavaScript
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */

/**
 * 検索共通画面閉じる処理
 */
function closeCOMGM003()
{
	window.close();
}


/**
 * 日付判定
 */
function dateCheck(nyuryokuti,syurui){

	if(nyuryokuti.length != 8 || isNaN(nyuryokuti)){
		document.getElementById("error_hyoji").innerHTML= syurui+"正しい日付を入力してください。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	}

	var nyuryokuti_y = parseInt(nyuryokuti.substr(0,4));
	var nyuryokuti_m = parseInt(nyuryokuti.substr(4,2)) -1;  //月は0～11で指定するため-1しています。
	var nyuryokuti_d = parseInt(nyuryokuti.substr(6,2));
	var nyuryokuti_dt = new Date(nyuryokuti_y, nyuryokuti_m, nyuryokuti_d);

	if(nyuryokuti_y == nyuryokuti_dt.getFullYear() && nyuryokuti_m == nyuryokuti_dt.getMonth() && nyuryokuti_d == nyuryokuti_dt.getDate()){
		return true;
	}
	document.getElementById("error_hyoji").innerHTML= syurui+"正しい日付を入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;

}

/**
 * 必須チェック処理
 */
function requiredCheck()
{

	var form = document.forms.COM003;
	var syain_id = form.syainId.value;
	var seinengappi_from = form.seinengappiFrom.value;
	var seinengappi_to = form.seinengappiTo.value;
	var nyusyabi_from = form.nyusyabiFrom.value;
	var nyusyabi_to = form.nyusyabiTo.value;
	var flg;

	//生年月日(From)を取得する
	if(seinengappi_from != null && seinengappi_from != ""){
		flg = dateCheck(seinengappi_from,"生年月日(From)に");
		if(!flg){
			return false;
		}
	}


	//生年月日(To)を取得する
	if(seinengappi_to != null && seinengappi_to != ""){
		flg = dateCheck(seinengappi_to,"生年月日(To)に");
		if(!flg){
			return false;
		}
	}


	//入社日(From)を取得する
	if(nyusyabi_from != null && nyusyabi_from != ""){
		flg = dateCheck(nyusyabi_from,"入社日(From)に");
		if(!flg){
			return false;
		}
	}


	//入社日(To)を取得する
	if(nyusyabi_to != null && nyusyabi_to != ""){
		flg = dateCheck(nyusyabi_to,"入社日(To)に");
		if(!flg){
			return false;
		}
	}


}
