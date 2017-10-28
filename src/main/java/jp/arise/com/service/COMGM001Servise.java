package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM001Dao;
import jp.arise.com.dto.COMGM001Dto;
import jp.arise.com.message.COMMessage;

/**
 * COMGM001 ログイン画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM001Servise {

	@Autowired
	private COMGM001Dao comGm001Dao;


	public COMGM001Dto inputCheck(COMGM001Dto dto) {
		//dtoの値を変数にセット
        String userId = dto.getUserId();
        String pass = dto.getPassword();

        System.out.println("UserId" + userId +"Password" + pass);

        //DAOを呼び出して、DBから情報を取得
        List<COMGM001Dto> resultList = comGm001Dao.select(userId);


        //取得した結果がNullもしくは空であれば、チェック処理終了
        if(resultList==null || resultList.isEmpty()) {
        		System.out.println("DB情報:UserId" + userId +"Password" + pass);
        		return dto;
        }

        System.out.println("UserId" + resultList.get(0).getUserId()
        		+"Password" + resultList.get(0).getPassword()
        		+"UserName" + resultList.get(0).getUserName());

        //取得した内容のNullチェック
        if(resultList.get(0).getUserId() != null
        		&& resultList.get(0).getPassword() != null
        			&& resultList.get(0).getUserName() != null) {
        		//入力したIDとPassが一致してたら、dtoにユーザー名を設定
        		if(resultList.get(0).getUserId().equals(resultList.get(0).getUserId())) {
        			dto.setUserName(resultList.get(0).getUserName());
        		}
        }

		return dto;
	}
}
