package jp.arise.com.dto;

import java.io.Serializable;

/**
 * COMGM001 ログイン画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM001Dto implements Serializable{

	/**
	 * ユーザーID
	 */
	private String userId;

	/**
	 * ユーザー名
	 */
	private String userNa;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * ユーザーIDを取得
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを設定
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * ユーザー名を取得
	 * @return userNa
	 */
	public String getUserNa() {
		return userNa;
	}

	/**
	 * ユーザー名を設定
	 * @param userNa
	 */
	public void setUserNa(String userNa) {
		this.userNa = userNa;
	}

	/**
	 * パスワードを取得
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードを設定
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
