package jp.arise.gbj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dto.COMGM003Dto;
import jp.arise.gbj.form.GBJGM001Form;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.UTLContent;

/**
 * GBJGM001 現場情報一覧表示画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class GBJGM001Servise {

	@Autowired
	public LoginInfo loginInfo;

	/**
	 * セッション情報設定処理
	 */
	public void setSessionInfo() {
		// ログイン情報保持用セッションクラスのセッション登録を呼び出す
		loginInfo.updateAttributeGamenId(UTLContent.GMID_GBJGM001);
	}

	/**
	 * 現場情報リストを設定します。
	 *
	 * @param genbaList
	 * @return GBJGM001FormList
	 * @throws @author
	 *             ErinaSakurada
	 * @since 2018/1/8
	 */
	public List<GBJGM001Form> setGBJGM001FormList(List<COMGM003Dto> genbaList) {
		//GBJGM001Formのインスタンスを作成
		GBJGM001Form GBJGM001Form = new GBJGM001Form();
		//GBJGM001FormのListを作成
		List<GBJGM001Form> GBJGM001FormList = new ArrayList<GBJGM001Form>();

		if (genbaList != null) {
			for (int i = 0; i < genbaList.size(); i++) {

				//検索で取得した1レコードをFormに設定
				GBJGM001Form.setUserId(genbaList.get(i).getUserId());
//				GBJGM001Form.setGenbaId(genbaList.get(i).getGenbaId());
				GBJGM001Form.setGenbaNa(genbaList.get(i).getGenbaNa());
				GBJGM001Form.setAddress(genbaList.get(i).getAddress());
				GBJGM001Form.setMoyori1Station(genbaList.get(i).getMoyori1Station());
				GBJGM001Form.setMoyori2Station(genbaList.get(i).getMoyori2Station());
				GBJGM001Form.setMoyori3Station(genbaList.get(i).getMoyori3Station());
//				GBJGM001Form.setWork(genbaList.get(i).getWork());
				GBJGM001Form.setPhase(genbaList.get(i).getPhase());
//				GBJGM001Form.setPage(genbaList.get(i).getPage());
				GBJGM001FormList.add(GBJGM001Form);

				System.out.println("---------------------------------------------");
				System.out.println("現場名：" + genbaList.get(i).getGenbaNa());
				System.out.println("---------------------------------------------");
			}
		}

		return GBJGM001FormList;
	}


}
