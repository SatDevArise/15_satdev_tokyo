package jp.arise.sij.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * SIJGM002 社員情報新規登録・編集画面用サービス間Dtoクラス
 * Controller以降の処理での値が格納されるクラス
 * @author AtsushiNishizawa
 * @since 2017/07/17
 */
public class SIJGM002Dto implements Serializable{

	private String syainId;
	private String genbaId;
	private String name;
	private Date seinengappi;
	private String address;
	private String moyoriStation1;
	private String moyoriStation2;
	private String moyoriStation3;
	private Date hireDate;
	private String previous;
	private String birthPlace;
	private String position;
	private String teamName;
	private String phase;
	private long tanka;
	private String registerUser;
	private String deleteUser;
	private String deleteFlg;
	private String validFlg;
	private String user;
	private Date date;

	public String getSyainId() {
		return syainId;
	}
	public void setSyainId(String syainId) {
		this.syainId = syainId;
	}
	public String getGenbaId() {
		return genbaId;
	}
	public void setGenbaId(String genbaId) {
		this.genbaId = genbaId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getSeinengappi() {
		return seinengappi;
	}
	public void setSeinengappi(Date seinengappi) {
		this.seinengappi = seinengappi;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMoyoriStation1() {
		return moyoriStation1;
	}
	public void setMoyoriStation1(String moyoriStation1) {
		this.moyoriStation1 = moyoriStation1;
	}
	public String getMoyoriStation2() {
		return moyoriStation2;
	}
	public void setMoyoriStation2(String moyoriStation2) {
		this.moyoriStation2 = moyoriStation2;
	}
	public String getMoyoriStation3() {
		return moyoriStation3;
	}
	public void setMoyoriStation3(String moyoriStation3) {
		this.moyoriStation3 = moyoriStation3;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	public long getTanka() {
		return tanka;
	}
	public void setTanka(long tanka) {
		this.tanka = tanka;
	}
	public String getRegisterUser() {
		return registerUser;
	}
	public void setRegisterUser(String registerUser) {
		this.registerUser = registerUser;
	}
	public String getDeleteUser() {
		return deleteUser;
	}
	public void setDeleteUser(String deleteUser) {
		this.deleteUser = deleteUser;
	}
	public String getDeleteFlg() {
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public String getValidFlg() {
		return validFlg;
	}
	public void setValidFlg(String validFlg) {
		this.validFlg = validFlg;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}