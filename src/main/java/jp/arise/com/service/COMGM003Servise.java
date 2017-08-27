package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM003Dao;
import jp.arise.com.dto.COMGM003Dto;
import jp.arise.com.message.COMMessage;

/**
 * COMGM001 ログイン画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM003Servise {

	@Autowired
	private COMGM003Dao comGm003Dao;


	public COMGM003Dto inputCheck(COMGM003Dto dto) {
        String user = dto.getUser();

        dto.setUserId(2);

        List<COMGM003Dto> resultList = comGm003Dao.getUser(dto);

        System.out.println(resultList.get(0).getUser());

        System.out.println(COMMessage.COME001.getMessage());

		return dto;
	}
}
