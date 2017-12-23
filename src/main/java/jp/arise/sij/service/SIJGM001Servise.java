package jp.arise.sij.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.utl.LoginInfo;
import jp.arise.utl.UTLContent;

/**
 * SIJGM001 社員情報一覧表示画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class SIJGM001Servise {

	@Autowired
	public LoginInfo loginInfo;

	public void setSession() {
        loginInfo.updateAttributeGamenId(UTLContent.GMID_SIJGM001);
	}
}
