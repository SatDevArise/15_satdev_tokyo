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
        String user = dto.getUser();

        dto.setUserId(2);

        List<COMGM001Dto> resultList = comGm001Dao.getUser(dto);

        System.out.println(resultList.get(0).getUser());

        System.out.println(COMMessage.COME001.getMessage());

		return dto;
	}
}
