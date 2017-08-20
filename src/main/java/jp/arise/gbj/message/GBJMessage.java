package jp.arise.gbj.message;

/**
 * GBJ用メッセージ
 * GBJで共通利用されるメッセージ
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public enum GBJMessage {

	/**
	 * メッセージID:GBJE001
	 */
	GBJE001("ユーザー名かパスワードが間違っています。"),

	/**
	 * メッセージID:SIJE002
	 */
	GBJE002("メッセージ文2"),

	/**
	 * メッセージID:SIJE003
	 */
	GBJE003("メッセージ文3");

	/**
	 * メッセージ
	 */
	private String message;

	/**
	 * コンストラクタ
	 */
	GBJMessage(String message) {
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
