package jp.arise.utl;

/**
 * ログイン情報用Dtoクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class LoginInfoDto {

	/**
	 * ユーザーID
	 */
	private Object user_id;

	/**
	 * ユーザー名
	 */
	private Object user_na;

	/**
	 * 運用日
	 */
	private Object unyoubi;

	/**
	 * 遷移元画面
	 */
	private Object gamen_id;

	/**
	 * ユーザーIDを取得
	 * @return user_id
	 */
	public Object getUser_id() {
		return user_id;
	}

	/**
	 * ユーザーIDを設定
	 * @param user_id
	 */
	public void setUser_id(Object user_id) {
		this.user_id = user_id;
	}

	/**
	 * ユーザー名を取得
	 * @return user_na
	 */
	public Object getUser_na() {
		return user_na;
	}

	/**
	 * ユーザー名を設定
	 * @param user_na
	 */
	public void setUser_na(Object user_na) {
		this.user_na = user_na;
	}

	/**
	 * 運用日を取得
	 * @return unyoubi
	 */
	public Object getUnyoubi() {
		return unyoubi;
	}

	/**
	 * 運用日を設定
	 * @param unyoubi
	 */
	public void setUnyoubi(Object unyoubi) {
		this.unyoubi = unyoubi;
	}

	/**
	 * 遷移元画面を取得
	 * @return gamen_id
	 */
	public Object getGamen_id() {
		return gamen_id;
	}

	/**
	 * 遷移元画面を設定
	 * @param gamen_id
	 */
	public void setGamen_id(Object gamen_id) {
		this.gamen_id = gamen_id;
	}
}
