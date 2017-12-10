package jp.arise.sij.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.modelandview.COMGM002MAV;
import jp.arise.sij.dto.SIJGM002Dto;
import jp.arise.sij.form.SIJGM002Form;
import jp.arise.sij.modelandview.SIJGM001MAV;
import jp.arise.sij.modelandview.SIJGM002MAV;
import jp.arise.sij.service.SIJGM002Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;

/**
 * SIJGM002 社員情報新規登録・編集画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class SIJGM002Controller {

	@Autowired
	public LoginInfo loginInfo;

	@Autowired
	private SIJGM002Servise sijGm002Service;

    @ModelAttribute
    public SIJGM002Form setSijGm002Formm() {
    	SIJGM002Form sijGm002Form = new SIJGM002Form();
        return sijGm002Form;
    }

	/**
	 * 初期処理（遷移元：メニュー画面）
	 * @param model
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initSijGm002",params = "goSijGm002", method = RequestMethod.POST)
	public String initSijGm002(COMGM002MAV comGm002MAV,Model model) {
    	//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();
		System.out.println(loginInfoDto.getUserId());

		SIJGM002Form sijGm002Form = new SIJGM002Form();
		sijGm002Form.setUser("山田太郎");
		model.addAttribute("SIJGM002Form",sijGm002Form);
		return "SIJGM002";
	}

	/**
	 * 初期処理（遷移元：社員情報一覧表示画面<）
	 * @param model
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initSijGm002",params = "goToSijGm002",method = RequestMethod.POST)
	public String initSijGm002(Model model,SIJGM001MAV sijGm001MAV) {
		SIJGM002Form sijGm002Form = new SIJGM002Form();
		sijGm002Form.setUser(sijGm001MAV.getUser());
		model.addAttribute("SIJGM002Form",sijGm002Form);
		return "SIJGM002";
	}

	/**
	 * 新規登録処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "entrySijGm002", method = RequestMethod.POST)
	public String entrySijGm002(SIJGM002Form sijGm002Form,Model model) {
		return "SIJGM002";
	}

	/**
	 * 更新処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "updateSijGm002", method = RequestMethod.POST)
	public String updateSijGm002(SIJGM002Form sijGm002Form,Model model) {
		return "SIJGM002";
	}

	/**
	 * 削除処理
	 * @param SIJGM002Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "deleteSijGm002", method = RequestMethod.POST)
	public String deleteSijGm002(SIJGM002Form sijGm002Form,Model model) {
		return "SIJGM002";
	}

	/**
	 * 戻る処理（遷移先：メニュー画面）
	 * @param SIJGM002Form
	 * @return COMGM002Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "backComGm002", method = RequestMethod.POST)
	public ModelAndView backComGm002(SIJGM002Form sijGm002Form,Model model) {
//		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
//		sijGm002Dto.setUser(sijGm002Form.getUser());
//		sijGm002Service.inputCheck(sijGm002Dto);

		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();
//		sijGm002MAV.setUser(sijGm002Form.getUser());
		return new ModelAndView("forward:/initComGm002","SIJGM002MAV",sijGm002MAV);
	}

	/**
	 * 戻る処理（遷移先：社員情報一覧表示画面）
	 * @param SIJGM002Form
	 * @return SiJGM001Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm002",params = "backSijGm001", method = RequestMethod.POST)
	public ModelAndView backSijGm001(SIJGM002Form sijGm002Form,Model model) {
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		sijGm002Dto.setUser(sijGm002Form.getUser());
		sijGm002Service.inputCheck(sijGm002Dto);

		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();
		sijGm002MAV.setUser(sijGm002Form.getUser());
		return new ModelAndView("forward:/initSijGm001","SIJGM002MAV",sijGm002MAV);
	}

}
