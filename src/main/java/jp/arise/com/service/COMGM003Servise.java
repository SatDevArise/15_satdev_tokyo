package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM003Dao;
import jp.arise.com.dto.COMGM003Dto;
import jp.arise.com.form.COMGM003Form;
import jp.arise.com.message.COMMessage;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;
import jp.arise.utl.UTLContent;

/**
 * COMGM003 検索共通画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM003Servise {

	@Autowired
	private COMGM003Dao comGm003Dao;
	@Autowired
	public LoginInfo loginInfo;

	public COMGM003Dto inputCheck(COMGM003Dto dto) {
        String user = dto.getUser();

        dto.setUserId("2");

//        List<COMGM003Dto> resultList = comGm003Dao.getUser(dto);
//        System.out.println(resultList.get(0).getUser());

        System.out.println(COMMessage.COME001.getMessage());

		return dto;
	}

	/**
	 * 遷移元画面判定処理
	 * @param dto
	 * @return
	 */
	public List<COMGM003Dto> search(COMGM003Dto dto) {
    	// 遷移元画面判定処理
		LoginInfoDto loginInfoDto = new LoginInfoDto();
		loginInfoDto = loginInfo.getAttribute();
		// セッション情報の遷移元画面を取得
		String strGamenId = (String) loginInfoDto.getGamenId();

		// 検索結果格納用変数
		List<COMGM003Dto> resultList = null;

		// 	セッション情報の遷移元画面から実行する処理を判定
		if (strGamenId.equals(UTLContent.GMID_SIJGM001)) {
			// 社員情報の場合、社員情報検索処理を呼び出す
			resultList = comGm003Dao.getSyainDt(dto);
		} else if (strGamenId.equals(UTLContent.GMID_GBJGM001)){
			// 現場情報の場合、現場情報検索処理を呼び出す。
			resultList = comGm003Dao.getGenbaDt(dto);
		}
		// 検索結果を遷移元画面に返す
		return resultList;
	}

	public COMGM003Dto setInfo(COMGM003Form comGm003Form) {
		COMGM003Dto comGm003Dto = new COMGM003Dto();
		comGm003Dto.setSyainId(comGm003Form.getSyainId());
		comGm003Dto.setSeinengappiFrom(comGm003Form.getSeinengappiFrom());
		comGm003Dto.setSeinengappiTo(comGm003Form.getSeinengappiTo());
		comGm003Dto.setPrevious(comGm003Form.getPrevious());
		comGm003Dto.setPsition(comGm003Form.getPsition());
		comGm003Dto.setNyusyabiFrom(comGm003Form.getNyusyabiFrom());
		comGm003Dto.setNyusyabiTo(comGm003Form.getNyusyabiTo());
		comGm003Dto.setTeamNa(comGm003Form.getTeamNa());
		comGm003Dto.setGenbaNa(comGm003Form.getGenbaNa());
		comGm003Dto.setPhase(comGm003Form.getPhase());
		comGm003Dto.setTanka(comGm003Form.getTanka());
		comGm003Dto.setMoyori1Station(comGm003Form.getMoyori1Station());
		comGm003Dto.setMoyori2Station(comGm003Form.getMoyori2Station());
		comGm003Dto.setMoyori3Station(comGm003Form.getMoyori3Station());
		comGm003Dto.setAddress(comGm003Form.getAddress());
		return comGm003Dto;
	}
}
