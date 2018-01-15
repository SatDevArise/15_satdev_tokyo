package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM003Dao;
import jp.arise.com.dto.COMGM003Dto;
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
}
