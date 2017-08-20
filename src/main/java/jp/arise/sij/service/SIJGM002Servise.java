package jp.arise.sij.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.sij.dao.SIJGM002Dao;
import jp.arise.sij.dto.SIJGM002Dto;
import jp.arise.sij.message.SIJMessage;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class SIJGM002Servise {

	@Autowired
	private SIJGM002Dao sijGm002Dao;


	public SIJGM002Dto inputCheck(SIJGM002Dto dto) {
        String user = dto.getUser();
        System.out.println(user);

        dto.setUserId(2);

        List<SIJGM002Dto> resultList = sijGm002Dao.getUser(dto);

        System.out.println(resultList.get(0).getUser());

        System.out.println(SIJMessage.SIJE001.getMessage());

		return dto;
	}
}
