package jp.arise.gbj.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.gbj.dto.GBJGM001Dto;

/**
 * GBJGM001 現場情報一覧表示画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface GBJGM001Dao extends Serializable{

	/**
	 * userを取得
	 * @return user
	 */
	public List<GBJGM001Dto> getUser(GBJGM001Dto GBJGM001Dto);

	/**
	 * 現場情報一覧を取得
	 * @param GBJGM001Dto
	 * @return getGenbaListInfo
	 */
	public List<GBJGM001Dto> getGenbaListInfo(GBJGM001Dto GBJGM001Dto);

}
