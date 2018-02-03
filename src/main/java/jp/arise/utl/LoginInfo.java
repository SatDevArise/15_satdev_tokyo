package jp.arise.utl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dto.COMGM003Dto;

/**
 * ログイン情報保持用セッションクラス
 * プロジェクトで共通利用されるセッション情報
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class LoginInfo {

	@Autowired
	HttpSession session;

	/**
	 * セッション登録
	 * @param LoginInfoDto
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	public void setAttribute(LoginInfoDto loginInfoDto) {
		session.setAttribute("USERID", loginInfoDto.getUserId());
		session.setAttribute("USERNA", loginInfoDto.getUserNa());
		session.setAttribute("UNYOUBI", loginInfoDto.getUnyoubi());
		session.setAttribute("GAMENID", loginInfoDto.getGamenId());
		session.setAttribute("SEARCHRESULT", loginInfoDto.getSearchResult());
	}

	/**
	 * セッション設定(遷移元画面)
	 * @param gamenId
	 * @author MasahikoHayashi
	 * @since 2017/12/10
	 */
	public void updateAttributeGamenId(String gamenId) {
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = this.getAttribute();
		loginInfoDto.setGamenId(gamenId);
		this.setAttribute(loginInfoDto);
	}


	/**
	 * セッション設定(検索結果)
	 * @param gamenId
	 * @author MasahikoHayashi
	 * @since 2017/12/10
	 */
	public void updateAttributeSearchResult(List<COMGM003Dto> resultList) {
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = this.getAttribute();
		loginInfoDto.setSearchResult(resultList);
		this.setAttribute(loginInfoDto);
	}


	/**
	 * セッション取得
	 * @return LoginInfoDto
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	public LoginInfoDto getAttribute() {
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto.setUserId(session.getAttribute("USERID"));
		loginInfoDto.setUserNa(session.getAttribute("USERNA"));
		loginInfoDto.setUnyoubi(session.getAttribute("UNYOUBI"));
		loginInfoDto.setGamenId(session.getAttribute("GAMENID"));
		loginInfoDto.setSearchResult(session.getAttribute("SEARCHRESULT"));
		return loginInfoDto;
	}

	/**
	 * セッション破棄
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	public void invalidate() {
		session.invalidate();
	}

}