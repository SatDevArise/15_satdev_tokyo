package jp.arise.gbj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.arise.gbj.dao.GBJGM002Dao;
import jp.arise.gbj.dto.GBJGM002Dto;

/**
 * GBJGM002 現場情報新規登録・編集画面用サービス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
@Service
public class GBJGM002Servise {

	@Autowired
	private GBJGM002Dao gbjGm002Dao;


	public void insertCheck(GBJGM002Dto dto) {
        //Daoのinsert処理呼び出し
		System.out.println("住所："+dto.getAdress());
		System.out.println("現場ID："+dto.getGenba_Id());
		System.out.println("現場名："+dto.getGenba_Na());


		System.out.println("daoのinsert処理");
		gbjGm002Dao.insert(dto);

	}

	public void deleteCheck(GBJGM002Dto dto) {
        //Daoのinsert処理呼び出し
		System.out.println("現場ID："+dto.getGenba_Id());

		System.out.println("daoのdelete処理");
		gbjGm002Dao.delete(dto);

	}
}
