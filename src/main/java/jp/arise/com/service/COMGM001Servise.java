package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM001Dao;
import jp.arise.com.dto.COMGM001Dto;
import jp.arise.com.message.COMMessage;
import jp.arise.utl.UTLContent;

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
        System.out.println("userId(画面取得):" + userId);
        System.out.println("password(画面取得):" + pass);

        //DAOを呼び出して、DBから情報を取得
        List<COMGM001Dto> resultList = comGm001Dao.select(userId);

        //取得した結果がNullもしくは空であれば、チェック処理終了
        if(resultList==null || resultList.isEmpty()) {
        		return dto;
        }

        String userName = resultList.get(0).getUserName();
        String userId2 = resultList.get(0).getUserId();
        String pass2 = resultList.get(0).getPassword();

        System.out.println("userName(DB取得):" + userName);
        System.out.println("userId(DB取得):" + userId2);
        System.out.println("userPass(DB取得):" + pass2);

        //初めてログインするかどうかのチェック
        System.out.println("count実行");
        int count = comGm001Dao.count(userId);
        System.out.println("結果:"+count);
        if(count == UTLContent.INT_ZERO) {
        		//初めてログインの場合は、レコードを作成
        		System.out.println("insert実行");
        		comGm001Dao.insert(dto);
        }

        //取得した内容のNullチェック
        if(userName != null && userId2 != null && pass2 != null) {
    			System.out.println("通過");
        		//入力したIDとPassが一致してたら、dtoにユーザー名を設定
        		if(userId.equals(userId) && pass.equals(pass)) {
        			System.out.println("通過2");
        			dto.setUserName(resultList.get(0).getUserName());
        		}
        }
		return dto;
	}
}
