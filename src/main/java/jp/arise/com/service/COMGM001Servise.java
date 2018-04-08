package jp.arise.com.service;

import java.text.SimpleDateFormat;
import java.util.Date;
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

//        System.out.println("userId(画面取得):" + userId);
//        System.out.println("password(画面取得):" + pass);

        //DAOを呼び出して、DBから情報を取得
        List<COMGM001Dto> resultList = comGm001Dao.select(userId);

        //取得した結果がNullもしくは空であれば、チェック処理終了
        if(resultList==null || resultList.isEmpty()) {
        		return dto;
        }

        //取得した結果を変数に格納
        String db_userName = resultList.get(0).getUserName();
        String db_userId = resultList.get(0).getUserId();
        String db_pass = resultList.get(0).getPassword();

        //DBで取得した値の不要な空白を除去
        db_userName = db_userName.replaceAll(" ", "");
        db_pass = db_pass.replaceAll(" ", "");

//        System.out.println("userName(DB取得):" + db_userName);
//        System.out.println("userId(DB取得):" + db_userId);
//        System.out.println("userPass(DB取得):" + db_pass);

		//ログイン情報をセット
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String yyyymmdd = sdf.format(new Date());
		dto.setCreatedAt(yyyymmdd);
		dto.setYukoFlg(1);
		dto.setDeleteFlg(0);

//        //初めてログインするかどうかのチェック
//        int count = comGm001Dao.count(userId);
//        //初めてログインの場合は、レコードを作成
//        if(count == UTLContent.INT_ZERO) {
//        		comGm001Dao.insert(dto);
//        }

        //取得した内容のNullチェック
        if(db_userName != null && db_userId != null && db_pass != null) {
        		//入力したIDとPassが一致してたら、dtoにユーザー名を設定
        		if(userId.equals(db_userId) && pass.equals(db_pass)) {
        			dto.setUserName(db_userName);
        		}
        }
		return dto;
	}
}
