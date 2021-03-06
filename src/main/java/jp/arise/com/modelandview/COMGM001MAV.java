package jp.arise.com.modelandview;

/**
 * COMGM001 ログイン画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM001MAV {

	/**
	 * ユーザーID
	 */
	private String userId;

	/**
	 * ユーザー名
	 */
	private String userName;

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
	 * @return userId
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * ユーザー名を設定
	 * @param username
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}