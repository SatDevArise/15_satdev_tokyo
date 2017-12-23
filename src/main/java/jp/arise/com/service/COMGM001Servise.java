package jp.arise.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM001Dao;
import jp.arise.com.dto.COMGM001Dto;

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
        String user = dto.getUserId();

        dto.setUserId("2");

//        List<COMGM001Dto> resultList = comGm001Dao.getUser(dto);

		return dto;
	}
}
