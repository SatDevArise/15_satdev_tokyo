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
	 * 新規登録処理
	 * @return user
	 */
	public void insert(GBJGM002Dto GBJGM002Dto);

	/**
	 * 削除処理
	 * @return user
	 */
	public void delete(GBJGM002Dto GBJGM002Dto);

	/**
	 * 更新処理
	 * @return user
	 */
	public void update(GBJGM002Dto GBJGM002Dto);

	/**
	 * 採番登録処理
	 * @return user
	 */
	public void numbering(GBJGM002Dto GBJGM002Dto);

	/**
	 * 現場情報取得処理
	 */
	public List<GBJGM002Dto> getGenbaInfo(String GenbaId);


//	/**
//	 * userを取得
//	 * @return user
//	 */
//	public List<GBJGM002Dto> getUser(GBJGM002Dto GBJGM002Dto);
//
	/**
	 * genba_Idを取得
	 * @return genba_Id
	 */
	public String getGenbaId();
//
//	/**
//	 * genba_naを取得
//	 * @return genba_na
//	 */
//	public List<GBJGM002Dto> getGenba_Na(GBJGM002Dto GBJGM002Dto);
//
//	/**
//	 * adressを取得
//	 * @return adress
//	 */
//	public List<GBJGM002Dto> getAdress(GBJGM002Dto GBJGM002Dto);
//
//	/**
//	 * moyori_1_stationを取得
//	 * @return
//	 */
//	public List<GBJGM002Dto> getMoyori1(GBJGM002Dto GBJGM002Dto);
//
//
//	/**
//	 * moyori_2_stationを取得
//	 * @return
//	 */
//	public List<GBJGM002Dto> getMoyori2(GBJGM002Dto GBJGM002Dto);
//
//	/**
//	 * moyori_3_stationを取得
//	 * @return
//	 */
//	public List<GBJGM002Dto> getMoyori3(GBJGM002Dto GBJGM002Dto);
//
//
//	/**
//	 * workを取得
//	 * @return
//	 */
//	public List<GBJGM002Dto> getWork(GBJGM002Dto GBJGM002Dto);
//
//	/**
//	 * phaseを取得
//	 * @return
//	 */
//	public List<GBJGM002Dto> getPhase(GBJGM002Dto GBJGM002Dto);

}
