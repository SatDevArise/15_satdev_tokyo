/**
 * COMGM001 ログイン画面
 *
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */




function chkA()
{
var a = document.fa.NamA.value;
var b = a.length;
var txt = document.fa.NamA.value;
var result = txt.match(/[^0-9]/g);

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
}
