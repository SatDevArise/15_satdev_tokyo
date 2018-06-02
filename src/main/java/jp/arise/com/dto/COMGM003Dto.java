package jp.arise.com.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * COMGM003 検索共通画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM003Dto implements Serializable{

	/**
	 * ユーザー
	 */
	private String user;

	/**
	 * ユーザーID
	 */
	private String userId;

	private String syainId;

	private String syainName;

	private String seinengappiFrom;

	private String seinengappiTo;

	private String previous;

	private String psition;

	private String nyusyabiFrom;

	private String nyusyabiTo;

	private String teamNa;

	private String genbaNa;

	private String genbaId;

	private String work;

	private String phase;

	private BigDecimal tanka;

	private String moyori1Station;

	private String moyori2Station;

	private String moyori3Station;

	private String address;

    private String genbasankakuFrom;

    private String genbasankakuTo;

    private String siyorosen;

    private int yuko_fg;

    private int sakujo_fg;


	public String getSyainId() {
		return syainId;
	}

	public void setSyainId(String syainId) {
		this.syainId = syainId;
	}

	public String getSyainName() {
		return syainName;
	}

	public void setSyainName(String syainName) {
		this.syainName = syainName;
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

	public BigDecimal getTanka() {
		return tanka;
	}

	public void setTanka(BigDecimal tanka) {
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

	/**
	 * ユーザーIDを取得
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを設定
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGenbaId() {
		return genbaId;
	}

	public void setGenbaId(String genbaId) {
		this.genbaId = genbaId;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getGenbasankakuFrom() {
		return genbasankakuFrom;
	}

	public void setGenbasankakuFrom(String genbasankakuFrom) {
		this.genbasankakuFrom = genbasankakuFrom;
	}

	public String getGenbasankakuTo() {
		return genbasankakuTo;
	}

	public void setGenbasankakuTo(String genbasankakuTo) {
		this.genbasankakuTo = genbasankakuTo;
	}

	public String getSiyorosen() {
		return siyorosen;
	}

	public void setSiyorosen(String siyorosen) {
		this.siyorosen = siyorosen;
	}

	public int getYuko_fg() {
		return yuko_fg;
	}

	public void setYuko_fg(int yuko_fg) {
		this.yuko_fg = yuko_fg;
	}

	public int getSakujo_fg() {
		return sakujo_fg;
	}

	public void setSakujo_fg(int sakujo_fg) {
		this.sakujo_fg = sakujo_fg;
	}

}
