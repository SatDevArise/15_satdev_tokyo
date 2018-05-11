package jp.arise.utl;

/**
 * ログイン情報用Dtoクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 *
 */
public class LoginInfoDto {

	/**
	 * ユーザーID
	 */
	private Object userId;

	/**
	 * ユーザー名
	 */
	private Object userNa;

	/**
	 * 運用日
	 */
	private Object unyoubi;

	/**
	 * 遷移元画面
	 */
	private Object gamenId;

	/**
	 * 検索結果
	 */
	private Object searchResult;

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

	/**
	 * ユーザー名を取得
	 * @return userNa
	 */
	public Object getUserNa() {
		return userNa;
	}

	/**
	 * ユーザー名を設定
	 * @param userNa
	 */
	public void setUserNa(Object userNa) {
		this.userNa = userNa;
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
	 * @return gamenId
	 */
	public Object getGamenId() {
		return gamenId;
	}

	/**
	 * 遷移元画面を設定
	 * @param gamenId
	 */
	public void setGamenId(Object gamenId) {
		this.gamenId = gamenId;
	}

	/**
	 * @return searchResult
	 */
	public Object getSearchResult() {
		return searchResult;
	}

	/**
	 * @param searchResult セットする searchResult
	 */
	public void setSearchResult(Object searchResult) {
		this.searchResult = searchResult;
	}
}