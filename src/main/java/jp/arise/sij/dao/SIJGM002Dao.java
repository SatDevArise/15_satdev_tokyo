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
	 * 新規登録処理
	 */
	public void insert(SIJGM002Dto SIJGM002Dto);

	/**
	 * 削除処理
	 */
	public void delete(SIJGM002Dto SIJGM002Dto);

	/**
	 * 更新処理
	 */
	public void update(SIJGM002Dto SIJGM002Dto);

	/**
	 * 社員ID取得処理
	 */
	public String getSyainId();

	/**
	 * 社員ID更新処理
	 */
	public void updateSyainId();

	/**
	 * 現場ID取得ID
	 */
	public String getGenbaId();

	/**
	 * 入力駅チェック
	 */
	public String getStation(SIJGM002Dto SIJGM002Dto);

}