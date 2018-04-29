package jp.arise.sij.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.sij.dao.SIJGM002Dao;
import jp.arise.sij.dto.SIJGM002Dto;
import jp.arise.sij.message.SIJMessage;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.LoginInfoDto;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class SIJGM002Servise {

	@Autowired
	private SIJGM002Dao sijGm002Dao;

	@Autowired
	private LoginInfo loginInfo;

	/*
	 * 社員ID採番処理
	 */
	public String getSyainId() {
		//採番ID取得
		String syainId = sijGm002Dao.getSyainId();
		//DBで取得した値の不要な空白を除去
		syainId = syainId.replaceAll(" ", "");

		//社員IDが取得できなかったら
		String result = "0001";
		if(syainId == null || syainId.isEmpty()) {
			return result;
		}

		//最新の社員IDを1インクリメントする
		syainId = String.valueOf(Integer.parseInt(syainId) + 1);

		if(syainId.length() == 1) {
			return "000" + syainId;
		}else if(syainId.length() == 2) {
			return "00" + syainId;
		}else if(syainId.length() == 3) {
			return "0" + syainId;
		}

		return syainId;
	}

	/*
	 * 社員情報取得処理
	 */
	public SIJGM002Dto getSyainInfo(String syainId) {
		List<SIJGM002Dto> resultList = sijGm002Dao.getSyainInfo(syainId);
		SIJGM002Dto sijGm002Dto = new SIJGM002Dto();
		for(SIJGM002Dto result: resultList) {
			sijGm002Dto = result;
		}
		return sijGm002Dto;
	}

	/*
	 * 新規登録処理
	 */
	public void insertCheck(SIJGM002Dto dto) {
		//insert処理
		sijGm002Dao.insert(dto);

		//seq追加
		sijGm002Dao.insertSeq(dto);
	}

	/*
	 * 更新処理
	 */
	public void updateCheck(SIJGM002Dto dto) {
		//update処理
		sijGm002Dao.update(dto);
	}

	/*
	 * 削除処理
	 */
	public void deleteCheck(SIJGM002Dto dto) {
		//delete処理
		sijGm002Dao.delete(dto);
	}

	/*
	 * 文字列を日付に変換する処理
	 */
	public Date convertDate(String str) {
		Date date = new Date();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	        date = sdf.parse(str);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		 return date;
	}

	public String parseDateToString(Date date){
		String DATE_PATTERN ="yyyy/MM/dd HH:mm:ss";
		String str;

		if(date == null) {
			str = null;
		} else {
			str = new SimpleDateFormat(DATE_PATTERN).format(date);
		}
		return str;
	}

	public void upSession(String gamenId) {
        loginInfo.updateAttributeGamenId(gamenId);
	}

}