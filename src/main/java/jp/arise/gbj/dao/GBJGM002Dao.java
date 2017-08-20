package jp.arise.gbj.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.gbj.dto.GBJGM002Dto;

/**
 * GBJGM002 現場情報新規登録・編集画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface GBJGM002Dao extends Serializable{

	/**
	 * userを取得
	 * @return user
	 */
	public List<GBJGM002Dto> getUser(GBJGM002Dto GBJGM002Dto);
}
