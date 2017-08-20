package jp.arise.sij.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.sij.dto.SIJGM002Dto;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface SIJGM002Dao extends Serializable{

	/**
	 * userを取得
	 * @return user
	 */
	public List<SIJGM002Dto> getUser(SIJGM002Dto SIJGM002Dto);
}
