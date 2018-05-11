package jp.arise.com.dto;

import java.io.Serializable;

/**
 * COMGM002 メニュー画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class COMGM002Dto implements Serializable{

	/**
	 * お知らせ内容
	 */
	private String osiraseInfo;

	public String getOsiraseInfo() {
		return osiraseInfo;
	}

	public void setOsiraseInfo(String osiraseInfo) {
		this.osiraseInfo = osiraseInfo;
	}

}
