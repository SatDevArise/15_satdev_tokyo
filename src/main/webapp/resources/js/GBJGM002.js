/**
 * GBJGM002 現場情報新規登録・編集画面用JavaScript
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */




/**
 * 必須チェック処理
 */
function formCheck(){
var form = document.forms.GBJ002;
var result_genba_id = form.genbaId.value;
var result_genba_na = form.genbaNa.value;
var result_moyori_1_station = form.moyori1Station.value;
var result_moyori_2_station = form.moyori2Station.value;
var result_moyori_3_station = form.moyori3Station.value;

console.log("result_genba_id");
console.log("result_genba_na");
console.log("result_moyori_1_station");
console.log("result_moyori_2_station");

if(result_genba_id ==  ""){
	document.getElementById("error_hyoji").innerHTML= "現場IDを入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(result_genba_na == ""){
	document.getElementById("error_hyoji").innerHTML= "現場名を入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(result_moyori_1_station == ""){
	document.getElementById("error_hyoji").innerHTML= "最寄駅を入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;
} else if(result_moyori_1_station != "" && result_moyori_3_station != "" && result_moyori_2_station == ""){
	document.getElementById("error_hyoji").innerHTML= "最寄駅2を入力してください。";
	document.getElementById("error_hyoji").style.color= "red";
	return false;

}else {
	// ＊＊＊
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
