package jp.arise.sij.controller;

import java.util.Date;

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

		SIJGM002Form sijGm002Form = new SIJGM002Form();
		//Fomクラスに起動元画面を設定
		sijGm002Form.setGamenId(loginInfoDto.getGamenId());

		//Serviseクラスの社員ID採番処理を呼び出す。
		String syainId = sijGm002Service.getSyainId();
		//formに社員IDをセット
		sijGm002Form.setSyainId(syainId);

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
		//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		SIJGM002Form sijGm002Form = new SIJGM002Form();

		//Fromクラスに起動元画面を設定
		sijGm002Form.setGamenId(loginInfoDto.getGamenId());

		//FromクラスにMAVクラスの社員情報を設定する。
		sijGm002Form.setAddress("a");
		sijGm002Form.setAreaCd("a");
		sijGm002Form.setBirthPlace("19910101");
		sijGm002Form.setCityCd("a");
		sijGm002Form.setGenbaName("a");
		sijGm002Form.setMoyoriStation1("a");
		sijGm002Form.setMoyoriStation2("a");
		sijGm002Form.setMoyoriStation3("a");
		sijGm002Form.setName("a");
		sijGm002Form.setPhase("a");
		sijGm002Form.setPosition("a");
		sijGm002Form.setPrevious("a");
		sijGm002Form.setSeinengappi("a");
		sijGm002Form.setSubscriberNo("0001");
		sijGm002Form.setSyainId("1111");
		sijGm002Form.setTanka(400000);
		sijGm002Form.setTeamName("a");

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
		//Dtoを生成
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		String user = "test";
		Date date = new Date();

		//DtoクラスにFromクラスの値を設定する。
		sijGm002Dto.setAddress(sijGm002Form.getAddress());
		sijGm002Dto.setAreaCd(sijGm002Form.getAreaCd());
		sijGm002Dto.setBirthPlace(sijGm002Form.getBirthPlace());
		sijGm002Dto.setCityCd(sijGm002Form.getCityCd());
		sijGm002Dto.setGenbaName(sijGm002Form.getGenbaName());
		sijGm002Dto.setMoyoriStation1(sijGm002Form.getMoyoriStation1());
		sijGm002Dto.setMoyoriStation2(sijGm002Form.getMoyoriStation2());
		sijGm002Dto.setMoyoriStation3(sijGm002Form.getMoyoriStation3());
		sijGm002Dto.setName(sijGm002Form.getName());
		sijGm002Dto.setPhase(sijGm002Form.getPhase());
		sijGm002Dto.setPosition(sijGm002Form.getPosition());
		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
		sijGm002Dto.setSeinengappi(sijGm002Service.convertDate(sijGm002Form.getSeinengappi()));
		sijGm002Dto.setSubscriberNo(sijGm002Form.getSubscriberNo());
		sijGm002Dto.setSyainId(sijGm002Form.getSyainId());
		sijGm002Dto.setTanka(sijGm002Form.getTanka());
		sijGm002Dto.setTeamName(sijGm002Form.getTeamName());
		sijGm002Dto.setGenbaId("1111");
		sijGm002Dto.setDate(date);
		sijGm002Dto.setUser(user);

		//Serviseクラスのチェック処理を呼び出す。
		sijGm002Service.insertCheck(sijGm002Dto);

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

		//Dtoを生成
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();

		//DtoクラスにFromクラスの値を設定する。
		sijGm002Dto.setAddress(sijGm002Form.getAddress());
		sijGm002Dto.setAreaCd(sijGm002Form.getAreaCd());
		sijGm002Dto.setBirthPlace(sijGm002Form.getBirthPlace());
		sijGm002Dto.setCityCd(sijGm002Form.getCityCd());
		sijGm002Dto.setGenbaName(sijGm002Form.getGenbaName());
		sijGm002Dto.setMoyoriStation1(sijGm002Form.getMoyoriStation1());
		sijGm002Dto.setMoyoriStation2(sijGm002Form.getMoyoriStation2());
		sijGm002Dto.setMoyoriStation3(sijGm002Form.getMoyoriStation3());
		sijGm002Dto.setName(sijGm002Form.getName());
		sijGm002Dto.setPhase(sijGm002Form.getPhase());
		sijGm002Dto.setPosition(sijGm002Form.getPosition());
		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
		sijGm002Dto.setSeinengappi(sijGm002Service.convertDate(sijGm002Form.getSeinengappi()));
		sijGm002Dto.setSubscriberNo(sijGm002Form.getSubscriberNo());
		sijGm002Dto.setSyainId(sijGm002Form.getSyainId());
		sijGm002Dto.setTanka(sijGm002Form.getTanka());
		sijGm002Dto.setTeamName(sijGm002Form.getTeamName());

		//Serviseクラスのチェック処理を呼び出す。
		sijGm002Service.updateCheck(sijGm002Dto);

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
		//Dtoを生成
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();

		//Formの値をDtoに設定
		sijGm002Dto.setSyainId(sijGm002Form.getSyainId());

		//Serviseクラスのチェック処理を呼び出す。
		sijGm002Service.deleteCheck(sijGm002Dto);

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
		//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		//Serviseクラスのセッション情報設定処理を呼び出す。
		sijGm002Service.setSession(loginInfoDto);

		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();
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
		SIJGM002MAV sijGm002MAV = new SIJGM002MAV();

		//MAVクラスにFromクラスの社員情報を設定する。
		sijGm002MAV.setAddress("a");
		sijGm002MAV.setAreaCd("a");
		sijGm002MAV.setBirthPlace("a");
		sijGm002MAV.setCityCd("a");
		sijGm002MAV.setGenbaName("a");
		sijGm002MAV.setMoyoriStation1("a");
		sijGm002MAV.setMoyoriStation2("a");
		sijGm002MAV.setMoyoriStation3("a");
		sijGm002MAV.setName("a");
		sijGm002MAV.setPhase("a");
		sijGm002MAV.setPosition("a");
		sijGm002MAV.setPrevious("a");
		sijGm002MAV.setSeinengappi("a");
		sijGm002MAV.setSubscriberNo("0001");
		sijGm002MAV.setSyainId("1111");
		sijGm002MAV.setTanka(400000);
		sijGm002MAV.setTeamName("a");

		//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		//Serviseクラスのセッション情報設定処理を呼び出す。
		sijGm002Service.setSession(loginInfoDto);

		return new ModelAndView("forward:/initSijGm001","SIJGM002MAV",sijGm002MAV);
	}

}