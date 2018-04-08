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
	@RequestMapping(value = "/initComGm001",params = "entryComGm001",method = RequestMethod.POST)
	public ModelAndView entryComGm001(COMGM001Form comGm001Form,Model model) {
		//Dtoを作成し、入力したユーザー名を設定
		COMGM001Dto comGm001Dto = new COMGM001Dto();
		comGm001Dto.setUserId(comGm001Form.getUserId());
		comGm001Dto.setPassword(comGm001Form.getPassword());

		//ユーザーID/Passが一致するかを確認
		comGm001Service.inputCheck(comGm001Dto);

		//ユーザーネームがNullでなければ
		if(comGm001Dto.getUserName()!=null) {
			//ModelAndView
			COMGM001MAV comGm001MAV = new COMGM001MAV();
			comGm001MAV.setUserName(comGm001Dto.getUserName());

			//ログイン情報設定
			LoginInfoDto loginInfoDto = new LoginInfoDto();
			loginInfoDto.setUserNa(comGm001Dto.getUserName());
			loginInfoDto.setUserId(comGm001Dto.getUserId());
			loginInfo.setAttribute(loginInfoDto);

			return new ModelAndView("forward:/initComGm002","COMGM001MAV",comGm001MAV);
		}

		//nullであれば、ログイン画面へ
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("COMGM001");
		return modelAndView;
	}

}