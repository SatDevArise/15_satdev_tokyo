package jp.arise.sij.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.sij.dao.SIJGM001Dao;
import jp.arise.sij.dto.SIJGM001Dto;
import jp.arise.sij.message.SIJMessage;

/**
 * SIJGM001 社員情報一覧表示画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class SIJGM001Servise {

	@Autowired
	private SIJGM001Dao sijGm001Dao;


	public SIJGM001Dto inputCheck(SIJGM001Dto dto) {
        String user = dto.getUser();
        System.out.println(user);

        dto.setUserId(2);

        List<SIJGM001Dto> resultList = sijGm001Dao.getUser(dto);

        System.out.println(resultList.get(0).getUser());

        System.out.println(SIJMessage.SIJE001.getMessage());

		return dto;
	}
}
