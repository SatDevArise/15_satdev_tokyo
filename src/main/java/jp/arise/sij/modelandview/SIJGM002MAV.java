package jp.arise.sij.modelandview;

/**
 * SIJGM002 社員情報新規登録・編集画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM002MAV {

	/**
	 * ユーザー
	 */
	private String user;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}



}
