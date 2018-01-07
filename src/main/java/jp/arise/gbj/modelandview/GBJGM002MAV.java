package jp.arise.gbj.modelandview;

/**
 * GBJGM002 現場情報新規登録・編集画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class GBJGM002MAV {

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
