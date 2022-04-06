package com.sai.espt.viewmodel;

import org.zkoss.bind.annotation.NotifyChange;

import com.sai.espt.dao.UserNpwpDAO;

public class ActiveLogin {
	private int lblActiveLoginGA = 0;
	private int lblActiveLoginBrok = 0;
	private int lblActiveLoginTot = 0;
	
	UserNpwpDAO oDao = new UserNpwpDAO();
	
	@NotifyChange("lblActiveLoginGA")
	public int getLblActiveLoginGA() {
		lblActiveLoginGA = oDao.countActiveUserGA();
		return lblActiveLoginGA;
	}

	public void setLblActiveLoginGA(int lblActiveLoginGA) {
		this.lblActiveLoginGA = lblActiveLoginGA;
	}
	
	@NotifyChange("lblActiveLoginBrok")
	public int getLblActiveLoginBrok() {
		lblActiveLoginBrok = oDao.countActiveUserBrok();
		return lblActiveLoginBrok;
	}

	public void setLblActiveLoginBrok(int lblActiveLoginBrok) {
		this.lblActiveLoginBrok = lblActiveLoginBrok;
	}

	@NotifyChange("lblActiveLoginTot")
	public int getLblActiveLoginTot() {
		lblActiveLoginTot = oDao.countActiveUserGA()+oDao.countActiveUserBrok();
		return lblActiveLoginTot;
	}

	public void setLblActiveLoginTot(int lblActiveLoginTot) {
		this.lblActiveLoginTot = lblActiveLoginTot;
	}
}
