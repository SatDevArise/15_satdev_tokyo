package jp.arise.gbj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * GBJGM002 現場新規登録・編集画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class GBJGM002Dto implements Serializable{

	/**
	 * ユーザー
	 */
	private String user;

	/**
	 * 現場ID
	 */
	private String genbaId;

	/**
	 * 現場名
	 */
	private String genbaNa;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 最寄り駅
	 */
	private String moyori1Station;

	/**
	 * 最寄り駅2
	 */
	private String moyori2Station;

	/**
	 * 最寄り駅3
	 */
	private String moyori3Station;

	/**
	 * 作業内容
	 */
	private String work;

	/**
	 * フェーズ
	 */
	private String phase;

	/**
	 * プロジェクトID
	 */
	private String pjId;

	/**
	 * 有効フラグ
	 */
	private String yukoFg;

	/**
	 * 削除フラグ
	 */
	private String sakujoFg;

	/**
	 * 登録日
	 */
	private Date insertTs;

	/**
	 * 更新日
	 */
	private Date updateTs;

	/**
	 * 削除日
	 */
	private Date deleteTs;

	/**
	 * 登録者
	 */
	private String insertUser;

	/**
	 * 更新者
	 */
	private String updateUser;

	/**
	 * 削除者
	 */
	private String deleteUser;

	public Date getInsertTs() {
		return insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public Date getUpdateTs() {
		return updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	public Date getDeleteTs() {
		return deleteTs;
	}

	public void setDeleteTs(Date deleteTs) {
		this.deleteTs = deleteTs;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}

	public String getPjId() {
		return pjId;
	}

	public void setPjId(String pjId) {
		this.pjId = pjId;
	}

	public String getYukoFg() {
		return yukoFg;
	}

	public void setYukoFg(String yukoFg) {
		this.yukoFg = yukoFg;
	}

	public String getSakujoFg() {
		return sakujoFg;
	}

	public void setSakujoFg(String sakujoFg) {
		this.sakujoFg = sakujoFg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getGenbaId() {
		return genbaId;
	}

	public void setGenbaId(String genbaId) {
		this.genbaId = genbaId;
	}

	public String getGenbaNa() {
		return genbaNa;
	}

	public void setGenbaNa(String genbaNa) {
		this.genbaNa = genbaNa;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMoyori1Station() {
		return moyori1Station;
	}

	public void setMoyori1Station(String moyori1Station) {
		this.moyori1Station = moyori1Station;
	}

	public String getMoyori2Station() {
		return moyori2Station;
	}

	public void setMoyori2Station(String moyori2Station) {
		this.moyori2Station = moyori2Station;
	}

	public String getMoyori3Station() {
		return moyori3Station;
	}

	public void setMoyori3Station(String moyori3Station) {
		this.moyori3Station = moyori3Station;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}





}
