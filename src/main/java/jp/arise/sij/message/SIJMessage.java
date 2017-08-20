package jp.arise.sij.message;

/**
 * SIJ用メッセージ
 * SIJで共通利用されるメッセージ
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public enum SIJMessage {

	/**
	 * メッセージID:SIJE001
	 */
	SIJE001("ユーザー名かパスワードが間違っています。"),

	/**
	 * メッセージID:SIJE002
	 */
	SIJE002("メッセージ文2"),

	/**
	 * メッセージID:SIJE003
	 */
	SIJE003("メッセージ文3");

	/**
	 * メッセージ
	 */
	private String message;

	/**
	 * コンストラクタ
	 */
	SIJMessage(String message) {
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
