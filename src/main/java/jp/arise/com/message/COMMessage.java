package jp.arise.com.message;

/**
 * COM用メッセージ
 * COMで共通利用されるメッセージ
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public enum COMMessage {

	/**
	 * メッセージID:COME001
	 */
	COME001("ユーザー名かパスワードが間違っています。"),

	/**
	 * メッセージID:COME002
	 */
	COME002("メッセージ文2"),

	/**
	 * メッセージID:COME003
	 */
	COME003("メッセージ文3");

	/**
	 * メッセージ
	 */
	private String message;

	/**
	 * コンストラクタ
	 */
	COMMessage(String message) {
		this.message = message;
	}

	/**
	 * messageを取得
	 * @return message
	 */
	public String getMessage() {
		return this.message;
	}

}
