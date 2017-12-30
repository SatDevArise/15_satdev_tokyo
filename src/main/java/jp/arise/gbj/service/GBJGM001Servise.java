package jp.arise.gbj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.utl.LoginInfo;
import jp.arise.utl.UTLContent;

/**
 * GBJGM001 現場情報一覧表示画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class GBJGM001Servise {

	@Autowired
	public LoginInfo loginInfo;

	/**
	 * セッション情報設定処理
	 */
	public void setSessionInfo() {
		// ログイン情報保持用セッションクラスのセッション登録を呼び出す
		loginInfo.updateAttributeGamenId(UTLContent.GMID_GBJGM001);
	}
}
