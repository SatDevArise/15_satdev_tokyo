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
	@RequestMapping(value = "/initComGm003", method = RequestMethod.GET)
	public String initComGm003(Model model) {
		COMGM003Form comGm003Form = new COMGM003Form();
		comGm003Form.setUser("山田 太郎");
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
		COMGM003Dto comGm003Dto = new COMGM003Dto();
		comGm003Dto.setUser(comGm003Form.getUser());
		System.out.println("inputCheck前");
		comGm003Service.inputCheck(comGm003Dto);
		System.out.println("inputCheck後");
		List<COMGM003Dto> resultList = comGm003Service.search(comGm003Dto);

		loginInfo.updateAttributeSearchResult(resultList);
		return new ModelAndView("forward:/resultGbjGm001");
	}

}
