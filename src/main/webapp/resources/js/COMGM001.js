/**
 * COMGM001 ログイン画面用JavaScript
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */



/**
 * 必須チェック処理
 */
function formCheck(){
var form = document.forms.loginForm;
var userIdLength = form.userId.value.length;
var result_user = form.userId.value.match(/[^A-Za-z0-9]+/);
var result_pass = form.password.value.match(/[^A-Za-z0-9]+/);

if(result_user){
	document.getElementById("error_hyoji").innerHTML= "UserIDは半角英数字で入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(userIdLength < 8) {
	document.getElementById("error_hyoji").innerHTML= "UserIDが8文字未満です。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(result_pass) {
	document.getElementById("error_hyoji").innerHTML= "PassWordは半角英数字で入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
}else {
	// ＊＊＊
	// OK場合はtrueを返す
	return true;
}


}
