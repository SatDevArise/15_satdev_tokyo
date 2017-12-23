package jp.arise.com.form;

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