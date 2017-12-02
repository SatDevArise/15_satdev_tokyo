package jp.arise.com.modelandview;

/**
 * COMGM003 検索共通画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM003MAV {

	/**
	 * ユーザー
	 */
	private String userId;

	/**
	 * ユーザーを取得
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーを設定
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}



}
