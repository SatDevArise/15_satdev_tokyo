package jp.arise.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.arise.com.dto.COMGM003Dto;
import jp.arise.com.form.COMGM003Form;
import jp.arise.com.service.COMGM003Servise;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;
import jp.arise.utl.UTLContent;


/**
 * COMGM003 検索共通画面用コントローラー
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Controller
public class COMGM003Controller {

	@Autowired
	private COMGM003Servise comGm003Service;

	@Autowired
	public LoginInfo loginInfo;

    @ModelAttribute
    public COMGM003Form setComGm003Formm() {
    	COMGM003Form comGm003Form = new COMGM003Form();
        return comGm003Form;
    }

	/**
	 * 初期処理
	 * @param model
	 * @return COMGM003.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm003", method = RequestMethod.POST)
	public String initComGm003(Model model) {
		COMGM003Form comGm003Form = new COMGM003Form();
		model.addAttribute("COMGM003Form",comGm003Form);
		return "COMGM003";
	}

	/**
	 * 確定処理
	 * @param COMGM003Form
	 * @return COMGM003.jsp
	 * @throws
	 * @author AtsushiNishizawa
	 * @since 2017/07/17
	 */
	@RequestMapping(value = "/initComGm003",params = "searchComGm003",method = RequestMethod.POST)
	public ModelAndView  searchComGm003(COMGM003Form comGm003Form,Model model) {
    		// 遷移元画面判定処理
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();
		// セッション情報の遷移元画面を取得
		String strGamenId = (String) loginInfoDto.getGamenId();

		COMGM003Dto comGm003Dto = comGm003Service.setInfo(comGm003Form);
		List<COMGM003Dto> resultList = comGm003Service.search(comGm003Dto);

		loginInfo.updateAttributeSearchResult(resultList);

		// 戻り先画面格納用変数
		String returnGamen = null;

		if (strGamenId.equals(UTLContent.GMID_SIJGM001)) {
			// 社員情報の場合、社員情報検索処理を呼び出す
			returnGamen = "forward:/resultSijGm001";
		} else if (strGamenId.equals(UTLContent.GMID_GBJGM001)){
			// 現場情報の場合、現場情報検索処理を呼び出す。
			returnGamen = "forward:/resultGbjGm001";
		}

		return new ModelAndView(returnGamen);

	}

}
