package com.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("hotel")
public class HotelMenu {
	@Value("${menu.poha}")
	private String poha;
	@Value("${menu.idali}")
	private String idali;
	@Override
	public String toString() {
		return "HotelMenu [poha=" + poha + ", idali=" + idali + "]";
	}
	public String getPoha() {
		return poha;
	}
	public void setPoha(String poha) {
		this.poha = poha;
	}
	public String getIdali() {
		return idali;
	}
	public void setIdali(String idali) {
		this.idali = idali;
	}
	

}
