package jp.arise.utl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		    session.setAttribute("USERID", loginInfoDto.getUser_id());
			session.setAttribute("USERNA", loginInfoDto.getUser_na());
		    session.setAttribute("UNYOUBI", loginInfoDto.getUnyoubi());
			session.setAttribute("GAMENID", loginInfoDto.getGamen_id());

	}

	/**
	 * セッション取得
	 * @return LoginInfoDto
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	public LoginInfoDto getAttribute() {
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto.setUser_id(session.getAttribute("USERID"));
		loginInfoDto.setUser_na(session.getAttribute("USERNA"));
		loginInfoDto.setUnyoubi(session.getAttribute("UNYOUBI"));
		loginInfoDto.setGamen_id(session.getAttribute("GAMENID"));
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