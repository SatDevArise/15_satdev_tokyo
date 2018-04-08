package jp.arise.com.form;

import java.util.Date;

/**
 * COMGM001 ログイン画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM001Form {

	/**
	 * ユーザーID
	 */
	private String userId;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * エラー有無
	 */
	private String loginFlg;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(String loginFlg) {
		this.loginFlg = loginFlg;
	}

}