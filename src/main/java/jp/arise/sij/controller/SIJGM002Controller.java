package jp.arise.sij.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.modelandview.COMGM002MAV;
import jp.arise.sij.dto.SIJGM002Dto;
import jp.arise.sij.form.SIJGM002Form;
import jp.arise.sij.modelandview.SIJGM001MAV;
import jp.arise.sij.modelandview.SIJGM002MAV;
import jp.arise.sij.service.SIJGM002Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;
import jp.arise.utl.UTLContent;

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
		//画面ID更新処理
		sijGm002Service.upSession(UTLContent.GMID_COMGM002);

		//Formを生成
		SIJGM002Form sijGm002Form = new SIJGM002Form();

		//Serviseクラスの社員ID採番処理を呼び出す。
		String syainId = sijGm002Service.getSyainId();

		//Formに社員IDをセット
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
	@RequestMapping(value = "/SIJGM002", method = RequestMethod.GET)
	public String initSIJGm002(@RequestParam("syainId") String syainId,Model model){
		//画面ID更新処理
		sijGm002Service.upSession(UTLContent.GMID_SIJGM001);

		//GETパラメータから社員情報を取得
		SIJGM002Dto sijGm002Dto = sijGm002Service.getSyainInfo(syainId);

		//FormにSIJGM001MAVの情報を設定
		SIJGM002Form sijGm002Form = setSijgm002form(sijGm002Dto);

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

		//Formの情報をDtoにセットする。
		SIJGM002Dto sijGm002Dto = setSijgm002dto(sijGm002Form);

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
		//Formの情報をDtoにセットする。
		SIJGM002Dto sijGm002Dto = setSijgm002dto(sijGm002Form);

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
		//Formの情報をDtoにセットする。
		SIJGM002Dto sijGm002Dto = setSijgm002dto(sijGm002Form);

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
	@RequestMapping(value = "/initSijGm002",params = "back", method = RequestMethod.POST)
	public ModelAndView back(SIJGM002Form sijGm002Form,Model model) {
		//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();

		// セッション情報の遷移元画面を取得
		String strGamenId = (String) loginInfoDto.getGamenId();
		System.out.println("画面ID:"+strGamenId);

		// 戻り先画面格納用変数
		String returnGamen = null;

		if (strGamenId.equals(UTLContent.GMID_SIJGM001)) {
			returnGamen = "forward:/initSijGm001";
		} else if (strGamenId.equals(UTLContent.GMID_COMGM002)){
			returnGamen = "forward:/initComGm002";
		}
		System.out.println("戻り先:"+returnGamen);
		return new ModelAndView(returnGamen);
	}


	private SIJGM002Dto setSijgm002dto(SIJGM002Form sijGm002Form) {
		//Dtoを生成
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();

		//日付を取得
		Date date = new Date();
		//ログイン情報取得
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		String userId = (String)loginInfo.getAttribute().getUserId();

		//DtoにFormの値を設定する。
		sijGm002Dto.setAddress(sijGm002Form.getAddress());
		sijGm002Dto.setBirthPlace(sijGm002Form.getBirthPlace());
		sijGm002Dto.setMoyoriStation1(sijGm002Form.getMoyoriStation1());
		sijGm002Dto.setMoyoriStation2(sijGm002Form.getMoyoriStation2());
		sijGm002Dto.setMoyoriStation3(sijGm002Form.getMoyoriStation3());
		if(sijGm002Form.getHireDate() != null) {
			sijGm002Dto.setHireDate(sijGm002Service.convertDate(sijGm002Form.getHireDate()));
		}
		sijGm002Dto.setName(sijGm002Form.getName());
		sijGm002Dto.setPhase(sijGm002Form.getPhase());
		sijGm002Dto.setPosition(sijGm002Form.getPosition());
		sijGm002Dto.setPrevious(sijGm002Form.getPrevious());
		if(sijGm002Form.getSeinengappi() != null) {
			sijGm002Dto.setSeinengappi(sijGm002Service.convertDate(sijGm002Form.getSeinengappi()));
		}
		sijGm002Dto.setSyainId(sijGm002Form.getSyainId());
		sijGm002Dto.setTanka(sijGm002Form.getTanka());
		sijGm002Dto.setTeamName(sijGm002Form.getTeamName());

		sijGm002Dto.setGenbaId("");
		sijGm002Dto.setDate(date);
		sijGm002Dto.setUser(userId);

		return sijGm002Dto;
	}

	private SIJGM002Form setSijgm002form(SIJGM002Dto sijGm002Dto) {
		//Formを生成
		SIJGM002Form sijGm002Form = new SIJGM002Form();

		//FormにDtoの情報を設定する。
		sijGm002Form.setAddress(sijGm002Dto.getAddress());
		sijGm002Form.setBirthPlace(sijGm002Dto.getBirthPlace());
		sijGm002Form.setMoyoriStation1(sijGm002Dto.getMoyoriStation1());
		sijGm002Form.setMoyoriStation2(sijGm002Dto.getMoyoriStation2());
		sijGm002Form.setMoyoriStation3(sijGm002Dto.getMoyoriStation3());
		if(sijGm002Dto.getHireDate() != null) {
			sijGm002Form.setHireDate(sijGm002Service.parseDateToString(sijGm002Dto.getHireDate()));
		}
		sijGm002Form.setName(sijGm002Dto.getName());
		sijGm002Form.setPhase(sijGm002Dto.getPhase());
		sijGm002Form.setPosition(sijGm002Dto.getPosition());
		sijGm002Form.setPrevious(sijGm002Dto.getPrevious());
		if(sijGm002Dto.getSeinengappi() != null) {
			sijGm002Form.setSeinengappi(sijGm002Service.parseDateToString(sijGm002Dto.getSeinengappi()));
		}
		sijGm002Form.setSyainId(sijGm002Dto.getSyainId());
		sijGm002Form.setTanka(sijGm002Dto.getTanka());
		sijGm002Form.setTeamName(sijGm002Dto.getTeamName());

		return sijGm002Form;
	}

}