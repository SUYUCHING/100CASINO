package com.aj.db.domain.log;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PlayerGameStatus implements Serializable{

	private Long id;
	private BigDecimal ttWinLose;
	private Integer seq;
	private Integer status;
	private BigDecimal ttBet;
	private Date createDate;
	private Date endDate;
	
	
	private String playerId;
	private Long gameRefId;
	
	
	
	public PlayerGameStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerGameStatus(Long id) {
		super();
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getTtWinLose() {
		return ttWinLose;
	}
	public void setTtWinLose(BigDecimal ttWinLose) {
		this.ttWinLose = ttWinLose;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public BigDecimal getTtBet() {
		return ttBet;
	}
	public void setTtBet(BigDecimal ttBet) {
		this.ttBet = ttBet;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public Long getGameRefId() {
		return gameRefId;
	}
	public void setGameRefId(Long gameRefId) {
		this.gameRefId = gameRefId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
