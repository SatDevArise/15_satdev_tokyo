package jp.arise.gbj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.gbj.dao.GBJGM001Dao;
import jp.arise.gbj.dto.GBJGM001Dto;
import jp.arise.gbj.message.GBJMessage;

/**
 * GBJGM001 現場情報一覧表示画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class GBJGM001Servise {

	@Autowired
	private GBJGM001Dao gbjGm001Dao;


	public GBJGM001Dto inputCheck(GBJGM001Dto dto) {
        String user = dto.getUser();
        System.out.println(user);

        dto.setUserId(2);

        List<GBJGM001Dto> resultList = gbjGm001Dao.getUser(dto);

        System.out.println(resultList.get(0).getUser());

        System.out.println(GBJMessage.GBJE001.getMessage());

		return dto;
	}
}
