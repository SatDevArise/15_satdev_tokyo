package jp.arise.gbj.form;

/**
 * GBJGM002 現場情報新規登録・編集画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class GBJGM002Form {

	private String genba_id;
	private String genba_na;
	private String address;
	private String moyori_1_station;
	private String moyori_2_station;
	private String moyori_3_station;
	private String work;
	private String phase;

	public String getGenba_id() {
		return genba_id;
	}
	public void setGenba_id(String genba_id) {
		this.genba_id = genba_id;
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
	/**
	 * ユーザー
	 */
	private String user;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

}
