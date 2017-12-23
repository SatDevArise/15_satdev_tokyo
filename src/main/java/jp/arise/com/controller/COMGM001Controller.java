package jp.arise.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.dto.COMGM001Dto;
import jp.arise.com.form.COMGM001Form;
import jp.arise.com.modelandview.COMGM001MAV;
import jp.arise.com.service.COMGM001Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;


/**
 * COMGM001 ログイン画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class COMGM001Controller {

	@Autowired
	public LoginInfo loginInfo;

	@Autowired
	private COMGM001Servise comGm001Service;

    @ModelAttribute
    public COMGM001Form setComGm001Formm() {
    	COMGM001Form comGm001Form = new COMGM001Form();
        return comGm001Form;
    }

	/**
	 * 初期処理
	 * @param model
	 * @return COMGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String initComGm001(Model model) {
		COMGM001Form comGm001Form = new COMGM001Form();
		comGm001Form.setUserId("山田 太郎");
		model.addAttribute("COMGM001Form",comGm001Form);
		return "COMGM001";
	}

	/**
	 * 確定処理
	 * @param COMGM001Form
	 * @return COMGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/",params = "entryComGm001",method = RequestMethod.POST)
	public ModelAndView  entryComGm001(COMGM001Form comGm001Form,Model model) {
		COMGM001Dto comGm001Dto = new COMGM001Dto();
		comGm001Dto.setUserId(comGm001Form.getUserId());
		comGm001Service.inputCheck(comGm001Dto);

		COMGM001MAV comGm001MAV = new COMGM001MAV();
		comGm001MAV.setUserId(comGm001Form.getUserId());

		//ログイン情報設定
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto.setUserNa("testuser");
		loginInfoDto.setUserId("0001");
		loginInfo.setAttribute(loginInfoDto);

		return new ModelAndView("forward:/initComGm002","COMGM001MAV",comGm001MAV);
	}

}
