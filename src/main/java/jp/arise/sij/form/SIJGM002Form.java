package jp.arise.sij.form;

/**
 * SIJGM002 社員情報新規登録・編集画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM002Form {

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
