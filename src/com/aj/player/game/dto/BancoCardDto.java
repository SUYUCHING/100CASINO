package com.aj.player.game.dto;

import java.util.List;

public class BancoCardDto {

	private List<CardDto> firstCards;
	private CardDto outCard;
	
	public List<CardDto> getFirstCards() {
		return firstCards;
	}
	public void setFirstCards(List<CardDto> firstCards) {
		this.firstCards = firstCards;
	}
	public CardDto getOutCard() {
		return outCard;
	}
	public void setOutCard(CardDto outCard) {
		this.outCard = outCard;
	}
	
}
