package com.aj.db.domain.log;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PlayerGameLog implements Serializable{

	private Long id;
	private Date createDate;
	private GameLog gameLog;
	private BigDecimal betAmt;
	private BigDecimal winLose;
	private String playerId;//entityCode_playerId
	private Long gameRefId;
	private Long redId;//pyp playerGameLogId
	
	public PlayerGameLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerGameLog(Long id) {
		super();
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public GameLog getGameLog() {
		return gameLog;
	}
	public void setGameLog(GameLog gameLog) {
		this.gameLog = gameLog;
	}
	public BigDecimal getBetAmt() {
		return betAmt;
	}
	public void setBetAmt(BigDecimal betAmt) {
		this.betAmt = betAmt;
	}
	public BigDecimal getWinLose() {
		return winLose;
	}
	public void setWinLose(BigDecimal winLose) {
		this.winLose = winLose;
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
	public Long getRedId() {
		return redId;
	}
	public void setRedId(Long redId) {
		this.redId = redId;
	}
	
	
	
}
