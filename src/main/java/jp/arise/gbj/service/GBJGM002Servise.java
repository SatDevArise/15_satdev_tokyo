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


	public void insertCheck(GBJGM002Dto dto) {
        //Daoのinsert処理呼び出し
		System.out.println("住所："+dto.getAdress());
		System.out.println("現場ID："+dto.getGenba_Id());
		System.out.println("現場名："+dto.getGenba_Na());


		System.out.println("daoのinsert処理");
		gbjGm002Dao.numbering(dto);
		gbjGm002Dao.insert(dto);

	}

	public void deleteCheck(GBJGM002Dto dto) {
        //Daoのdelete処理呼び出し
		System.out.println("現場ID："+dto.getGenba_Id());

		System.out.println("daoのdelete処理");
		gbjGm002Dao.delete(dto);

	}
	public void updateCheck(GBJGM002Dto dto) {
        //Daoのupdate処理呼び出し
		System.out.println("現場ID："+dto.getGenba_Id());

		System.out.println("daoのupdate処理");
		gbjGm002Dao.update(dto);

	}

	public void updateSession() {
		LoginInfo loginInfo = new LoginInfo();
		loginInfo.updateAttributeGamenId(UTLContent.GMID_GBJGM002);
	}

	public String getGenbaId() {
		//採番ID取得
		String genbaId = gbjGm002Dao.getGenbaId();

		//DBで取得した値の不要な空白を除去
		genbaId = genbaId.replaceAll(" ", "");

		//社員IDが取得できなかったら
		String result = "0001";
		if(genbaId == null || genbaId.isEmpty()) {
			return result;
		}

		//最新の社員IDを1インクリメントする
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



}
