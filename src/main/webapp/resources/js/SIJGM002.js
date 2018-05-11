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
	var address = form.address.value;
	var moyoriStation1 = form.moyoriStation1.value;
	var moyoriStation2 = form.moyoriStation2.value;
	var moyoriStation3 = form.moyoriStation3.value;
	var previous = form.previous.value;
	var birthPlace = form.birthPlace.value;
	var position = form.position.value;
	var teamName = form.teamName.value;
	var phase = form.phase.value;
	var tanka = form.tanka.value;

	if(syainId ==  ""){
		document.getElementById("error_hyoji").innerHTML= "社員IDを入力してください。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(name == ""){
		document.getElementById("error_hyoji").innerHTML= "氏名を入力してください。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(name.length > 30){
		document.getElementById("error_hyoji").innerHTML= "氏名は" + name.length + "桁入力されています。入力できる文字数は30桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(address.length > 80){
		document.getElementById("error_hyoji").innerHTML= "住所は" + address.length + "桁入力されています。入力できる文字数は80桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(moyoriStation1 == ""){
		document.getElementById("error_hyoji").innerHTML= "最寄駅を入力してください。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(moyoriStation1 != "" && moyoriStation3 != "" && moyoriStation2 == ""){
		document.getElementById("error_hyoji").innerHTML= "最寄駅2を入力してください。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(moyoriStation1.length > 10){
		document.getElementById("error_hyoji").innerHTML= "最寄駅1は" + moyoriStation1.length + "桁入力されています。入力できる文字数は10桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(moyoriStation2.length > 10){
		document.getElementById("error_hyoji").innerHTML= "最寄駅2は" + moyoriStation2.length + "桁入力されています。入力できる文字数は10桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(moyoriStation3.length > 10){
		document.getElementById("error_hyoji").innerHTML= "最寄駅3は" + moyoriStation3.length + "桁入力されています。入力できる文字数は10桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(previous.length > 30){
		document.getElementById("error_hyoji").innerHTML= "前職は" + previous.length + "桁入力されています。入力できる文字数は30桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(birthPlace.length > 10){
		document.getElementById("error_hyoji").innerHTML= "出身地は" + birthPlace.length + "桁入力されています。入力できる文字数は10桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(position != '' && position.length != 2){
		document.getElementById("error_hyoji").innerHTML= "役職は" + position.length + "桁入力されています。入力できる文字数は2桁のみです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(teamName.length > 20){
		document.getElementById("error_hyoji").innerHTML= "チームは" + teamName.length + "桁入力されています。入力できる文字数は20桁までです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(phase != '' && phase.length != 2){
		document.getElementById("error_hyoji").innerHTML= "フェーズは" + phase.length + "桁入力されています。入力できる文字数は2桁のみです。";
		document.getElementById("error_hyoji").style.color= "red";
		return false;
	} else if(tanka.length > 7){
		document.getElementById("error_hyoji").innerHTML= "単価は" + tanka.length + "桁入力されています。入力できる文字数は7桁までです。";
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
		//社員IDを活性化する
		undisabled();
		return true;
	}else{
		window.alert('キャンセルしました');
		return false;
	};
};

/**
 * 非活性解除処理
 */
function undisabled(){
	document.getElementById( "syainId" ).disabled = false;
}