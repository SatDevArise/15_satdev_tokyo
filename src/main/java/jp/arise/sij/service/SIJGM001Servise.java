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
	public List<SIJGM001Form> setSijgm001FormList(List<COMGM003Dto> list, Date nyushaDate) {

		SIJGM001Form sijGm001Form = new SIJGM001Form();

		List<SIJGM001Form> sijgm001FormList = new ArrayList<SIJGM001Form>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {

				sijGm001Form.setUserId(list.get(i).getSyainId());
				sijGm001Form.setUser(list.get(i).getUser());
				sijGm001Form.setTitle(list.get(i).getPsition());
				sijGm001Form.setBirthday(list.get(i).getSeinengappiFrom());
				sijGm001Form.setTeam(list.get(i).getTeamNa());
				sijGm001Form.setSite(list.get(i).getGenbaNa());

				//入社日を取得し、Date型変換
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Date enteringDay = null;
				try {
					enteringDay = sdf.parse(list.get(i).getNyusyabiFrom());
				} catch (ParseException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

				//日付をlong値に変換
			    long dateTimeTo1 = enteringDay.getTime();

				//現在日付を取得し、long値に変換
				Date date = new Date();
			    long dateTimeTo2 = date.getTime();

				//経過年数を算出
			    long yearDiff = ( dateTimeTo1 - dateTimeTo2  ) / (1000 * 60 * 60 * 24 * 365);

				sijGm001Form.setPhase(list.get(i).getPhase());
				sijGm001Form.setRoute(list.get(i).getRoute());
				sijGm001Form.setPrice(list.get(i).getTanka());
				sijgm001FormList.add(sijGm001Form);

				System.out.println("---------------------------------------------");
				System.out.println("社員ID：" + list.get(i).getUserId());
				System.out.println("社員名：" + list.get(i).getUser());
				System.out.println("役職：" + list.get(i).getPsition());
				System.out.println("生年月日：" + list.get(i).getSeinengappiFrom());
				System.out.println("所属チーム：" + list.get(i).getTeamNa());
				System.out.println("現場名：" + list.get(i).getGenbaNa());
				System.out.println("経過年数：" + yearDiff);
				System.out.println("フェーズ区分：" + list.get(i).getPhase());
				System.out.println("使用路線：" + list.get(i).getRoute());
				System.out.println("単価：" + list.get(i).getTanka());
				System.out.println("---------------------------------------------");
			}
		}
		return sijgm001FormList;
	}
}
