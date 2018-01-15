package jp.arise.sij.dto;

import java.io.Serializable;

/**
 * SIJGM001 社員情報一覧表示画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM001Dto implements Serializable{

	/**
	 * ユーザー
	 */
	private String user;

	/**
	 * 社員ID
	 */
	private String userId;

	/**
	 * 役職
	 */
	private String title;

	/**
	 * 生年月日
	 */
	private String birthday;

	/**
	 * チーム
	 */
	private String team;

	/**
	 * 現場名
	 */
	private String site;

	/**
	 * 経過年数
	 */
	private String duration;

	/**
	 * フェーズ
	 */
	private String phase;

	/**
	 * 使用路線
	 */
	private String route;

	/**
	 * 社歴
	 */
	private String history;

	/**
	 * 単価
	 */
	private int price;

	/**
	 * ユーザーを取得
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 社員IDを取得
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 役職を取得
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 生年月日を取得
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * チームを取得
	 * @return team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * 現場名を取得
	 * @return site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * 経過年数を取得
	 * @return duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * フェーズを取得
	 * @return phase
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * 使用路線を取得
	 * @return route
	 */
	public String getRoute() {
		return route;
	}

	/**
	 * 社歴を取得
	 * @return history
	 */
	public String getHistory() {
		return history;
	}

	/**
	 * 単価を取得
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * ユーザーを設定
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 社員IDを設定
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 役職を設定
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 生年月日を設定
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * チームを設定
	 * @param team
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * 現場名を設定
	 * @param site
	 */
	public void setSite(String site) {
		this.site = site;
	}
	/**
	 * 経過年数を設定
	 * @param duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * フェーズを設定
	 * @param phase
	 */
	public void setPhase(String phase) {
		this.phase = phase;
	}

	/**
	 * 使用路線を設定
	 * @param route
	 */
	public void setRoute(String route) {
		this.route = route;
	}

	/**
	 * 社歴を設定
	 * @param history
	 */
	public void setHistory(String history) {
		this.history = history;
	}

	/**
	 * 単価を設定
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

}