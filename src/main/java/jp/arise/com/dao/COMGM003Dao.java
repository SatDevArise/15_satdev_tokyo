package jp.arise.com.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.com.dto.COMGM003Dto;

/**
 * COMGM003 検索共通画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface COMGM003Dao extends Serializable{

	/**
	 * userを取得
	 * @return user
	 */
	//public List<COMGM003Dto> getUser(COMGM003Dto COMGM003Dto);

	public List<COMGM003Dto> getSyainDt(COMGM003Dto COMGM003Dto);

	public List<COMGM003Dto> getGenbaDt(COMGM003Dto COMGM003Dto);

}
