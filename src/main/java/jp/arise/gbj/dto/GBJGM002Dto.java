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
	 * ユーザーID
	 */
	private int userId;

	/**
	 * 現場ID
	 */
	private String genba_Id;

	/**
	 * 現場名
	 */
	private String genba_na;

	/**
	 * 住所
	 */
	private String address;

	/**
	 * 最寄駅1
	 */
	private String moyori_1_station;

	/**
	 * 最寄駅2
	 */
	private String moyori_2_station;

	/**
	 * 最寄駅3
	 */
	private String moyori_3_station;

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
	private String pi_id;
	/**
	 * 有効フラグ
	 */
	private String yuko_fg;
	/**
	 * 削除フラグ
	 */
	private String sakujo_fg;
	/**
	 * 現場グループコード
	 */
	private String genba_group_code;
	/**
	 * 社員グループコード
	 */
	private String syain_group_code;
	/**
	 * 案件名
	 */
	private String anken_name;
	/**
	 * プロジェクト開始日
	 */
	private String pj_start;
	/**
	 * プロジェクト終了日
	 */
	private String pj_end;
	/**
	 * 現場電話番号
	 */
	private String genba_phone_num;
	/**
	 * 単価
	 */
	private String tanka;
	/**
	 * 登録者
	 */
	private String insert_user;
	/**
	 * 登録日
	 */
	private Date insert_date;
	/**
	 * 更新者
	 */
	private String update_user;
	/**
	 * 更新日
	 */
	private Date update_date;
	/**
	 * 削除者
	 */
	private String delete_user;
	/**
	 * 削除日
	 */
	private Date delete_date;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getGenba_Id() {
		return genba_Id;
	}
	public void setGenba_Id(String genba_Id) {
		this.genba_Id = genba_Id;
	}
	public String getGenba_na() {
		return genba_na;
	}
	public void setGenba_na(String genba_na) {
		this.genba_na = genba_na;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMoyori_1_station() {
		return moyori_1_station;
	}
	public void setMoyori_1_station(String moyori_1_station) {
		this.moyori_1_station = moyori_1_station;
	}
	public String getMoyori_2_station() {
		return moyori_2_station;
	}
	public void setMoyori_2_station(String moyori_2_station) {
		this.moyori_2_station = moyori_2_station;
	}
	public String getMoyori_3_station() {
		return moyori_3_station;
	}
	public void setMoyori_3_station(String moyori_3_station) {
		this.moyori_3_station = moyori_3_station;
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
	public String getPi_id() {
		return pi_id;
	}
	public void setPi_id(String pi_id) {
		this.pi_id = pi_id;
	}
	public String getYuko_fg() {
		return yuko_fg;
	}
	public void setYuko_fg(String yuko_fg) {
		this.yuko_fg = yuko_fg;
	}
	public String getSakujo_fg() {
		return sakujo_fg;
	}
	public void setSakujo_fg(String sakujo_fg) {
		this.sakujo_fg = sakujo_fg;
	}
	public String getGenba_group_code() {
		return genba_group_code;
	}
	public void setGenba_group_code(String genba_group_code) {
		this.genba_group_code = genba_group_code;
	}
	public String getSyain_group_code() {
		return syain_group_code;
	}
	public void setSyain_group_code(String syain_group_code) {
		this.syain_group_code = syain_group_code;
	}
	public String getAnken_name() {
		return anken_name;
	}
	public void setAnken_name(String anken_name) {
		this.anken_name = anken_name;
	}
	public String getPj_start() {
		return pj_start;
	}
	public void setPj_start(String pj_start) {
		this.pj_start = pj_start;
	}
	public String getPj_end() {
		return pj_end;
	}
	public void setPj_end(String pj_end) {
		this.pj_end = pj_end;
	}
	public String getGenba_phone_num() {
		return genba_phone_num;
	}
	public void setGenba_phone_num(String genba_phone_num) {
		this.genba_phone_num = genba_phone_num;
	}
	public String getTanka() {
		return tanka;
	}
	public void setTanka(String tanka) {
		this.tanka = tanka;
	}
	public String getInsert_user() {
		return insert_user;
	}
	public void setInsert_user(String insert_user) {
		this.insert_user = insert_user;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
	public String getUpdate_user() {
		return update_user;
	}
	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public String getDelete_user() {
		return delete_user;
	}
	public void setDelete_user(String delete_user) {
		this.delete_user = delete_user;
	}
	public Date getDelete_date() {
		return delete_date;
	}
	public void setDelete_date(Date delete_date) {
		this.delete_date = delete_date;
	}





}
