package com.aj.db.domain.log;

import java.io.Serializable;

public class StieLog implements Serializable {

	
	private Long id;
	private Integer status;
	private Long gameRefId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getGameRefId() {
		return gameRefId;
	}
	public void setGameRefId(Long gameRefId) {
		this.gameRefId = gameRefId;
	}
	
	
	
	
}
