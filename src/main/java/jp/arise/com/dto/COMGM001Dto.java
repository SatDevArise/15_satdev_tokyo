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
	 * ユーザー
	 */
	private String user;

	/**
	 * ユーザーID
	 */
	private int userId;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * ユーザーIDを取得
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを設定
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
