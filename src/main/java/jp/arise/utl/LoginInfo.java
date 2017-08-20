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
	 * @since 2017/07/177
	 */
	public void setAttribute(LoginInfoDto loginInfoDto) {
		    session.setAttribute("USER", loginInfoDto.getUser());
			session.setAttribute("USERID", loginInfoDto.getUserId());
	}

	/**
	 * セッション取得
	 * @return LoginInfoDto
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	public LoginInfoDto getAttribute() {
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto.setUser(session.getAttribute("USER"));
		loginInfoDto.setUserId(session.getAttribute("USERID"));
		return loginInfoDto;
	}

	/**
	 * セッション破棄
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	public void invalidate() {
		session.invalidate();
	}

}
