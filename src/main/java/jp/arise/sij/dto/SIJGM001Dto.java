package jp.arise.sij.dto;

import java.io.Serializable;

/**
 * SIJGM001 社員情報一覧表示画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM001Dto implements Serializable{

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
