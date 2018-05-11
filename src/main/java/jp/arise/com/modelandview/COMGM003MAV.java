package jp.arise.com.modelandview;

import java.util.List;

import jp.arise.com.dto.COMGM003Dto;

/**
 * COMGM003 検索共通画面用ModelAndViewクラス
 * Controller間の値受け渡し用
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM003MAV {

	/**
	 * ユーザー
	 */
	private String userId;

	private List<COMGM003Dto> result;

	/**
	 * ユーザーを取得
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ユーザーを設定
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<COMGM003Dto> getResult() {
		return result;
	}

	public void setResult(List<COMGM003Dto> result) {
		this.result = result;
	}




}
