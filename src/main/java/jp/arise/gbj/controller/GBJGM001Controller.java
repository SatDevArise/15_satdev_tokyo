package jp.arise.gbj.controller;

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
import jp.arise.gbj.form.GBJGM001Form;
import jp.arise.gbj.modelandview.GBJGM001MAV;
import jp.arise.gbj.modelandview.GBJGM002MAV;
import jp.arise.gbj.service.GBJGM001Servise;
import jp.arise.utl.LoginInfo;

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
		//Serviseクラスのセッション情報設定処理を呼び出す。
		gbjGm001Service.setSessionInfo();


		List<GBJGM001Form> gbjGm001Form = new ArrayList();
		model.addAttribute("GBJGM001FormList",gbjGm001Form);
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
    	//GBJGM002MAVの値をGBJGM001Formにセットする


		GBJGM001Form gbjGm001Form = new GBJGM001Form();
		model.addAttribute("GBJGM001Form",gbjGm001Form);
		return "GBJGM001";
	}

	/**
	 * 検索処理（遷移元：検索画面）
	 * @param model
	 * @return GBJGM001.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
    @RequestMapping(value = "/initGbjGm001",params = "searchGbjGm001", method = RequestMethod.POST)
	public String initGbjGm001(COMGM003MAV comGm003MAV,Model model) {
    	//GBJGM002MAVの値をGBJGM001Formにセットする
    	List<GBJGM001Form> formList = gbjGm001Service.setGBJGM001FormList(comGm003MAV.getResult());

		model.addAttribute("GBJGM001FormList",formList);
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
		//Serviseクラスのセッション情報設定処理を呼び出す。
		gbjGm001Service.setSessionInfo();

		GBJGM001MAV gbjGm001MAV = new GBJGM001MAV();
		gbjGm001MAV.setAddress(gbjGm001Form.getAddress());
		gbjGm001MAV.setGenbaId(gbjGm001Form.getGenbaId());
		gbjGm001MAV.setGenbaNa(gbjGm001Form.getGenbaNa());
		gbjGm001MAV.setMoyori1Station(gbjGm001Form.getMoyori1Station());
		gbjGm001MAV.setMoyori2Station(gbjGm001Form.getMoyori2Station());
		gbjGm001MAV.setMoyori3Station(gbjGm001Form.getMoyori3Station());
		gbjGm001MAV.setPage(gbjGm001Form.getPage());
		gbjGm001MAV.setPhase(gbjGm001Form.getPhase());
		gbjGm001MAV.setUserId(gbjGm001Form.getUserId());
		gbjGm001MAV.setWork(gbjGm001Form.getWork());

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
		//Serviseクラスのセッション情報設定処理を呼び出す。
		gbjGm001Service.setSessionInfo();

		GBJGM001MAV gbjGm001MAV = new GBJGM001MAV();
		return new ModelAndView("forward:/initComGm002","GBJGM001MAV",gbjGm001MAV);
	}

}
