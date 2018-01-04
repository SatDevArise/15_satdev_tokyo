package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM002Dao;
import jp.arise.utl.LoginInfo;

/**
 * COMGM002 メニュー画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM002Servise {

	@Autowired
	private COMGM002Dao comGm002Dao;


	public void upSession(){
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.updateAttributeGamenId("COMGM002");
	}

	public List<String> getNews(){

		//daoのgetNewsメソッドを呼び出し
		List<String> resultList = comGm002Dao.getNews();

		return resultList;
	}

}
