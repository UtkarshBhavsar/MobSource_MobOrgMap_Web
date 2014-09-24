package com.mob.model;

import java.io.Serializable;

public class Title implements Serializable {

	private static final long serialVersionUID = 1L;
	private long titleId;
	private String titleName;

	public long getTitleId() {
		return titleId;
	}

	public void setTitleId(long titleId) {
		this.titleId = titleId;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
