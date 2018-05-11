package jp.arise.gbj.form;

import java.util.List;

/**
 * GBJGM001 現場情報一覧表示画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class GBJGM001Form {

	/** ユーザーID */
	private String userId;
	/** 現場ID */
	private String genbaId;
	/** 現場名 */
	private String genbaNa;
	/** 住所 */
	private String address;
	/** 最寄り駅1 */
	private String moyori1Station;
	/** 最寄り駅2 */
	private String Moyori2Station;
	/** 最寄り駅3 */
	private String Moyori3Station;
	/** 作業内容 */
	private String work;
	/** フェーズ */
	private String phase;
	/** 検索キーリスト */
	private List gbjgm001Form;
	/** ページ */
	private String page;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		return Moyori2Station;
	}
	public void setMoyori2Station(String moyori2Station) {
		Moyori2Station = moyori2Station;
	}
	public String getMoyori3Station() {
		return Moyori3Station;
	}
	public void setMoyori3Station(String moyori3Station) {
		Moyori3Station = moyori3Station;
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
	public List getGbjgm001Form() {
		return gbjgm001Form;
	}
	public void setGbjgm001Form(List gbjgm001Form) {
		this.gbjgm001Form = gbjgm001Form;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
}
