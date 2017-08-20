package jp.arise.utl;

/**
 * ログイン情報用Dtoクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class LoginInfoDto {

	/**
	 * ユーザー
	 */
	private Object user;

	/**
	 * ユーザーID
	 */
	private Object userId;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public Object getUser() {
		return user;
	}

	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(Object user) {
		this.user = user;
	}

	/**
	 * ユーザーIDを取得
	 * @return userId
	 */
	public Object getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを設定
	 * @param userId
	 */
	public void setUserId(Object userId) {
		this.userId = userId;
	}
}
