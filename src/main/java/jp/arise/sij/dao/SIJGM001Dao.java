package jp.arise.sij.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.sij.dto.SIJGM001Dto;

/**
 * SIJGM001 社員情報一覧表示画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface SIJGM001Dao extends Serializable{

	/**
	 * userを取得
	 * @return user
	 */
	public List<SIJGM001Dto> getUser(SIJGM001Dto SIJGM001Dto);
}
