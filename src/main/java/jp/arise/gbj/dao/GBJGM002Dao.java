package jp.arise.gbj.dao;

import java.io.Serializable;

import jp.arise.gbj.dto.GBJGM002Dto;

/**
 * GBJGM002 現場情報新規登録・編集画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface GBJGM002Dao extends Serializable{

	/**
	 * 現場IDを取得
	 * @return user
	 */
public String getGenbaId();

/**
 * 新規登録処理
 */
public void insert (GBJGM002Dto dto);

/**
 * 採番処理
 */
public void numbering (GBJGM002Dto dto);

/**
 * 削除処理
 */
public void delete (GBJGM002Dto dto);

/**
 * 更新処理
 */
public void update (GBJGM002Dto dto);

}
