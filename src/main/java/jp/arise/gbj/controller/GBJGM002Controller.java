package jp.arise.gbj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.gbj.dto.GBJGM002Dto;
import jp.arise.gbj.form.GBJGM002Form;
import jp.arise.gbj.modelandview.GBJGM001MAV;
import jp.arise.gbj.modelandview.GBJGM002MAV;
import jp.arise.gbj.service.GBJGM002Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;

/**
 * GBJGM002 現場情報新規登録・編集画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class GBJGM002Controller {

	@Autowired
	public LoginInfo loginInfo;

	@Autowired
	private GBJGM002Servise gbjGm002Service;

    @ModelAttribute
    public GBJGM002Form setGbjGm002Formm() {
    	GBJGM002Form gbjGm002Form = new GBJGM002Form();
        return gbjGm002Form;
    }

	/**
	 * 初期処理（遷移元：メニュー画面）
	 * @param model
	 * @return GBJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initGbjGm002",params = "goGbjGm002", method = RequestMethod.POST)
	public String initGbjGm002(Model model) {
    	//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();
		System.out.println(loginInfoDto.getUser());

		GBJGM002Form gbjGm002Form = new GBJGM002Form();
		gbjGm002Form.setUser("山田太郎");
		model.addAttribute("GBJGM002Form",gbjGm002Form);
		return "GBJGM002";
	}

	/**
	 * 初期処理（遷移元：現場情報一覧表示画面<）
	 * @param model
	 * @return GBJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initGbjGm002",params = "goToGbjGm002",method = RequestMethod.POST)
	public String initGbjGm002(Model model,GBJGM001MAV gbjGm001MAV) {
		GBJGM002Form gbjGm002Form = new GBJGM002Form();
		gbjGm002Form.setUser(gbjGm001MAV.getUser());
		model.addAttribute("GBJGM002Form",gbjGm002Form);
		return "GBJGM002";
	}

	/**
	 * 新規登録処理
	 * @param GBJGM002Form
	 * @return GBJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initGbjGm002",params = "entryGbjGm002", method = RequestMethod.POST)
	public String entryGbjGm002(GBJGM002Form gbjGm002Form,Model model) {
		return "GBJGM002";
	}

	/**
	 * 更新処理
	 * @param GBJGM002Form
	 * @return GBJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initGbjGm002",params = "updateGbjGm002", method = RequestMethod.POST)
	public String updateGbjGm002(GBJGM002Form gbjGm002Form,Model model) {
		return "GBJGM002";
	}

	/**
	 * 戻る処理（遷移先：メニュー画面）
	 * @param GBJGM002Form
	 * @return COMGM002Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initGbjGm002",params = "backComGm002", method = RequestMethod.POST)
	public ModelAndView backComGm002(GBJGM002Form gbjGm002Form,Model model) {
		GBJGM002Dto gbjGm002Dto = new GBJGM002Dto();
		gbjGm002Dto.setUser(gbjGm002Form.getUser());
		gbjGm002Service.inputCheck(gbjGm002Dto);

		GBJGM002MAV gbjGm002MAV = new GBJGM002MAV();
		gbjGm002MAV.setUser(gbjGm002Form.getUser());
		return new ModelAndView("forward:/initComGm002","GBJGM002MAV",gbjGm002MAV);
	}

	/**
	 * 戻る処理（遷移先：現場情報一覧表示画面）
	 * @param GBJGM002Form
	 * @return GBJGM001Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initGbjGm002",params = "backGbjGm001", method = RequestMethod.POST)
	public ModelAndView backGbjGm001(GBJGM002Form gbjGm002Form,Model model) {
		GBJGM002Dto gbjGm002Dto = new GBJGM002Dto();
		gbjGm002Dto.setUser(gbjGm002Form.getUser());
		gbjGm002Service.inputCheck(gbjGm002Dto);

		GBJGM002MAV gbjGm002MAV = new GBJGM002MAV();
		gbjGm002MAV.setUser(gbjGm002Form.getUser());
		return new ModelAndView("forward:/initGbjGm001","GBJGM002MAV",gbjGm002MAV);
	}

}
