package jp.arise.gbj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.gbj.dao.GBJGM002Dao;
import jp.arise.gbj.dto.GBJGM002Dto;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.UTLContent;

/**
 * GBJGM002 現場情報新規登録・編集画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class GBJGM002Servise {

	@Autowired
	private GBJGM002Dao gbjGm002Dao;

	/**
	 * 現場ID採番取得
	 */
	public String getGenbaId(){
		String genbaId = gbjGm002Dao.getGenbaId();

		//現場IDが取得できなかったら
		String result = "0001";
		if(genbaId == null || genbaId.isEmpty()) {
			return result;
		}

		//DBで取得した値の不要な空白を除去
		genbaId = genbaId.replaceAll(" ", "");

		//最新の現場IDを1インクリメントする
		genbaId = String.valueOf(Integer.parseInt(genbaId) + 1);

		if(genbaId.length() == 1) {
			return "000" + genbaId;
		}else if(genbaId.length() == 2) {
			return "00" + genbaId;
		}else if(genbaId.length() == 3) {
			return "0" + genbaId;
		}

		return genbaId;
	}

	/**
	 * 新規登録処理
	 */
	public void insert(GBJGM002Dto dto) {
		//採番処理
		gbjGm002Dao.numbering(dto);
		gbjGm002Dao.insert(dto);
	}

	/**
	 * 削除処理
	 */
	public void delete(GBJGM002Dto dto) {
		gbjGm002Dao.delete(dto);
	}

	/**
	 * 更新処理
	 */
	public void update(GBJGM002Dto dto) {
		gbjGm002Dao.update(dto);
	}

	/**
	 * 採番処理
	 */
	public void numbering(GBJGM002Dto dto) {
		gbjGm002Dao.numbering(dto);
	}

	public void updateSession() {
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.updateAttributeGamenId(UTLContent.GMID_GBJGM002);
	}


}
