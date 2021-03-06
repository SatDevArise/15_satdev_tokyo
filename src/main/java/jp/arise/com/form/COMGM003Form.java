package jp.arise.com.form;

/**
 * COMGM003 検索共通画面用Formクラス
 * JSPとController間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM003Form {

	/**
	 * ユーザー
	 */
	private String user;

	private String syainId;
	private String seinengappiFrom;
	private String seinengappiTo;
	private String previous;
	private String psition;
	private String nyusyabiFrom;
	private String nyusyabiTo;
	private String teamNa;
	private String genbaNa;
	private String phase;
	private String tanka;
//	private int tanka;
	private String moyori1Station;
	private String moyori2Station;
	private String moyori3Station;
	private String address;


	public String getSyainId() {
		return syainId;
	}

	public void setSyainId(String syainId) {
		this.syainId = syainId;
	}

	public String getSeinengappiFrom() {
		return seinengappiFrom;
	}

	public void setSeinengappiFrom(String seinengappiFrom) {
		this.seinengappiFrom = seinengappiFrom;
	}

	public String getSeinengappiTo() {
		return seinengappiTo;
	}

	public void setSeinengappiTo(String seinengappiTo) {
		this.seinengappiTo = seinengappiTo;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getPsition() {
		return psition;
	}

	public void setPsition(String psition) {
		this.psition = psition;
	}

	public String getNyusyabiFrom() {
		return nyusyabiFrom;
	}

	public void setNyusyabiFrom(String nyusyabiFrom) {
		this.nyusyabiFrom = nyusyabiFrom;
	}

	public String getNyusyabiTo() {
		return nyusyabiTo;
	}

	public void setNyusyabiTo(String nyusyabiTo) {
		this.nyusyabiTo = nyusyabiTo;
	}

	public String getTeamNa() {
		return teamNa;
	}

	public void setTeamNa(String teamNa) {
		this.teamNa = teamNa;
	}

	public String getGenbaNa() {
		return genbaNa;
	}

	public void setGenbaNa(String genbaNa) {
		this.genbaNa = genbaNa;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getTanka() {
		return tanka;
	}

	public void setTanka(String tanka) {
		this.tanka = tanka;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



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
