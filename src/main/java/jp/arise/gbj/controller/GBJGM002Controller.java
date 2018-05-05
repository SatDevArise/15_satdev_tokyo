package jp.arise.gbj.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

		System.out.println("usename:" + loginInfoDto.getUserNa());

		GBJGM002Form gbjGm002Form = new GBJGM002Form();
		gbjGm002Form.setGamen_id(UTLContent.GMID_COMGM002);
		//Serviseクラスの現場ID採番処理を呼び出す。
		String genbaId = gbjGm002Service.getGenbaId();
		gbjGm002Form.setGenba_id(genbaId);
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
		gbjGm002Form.setGamen_id(UTLContent.GMID_GBJGM001);
		model.addAttribute("GBJGM002Form",gbjGm002Form);

		//FromクラスにMAVクラスの現場情報を設定する。
		gbjGm002Form.setGenba_id(gbjGm001MAV.getGenbaId());
		gbjGm002Form.setGenba_na(gbjGm001MAV.getGenbaNa());
		gbjGm002Form.setAddress(gbjGm001MAV.getAddress());
		gbjGm002Form.setMoyori_1_station(gbjGm001MAV.getMoyori1Station());
		gbjGm002Form.setMoyori_2_station(gbjGm001MAV.getMoyori2Station());
		gbjGm002Form.setMoyori_3_station(gbjGm001MAV.getMoyori3Station());
		gbjGm002Form.setWork(gbjGm001MAV.getWork());
		gbjGm002Form.setPhase(gbjGm001MAV.getPhase());
		gbjGm002Form.setPi_id("0");
		gbjGm002Form.setYuko_fg("1");
		gbjGm002Form.setSakujo_fg("0");
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
	@RequestMapping(value = "/GBJGM002", method = RequestMethod.GET)
	public String initGBJGm002(@RequestParam("genbaId") String genbaId,Model model){
		//画面ID更新処理
//		gbjGm002Service.upSession(UTLContent.GMID_GBJGM001);

		//GETパラメータから現場情報を取得
//		GBJGM002Dto gbjGm002Dto = gbjGm002Service.getGenbaInfo(genbaId);

		//FormにGBJGM001MAVの情報を設定
//		GBJGM002Form sijGm002Form = setGbjgm002form(gbjGm002Dto);

//		model.addAttribute("GBJGM002Form",gbjGm002Form);
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
    	//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		GBJGM002Dto gbjGm002Dto = new GBJGM002Dto();
		gbjGm002Dto.setGenba_Id(gbjGm002Form.getGenba_id());
		gbjGm002Dto.setGenba_na(gbjGm002Form.getGenba_na());
		gbjGm002Dto.setAddress(gbjGm002Form.getAddress());
		gbjGm002Dto.setMoyori_1_station(gbjGm002Form.getMoyori_1_station());
		gbjGm002Dto.setMoyori_2_station(gbjGm002Form.getMoyori_2_station());
		gbjGm002Dto.setMoyori_3_station(gbjGm002Form.getMoyori_3_station());
		gbjGm002Dto.setWork(gbjGm002Form.getWork());
		gbjGm002Dto.setPhase(gbjGm002Form.getPhase());
		gbjGm002Dto.setPi_id("0");
		gbjGm002Dto.setYuko_fg("1");
		gbjGm002Dto.setSakujo_fg("0");
		gbjGm002Dto.setInsert_date(new Date());
		gbjGm002Dto.setInsert_user((String) loginInfoDto.getUserNa());

		System.out.println("dtoのセット");

		gbjGm002Service.insertCheck(gbjGm002Dto);


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
		//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		GBJGM002Dto gbjGm002Dto = new GBJGM002Dto();
		gbjGm002Dto.setGenba_Id(gbjGm002Form.getGenba_id());
		gbjGm002Dto.setGenba_na(gbjGm002Form.getGenba_na());
		gbjGm002Dto.setAddress(gbjGm002Form.getAddress());
		gbjGm002Dto.setMoyori_1_station(gbjGm002Form.getMoyori_1_station());
		gbjGm002Dto.setMoyori_2_station(gbjGm002Form.getMoyori_2_station());
		gbjGm002Dto.setMoyori_3_station(gbjGm002Form.getMoyori_3_station());
		gbjGm002Dto.setWork(gbjGm002Form.getWork());
		gbjGm002Dto.setPhase(gbjGm002Form.getPhase());
		gbjGm002Dto.setPi_id("0");
		gbjGm002Dto.setYuko_fg("1");
		gbjGm002Dto.setSakujo_fg("0");
		gbjGm002Dto.setUpdate_date(new Date());
		gbjGm002Dto.setUpdate_user((String) loginInfoDto.getUserNa());

		System.out.println("更新dtoのセット");

		gbjGm002Service.updateCheck(gbjGm002Dto);
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
		//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		GBJGM002Dto gbjGm002Dto = new GBJGM002Dto();
		gbjGm002Dto.setGenba_Id(gbjGm002Form.getGenba_id());
		gbjGm002Dto.setYuko_fg("0");
		gbjGm002Dto.setSakujo_fg("1");
		gbjGm002Dto.setDelete_date(new Date());
		gbjGm002Dto.setDelete_user((String) loginInfoDto.getUserNa());

		gbjGm002Service.deleteCheck(gbjGm002Dto);

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

		//Serviseクラスのセッション情報設定処理を呼び出す。
		//gbjGm002Service.updateSession();
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

		GBJGM002MAV gbjGm002MAV = new GBJGM002MAV();
		gbjGm002MAV.setGenbaId(gbjGm002Form.getGenba_id());
		gbjGm002MAV.setGenba_Na(gbjGm002Form.getGenba_na());
		gbjGm002MAV.setAdress(gbjGm002Form.getAddress());
		gbjGm002MAV.setMoyori1(gbjGm002Form.getMoyori_1_station());
		gbjGm002MAV.setMoyori2(gbjGm002Form.getMoyori_2_station());
		gbjGm002MAV.setMoyori3(gbjGm002Form.getMoyori_3_station());
		gbjGm002MAV.setWork(gbjGm002Form.getWork());
		gbjGm002MAV.setPhase(gbjGm002Form.getPhase());
		gbjGm002MAV.setPi_id("0");
		gbjGm002MAV.setYuko_fg("1");
		gbjGm002MAV.setSakujo_fg("0");
		//Serviseクラスのセッション情報設定処理を呼び出す。
		//gbjGm002Service.updateSession();

		return new ModelAndView("forward:/initGbjGm001","GBJGM002MAV",gbjGm002MAV);
	}

}
