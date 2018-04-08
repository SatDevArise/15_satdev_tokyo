package jp.arise.com.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * COMGM001 ログイン画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM001Dto implements Serializable{

	/**
	 * ユーザー名
	 */
	private String userName;

	/**
	 * ユーザーID
	 */
	private String userId;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 作成日付
	 */
	private String createdAt;

	/**
	 * 有効フラグ
	 */
	private int yukoFlg;

	/**
	 * 削除フラグ
	 */
	private int deleteFlg;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public int getYukoFlg() {
		return yukoFlg;
	}

	public void setYukoFlg(int yukoFlg) {
		this.yukoFlg = yukoFlg;
	}

	public int getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(int deleteFlg) {
		this.deleteFlg = deleteFlg;
	}




}