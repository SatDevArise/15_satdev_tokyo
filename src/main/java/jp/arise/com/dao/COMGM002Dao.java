package jp.arise.com.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.com.dto.COMGM002Dto;

/**
 * COMGM002 メニュー画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface COMGM002Dao extends Serializable{

	/**
	 * userを取得
	 * @return user
	 */
	public List<COMGM002Dto> getUser(COMGM002Dto COMGM002Dto);
}
