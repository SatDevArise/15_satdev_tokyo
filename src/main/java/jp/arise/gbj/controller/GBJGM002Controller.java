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
import jp.arise.utl.UTLContent;

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

		GBJGM002Form gbjGm002Form = new GBJGM002Form();
		//Fromクラスに起動元画面を設定
		gbjGm002Form.setGamenId(UTLContent.GMID_COMGM002);
		//Serviseクラスの現場ID採番処理を呼び出す
		String genbaId = gbjGm002Service.getGenbaId();
		gbjGm002Form.setGenbaId(genbaId);
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
		gbjGm002Form.setUser("a");
		gbjGm002Form.setGenbaId("a");
		gbjGm002Form.setGenbaNa("a");
		gbjGm002Form.setAddress("a");
		gbjGm002Form.setMoyori1Station("a");
		gbjGm002Form.setMoyori2Station("a");
		gbjGm002Form.setMoyori3Station("a");
		gbjGm002Form.setWork("a");
		gbjGm002Form.setPhase("a");
		gbjGm002Form.setGamenId(UTLContent.GMID_GBJGM001);
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
		GBJGM002Dto dto = new GBJGM002Dto();
		dto.setGenbaId(gbjGm002Form.getGenbaId());
		dto.setGenbaNa(gbjGm002Form.getGenbaNa());
		dto.setAddress(gbjGm002Form.getAddress());
		dto.setMoyori1Station(gbjGm002Form.getMoyori1Station());
		dto.setMoyori2Station(gbjGm002Form.getMoyori2Station());
		dto.setMoyori3Station(gbjGm002Form.getMoyori3Station());
		dto.setWork(gbjGm002Form.getWork());
		dto.setPhase(gbjGm002Form.getPhase());
		dto.setPjId("1");
		dto.setYukoFg("0");
		dto.setSakujoFg("1");
		gbjGm002Service.insert(dto);
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
		GBJGM002Dto dto = new GBJGM002Dto();
		dto.setGenbaId(gbjGm002Form.getGenbaId());
		dto.setGenbaNa(gbjGm002Form.getGenbaNa());
		dto.setAddress(gbjGm002Form.getAddress());
		dto.setMoyori1Station(gbjGm002Form.getMoyori1Station());
		dto.setMoyori2Station(gbjGm002Form.getMoyori2Station());
		dto.setMoyori3Station(gbjGm002Form.getMoyori3Station());
		dto.setWork(gbjGm002Form.getWork());
		dto.setPhase(gbjGm002Form.getPhase());
		dto.setPjId("1");
		dto.setYukoFg("0");
		dto.setSakujoFg("1");

		gbjGm002Service.update(dto);
		return "GBJGM002";
	}

	/**
	 * 削除処理
	 * @param GBJGM002Form
	 * @return GBJGM002.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/177
	 */
	@RequestMapping(value = "/initGbjGm002",params = "deleteGbjGm002", method = RequestMethod.POST)
	public String deleteGbjGm002(GBJGM002Form gbjGm002Form,Model model) {
		GBJGM002Dto dto = new GBJGM002Dto();
		dto.setGenbaId(gbjGm002Form.getGenbaId());

		gbjGm002Service.delete(dto);
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
		gbjGm002Service.updateSession();
		GBJGM002MAV gbjGm002MAV = new GBJGM002MAV();
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
		gbjGm002Service.updateSession();
		GBJGM002MAV gbjGm002MAV = new GBJGM002MAV();
		gbjGm002MAV.setUser(gbjGm002Form.getUser());
		gbjGm002MAV.setGenbaId(gbjGm002Form.getGenbaId());
		gbjGm002MAV.setGenbaNa(gbjGm002Form.getGenbaNa());
		gbjGm002MAV.setAddress(gbjGm002Form.getAddress());
		gbjGm002MAV.setMoyori1Station(gbjGm002Form.getMoyori1Station());
		gbjGm002MAV.setMoyori2Station(gbjGm002Form.getMoyori2Station());
		gbjGm002MAV.setMoyori3Station(gbjGm002Form.getMoyori3Station());
		gbjGm002MAV.setWork(gbjGm002Form.getWork());
		gbjGm002MAV.setPhase(gbjGm002Form.getPhase());
		return new ModelAndView("forward:/initGbjGm001","GBJGM002MAV",gbjGm002MAV);
	}

}
