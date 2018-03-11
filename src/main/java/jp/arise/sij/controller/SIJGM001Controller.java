package jp.arise.sij.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.modelandview.COMGM003MAV;
import jp.arise.sij.dto.SIJGM001Dto;
import jp.arise.sij.form.SIJGM001Form;
import jp.arise.sij.modelandview.SIJGM001MAV;
import jp.arise.sij.modelandview.SIJGM002MAV;
import jp.arise.sij.service.SIJGM001Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;

/**
 * SIJGM001 社員情報一覧表示画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class SIJGM001Controller {

	@Autowired
	public LoginInfo loginInfo;

	@Autowired
	private SIJGM001Servise sijGm001Service;

    @ModelAttribute
    public SIJGM001Form setSIJGM001Formm() {
    	SIJGM001Form sijGm001Form = new SIJGM001Form();
        return sijGm001Form;
    }

	/**
	 * 初期処理（遷移元：メニュー画面）
	 * @param model
	 * @return SIJGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
    @RequestMapping(value = "/initSijGm001", method = RequestMethod.POST)
	public String initSijGm001(Model model) {
		sijGm001Service.setSession();

		List<SIJGM001Form> SijGm001FormList = new ArrayList();

		for(int i=0;i<20;i++) {
			SIJGM001Form form = new SIJGM001Form();
			form.setPrice(1000);
			SijGm001FormList.add(form);
		}

		model.addAttribute("SIJGM001FormList", SijGm001FormList);

		return "SIJGM001";

	}

	/**
	 * 初期処理（遷移元：社員情報新規登録・編集画面）
	 * @param model
	 * @return SIJGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
    @RequestMapping(value = "/initSijGm001",params = "backSijGm001", method = RequestMethod.POST)
	public String initSijGm001(SIJGM002MAV sijGm002MAV,Model model) {
		SIJGM001Form sijGm001Form = new SIJGM001Form();
		sijGm001Form.setUser(sijGm002MAV.getUser());
		model.addAttribute("SIJGM001Form",sijGm001Form);
		sijGm001Service.setSession();

		return "SIJGM001";
	}

	/**
	 * 社員情報新規登録・編集画面遷移処理
	 * @param SIJGM001Form
	 * @return SIJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initSijGm001",params = "goToSijGm002",method = RequestMethod.POST)
	public ModelAndView  goToSijGm002(SIJGM001Form sijGm001Form,Model model) {
		SIJGM001Dto sijGm001Dto = new SIJGM001Dto();
		sijGm001Dto.setUser(sijGm001Form.getUser());

		SIJGM001MAV sijGm001MAV = new SIJGM001MAV();
		sijGm001MAV.setUser(sijGm001Form.getUser());

		return new ModelAndView("forward:/initSijGm002","SIJGM001MAV",sijGm001MAV);
	}

	/**
	 * 検索処理（遷移元：検索画面）
	 * @param model
	 * @return SIJGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
    @RequestMapping(value = "/resultSijGm001", method = RequestMethod.POST)
	public String initSijGm001(COMGM003MAV comGm003MAV, Model model) {

    	//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		//COMGM003DtoをSIJGM001Formにセットする

    	@SuppressWarnings("unchecked")
		List<SIJGM001Form> formList = sijGm001Service.setSijgm001FormList(comGm003MAV.getResult());
		model.addAttribute("SIJGM001FormList",formList);
		return "SIJGM001";
	}


	/**
	 * 戻る処理（遷移先：メニュー画面）
	 * @param SIJGM001Form
	 * @return COMGM002Controller.java
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initSijGm001",params = "backComGm002",method = RequestMethod.POST)
	public ModelAndView  backComGm002(SIJGM001Form sijGm001Form,Model model) {
		SIJGM001Dto sijGm001Dto = new SIJGM001Dto();
		sijGm001Dto.setUser(sijGm001Form.getUser());

		SIJGM001MAV sijGm001MAV = new SIJGM001MAV();
		sijGm001MAV.setUser(sijGm001Form.getUser());

		return new ModelAndView("forward:/initComGm002","SIJGM001MAV",sijGm001MAV);
	}

	/**
	 * 社員情報リストの呼び出し
	 *
	 * @param syainList
	 * @throws @author
	 *             Narumi
	 * @since 2018/1/8
	 */
	//COMGm003MAV.javaにgetResult()があるが使用していないためコメントアウト
    //@RequestMapping(value = "/initSijGm001",params = "backSijGm001", method = RequestMethod.POST)
	//public void backComGm003(COMGM003MAV COMGm003MAV,Model model) {
	//	sijGm001Service.setSijgm001FormList(COMGm003MAV.getResult(), null);
    //}

}