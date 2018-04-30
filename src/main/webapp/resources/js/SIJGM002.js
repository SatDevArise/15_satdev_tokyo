/**
 * GBJGM002 現場情報新規登録・編集画面用JavaScript
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */



/**
 * 必須チェック処理
 */
function formCheck(){
var form = document.forms.SIJ002;
var syainId = form.syainId.value;
var name = form.name.value;
var moyori_1_station = form.moyori_1_station.value;
var moyori_2_station = form.moyori_2_station.value;
var moyori_3_station = form.moyori_3_station.value;

console.log("syainId");
console.log("name");
console.log("moyori_1_station");
console.log("moyori_2_station");

if(syainId ==  ""){
	document.getElementById("error_hyoji").innerHTML= "社員IDを入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(name == ""){
	document.getElementById("error_hyoji").innerHTML= "氏名を入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(moyori_1_station == ""){
	document.getElementById("error_hyoji").innerHTML= "最寄駅を入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(moyori_1_station != "" && moyori_3_station != "" && moyori_2_station == ""){
	document.getElementById("error_hyoji").innerHTML= "最寄駅2を入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;

}else {
	//社員IDを活性化する
	undisabled();

	// OK場合はtrueを返す
	return true;
}

}


/**
 * 削除確認処理
 */

function confirmDelete()
{
	if(window.confirm('本当に削除しますか。')){
		return true;
	}else{
		window.alert('キャンセルしました');
		return false;
	};
};

function undisabled(){
	document.getElementById( "syainId" ).disabled = false;
}