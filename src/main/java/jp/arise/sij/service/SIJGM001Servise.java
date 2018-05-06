package jp.arise.sij.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dto.COMGM003Dto;
import jp.arise.sij.form.SIJGM001Form;
import jp.arise.utl.LoginInfo;
import jp.arise.utl.UTLContent;

/**
 * SIJGM001 社員情報一覧表示画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class SIJGM001Servise {

	@Autowired
	public LoginInfo loginInfo;

	public void setSession() {
        loginInfo.updateAttributeGamenId(UTLContent.GMID_SIJGM001);
	}

	/**
	 * 社員情報リストを設定します。
	 *
	 * @param list
	 * @return sijgm001FormList
	 * @throws @author
	 *             Narumi
	 * @since 2018/1/8
	 */
	public List<SIJGM001Form> setSijgm001FormList(List<COMGM003Dto> list) {

		List<SIJGM001Form> SIJGM001FormList = new ArrayList<SIJGM001Form>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				SIJGM001Form sijGm001Form = new SIJGM001Form();
				sijGm001Form.setUserId(list.get(i).getSyainId());
				sijGm001Form.setUser(list.get(i).getSyainName());
				sijGm001Form.setTitle(list.get(i).getPsition());
				sijGm001Form.setBirthday(list.get(i).getSeinengappiFrom());
				sijGm001Form.setTeam(list.get(i).getTeamNa());
				sijGm001Form.setSite(list.get(i).getGenbaNa());

				//経過年数を入れる
				if (list.get(i).getNyusyabiFrom() != null && !list.get(i).getNyusyabiFrom().isEmpty()) {
					String yearDiff = calcDuration(list.get(i).getNyusyabiFrom());
					sijGm001Form.setDuration(yearDiff);
				}

				//社歴を入れる
				if (list.get(i).getGenbasankakuFrom() != null && !list.get(i).getGenbasankakuFrom().isEmpty()) {
					String yearDiff = calcDuration(list.get(i).getGenbasankakuFrom());
					sijGm001Form.setHistory(yearDiff);
				}

				//現段階で、COMGM003Dtoに使用路線を入力する項目がないため、エラー
				//COMGM003Dtoにて作成してもらう必要がある。

				sijGm001Form.setPhase(list.get(i).getPhase());

				//検索共通画面に使用路線の項目がないため、値が持ってこれない
				sijGm001Form.setRoute(list.get(i).getSiyorosen());

				sijGm001Form.setPrice(list.get(i).getTanka());
				SIJGM001FormList.add(sijGm001Form);
			}
		}
		return SIJGM001FormList;
	}

	/*
	 * 年数を算出するメソッド
	 */
	    private String calcDuration(String str) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dateFrom = null;
			try {
				dateFrom = sdf.parse(str);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }

		    Date currentDate = new Date();

		    // 日付をlong値に変換します。
		    long dateTimeTo = currentDate.getTime();
		    long dateTimeFrom = dateFrom.getTime();

		    // 差分の日数を算出します。
		    long dayDiff = ( dateTimeTo - dateTimeFrom  ) / (1000 * 60 * 60 * 24 );
		    System.out.println("日数:"+dayDiff);
		    long yearDiff = dayDiff / 365;
		    System.out.println("年数："+yearDiff);

		    return String.valueOf(yearDiff);

		}

//		以下、年数計算で記述していたが、計算がうまくいかないため、コントアウト
//		文字列をDate型に変換
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		Date date = null;
//		try {
//			date = sdf.parse(str);
//		} catch (ParseException e) {
//      TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}

//		日付をlong値に変換
//	    long dateTimeFrom = date.getTime();

//		現在日付を取得し、long値に変換
//		Date currentdate = new Date();
//	    long dateTimeTo = currentdate.getTime();

//		年数を算出し、int値に変換
//	    long yearDiff = (long)( dateTimeTo - dateTimeFrom ) / (1000 * 60 * 60 * 24 * 365);

//	    return String.valueOf(yearDiff);

	}

