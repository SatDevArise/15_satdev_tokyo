package jp.arise.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.com.dao.COMGM002Dao;
import jp.arise.com.dto.COMGM002Dto;
import jp.arise.com.message.COMMessage;

/**
 * COMGM002 メニュー画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class COMGM002Servise {

	@Autowired
	private COMGM002Dao comGm002Dao;


	public COMGM002Dto inputCheck(COMGM002Dto dto) {
        String user = dto.getUser();
        System.out.println(user);

        dto.setUserId(2);

        List<COMGM002Dto> resultList = comGm002Dao.getUser(dto);

        System.out.println(resultList.get(0).getUser());

        System.out.println(COMMessage.COME001.getMessage());

		return dto;
	}
}
