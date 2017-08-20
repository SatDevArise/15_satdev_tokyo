package jp.arise.gbj.dto;

import java.io.Serializable;

/**
 * GBJGM002 現場新規登録・編集画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class GBJGM002Dto implements Serializable{

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
