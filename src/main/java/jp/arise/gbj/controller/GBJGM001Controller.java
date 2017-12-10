package jp.arise.gbj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.gbj.dto.GBJGM001Dto;
import jp.arise.gbj.form.GBJGM001Form;
import jp.arise.gbj.modelandview.GBJGM001MAV;
import jp.arise.gbj.modelandview.GBJGM002MAV;
import jp.arise.gbj.service.GBJGM001Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;

/**
 * GBJGM001 現場情報一覧表示画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class GBJGM001Controller {

	@Autowired
	public LoginInfo loginInfo;

	@Autowired
	private GBJGM001Servise gbjGm001Service;

    @ModelAttribute
    public GBJGM001Form setGBJGM001Formm() {
    	GBJGM001Form gbjGm001Form = new GBJGM001Form();
        return gbjGm001Form;
    }

	/**
	 * 初期処理（遷移元：メニュー画面）
	 * @param model
	 * @return GBJGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
    @RequestMapping(value = "/initGbjGm001", method = RequestMethod.POST)
	public String initGbjGm001(Model model) {
    	//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();
		System.out.println(loginInfoDto.getUserId());

		GBJGM001Form gbjGm001Form = new GBJGM001Form();
		gbjGm001Form.setUser("テスト太郎");
		model.addAttribute("GBJGM001Form",gbjGm001Form);
		return "GBJGM001";
	}

	/**
	 * 初期処理（遷移元：現場情報新規登録・編集画面）
	 * @param model
	 * @return GBJGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
    @RequestMapping(value = "/initGbjGm001",params = "backGbjGm001", method = RequestMethod.POST)
	public String initGbjGm001(GBJGM002MAV gbjGm002MAV,Model model) {
		GBJGM001Form gbjGm001Form = new GBJGM001Form();
		gbjGm001Form.setUser(gbjGm002MAV.getUser());
		model.addAttribute("GBJGM001Form",gbjGm001Form);
		return "GBJGM001";
	}

	/**
	 * 現場情報新規登録・編集画面遷移処理
	 * @param GBJGM001Form
	 * @return GBJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initGbjGm001",params = "goToGbjGm002",method = RequestMethod.POST)
	public ModelAndView  goToGbjGm002(GBJGM001Form gbjGm001Form,Model model) {
		GBJGM001Dto gbjGm001Dto = new GBJGM001Dto();
		gbjGm001Dto.setUser(gbjGm001Form.getUser());
		gbjGm001Service.inputCheck(gbjGm001Dto);

		GBJGM001MAV gbjGm001MAV = new GBJGM001MAV();
		gbjGm001MAV.setUser(gbjGm001Form.getUser());

		return new ModelAndView("forward:/initGbjGm002","GBJGM001MAV",gbjGm001MAV);
	}

	/**
	 * 戻る処理（遷移先：メニュー画面）
	 * @param GBJGM001Form
	 * @return COMGM002Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initGbjGm001",params = "backComGm002",method = RequestMethod.POST)
	public ModelAndView  backComGm002(GBJGM001Form gbjGm001Form,Model model) {
		GBJGM001Dto gbjGm001Dto = new GBJGM001Dto();
		gbjGm001Dto.setUser(gbjGm001Form.getUser());
		gbjGm001Service.inputCheck(gbjGm001Dto);

		GBJGM001MAV gbjGm001MAV = new GBJGM001MAV();
		gbjGm001MAV.setUser(gbjGm001Form.getUser());

		return new ModelAndView("forward:/initComGm002","GBJGM001MAV",gbjGm001MAV);
	}

}
