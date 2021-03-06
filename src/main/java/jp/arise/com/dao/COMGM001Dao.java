package jp.arise.com.dao;

import java.io.Serializable;
import java.util.List;

import jp.arise.com.dto.COMGM001Dto;

/**
 * COMGM001 ログイン画面用サービス間Daoクラス
 * データベースアクセス時に利用するクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public interface COMGM001Dao extends Serializable{

	/**
	 * ユーザー情報登録処理
	 * @return user
	 */
	public List<COMGM001Dto> select(String userId);

	/**
	 * ログイン履歴作成処理
	 * @return user
	 */
	public void insert(COMGM001Dto dto);

	/**
	 * ログイン初回判定処理
	 * @return user
	 */
	public int count(String userId);
}