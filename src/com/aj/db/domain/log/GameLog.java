package com.aj.db.domain.log;

import java.io.Serializable;
import java.util.Date;

import com.aj.db.domain.baccart.Card;

public class GameLog implements Serializable{
	
	private Long id;
	private Integer winner;
	private String cardStr;//ResultCardDto
	private Integer cardType;
	private Integer seq;
	private Date createDate;
	private Integer number;
	
	private Long gameRefId;
	private Card card;


	
	
	public GameLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameLog(Long id) {
		super();
		this.id = id;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getWinner() {
		return winner;
	}


	public void setWinner(Integer winner) {
		this.winner = winner;
	}


	public String getCardStr() {
		return cardStr;
	}


	public void setCardStr(String cardStr) {
		this.cardStr = cardStr;
	}


	public Integer getCardType() {
		return cardType;
	}


	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}


	public Card getCard() {
		return card;
	}


	public void setCard(Card card) {
		this.card = card;
	}


	public Integer getSeq() {
		return seq;
	}


	public void setSeq(Integer seq) {
		this.seq = seq;
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
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}

	
	
}
