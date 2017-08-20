package jp.arise.gbj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.gbj.dao.GBJGM002Dao;
import jp.arise.gbj.dto.GBJGM002Dto;
import jp.arise.gbj.message.GBJMessage;

/**
 * GBJGM002 現場情報新規登録・編集画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class GBJGM002Servise {

	@Autowired
	private GBJGM002Dao gbjGm002Dao;


	public GBJGM002Dto inputCheck(GBJGM002Dto dto) {
        String user = dto.getUser();
        System.out.println(user);

        dto.setUserId(2);

        List<GBJGM002Dto> resultList = gbjGm002Dao.getUser(dto);

        System.out.println(resultList.get(0).getUser());

        System.out.println(GBJMessage.GBJE001.getMessage());

		return dto;
	}
}
