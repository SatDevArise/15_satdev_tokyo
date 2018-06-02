package jp.arise.gbj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.gbj.dao.GBJGM002Dao;
import jp.arise.gbj.dto.GBJGM002Dto;
import jp.arise.utl.LoginInfo;

/**
 * GBJGM002 現場情報新規登録・編集画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class GBJGM002Servise {

	@Autowired
	private GBJGM002Dao gbjGm002Dao;
	@Autowired
	private LoginInfo loginInfo;


	public void insertCheck(GBJGM002Dto dto) {
        //Daoのinsert処理呼び出し
		System.out.println("住所："+dto.getAddress());
		System.out.println("現場ID："+dto.getGenba_Id());
		System.out.println("現場名："+dto.getGenba_na());


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

	//public void updateSession() {
		//LoginInfo loginInfo = new LoginInfo();
		//loginInfo.updateAttributeGamenId(UTLContent.GMID_GBJGM002);
	//}

	public String getGenbaId() {
		//採番ID取得
		String genbaId = gbjGm002Dao.getGenbaId();

		// 現場IDが取得できなかったら
		String result = "1001";
		if(genbaId == null || genbaId.isEmpty()) {
			return result;
		}
		//DBで取得した値の不要な空白を除去
		genbaId = genbaId.replaceAll(" ", "");

		//最新の現場IDを1インクリメントする
		genbaId = String.valueOf(Integer.parseInt(genbaId) + 1);
		if(genbaId.length() == 1) {
			return "100" + genbaId;
		}else if(genbaId.length() == 2) {
			return "10" + genbaId;
		}else if(genbaId.length() == 3) {
			return "1" + genbaId;
		}
		return genbaId;
	}

	/*
	 * 現場情報取得処理
	 */
	public GBJGM002Dto getGenbaInfo(String genbaId) {
		List<GBJGM002Dto> resultList = gbjGm002Dao.getGenbaInfo(genbaId);
		GBJGM002Dto gbjGm002Dto = new GBJGM002Dto();
		for(GBJGM002Dto result: resultList) {
			gbjGm002Dto = result;
		}
		return gbjGm002Dto;
	}

	/*
	 * 画面IDを更新する処理
	 */
	public void upSession(String gamenId) {
        loginInfo.updateAttributeGamenId(gamenId);
	}

}
