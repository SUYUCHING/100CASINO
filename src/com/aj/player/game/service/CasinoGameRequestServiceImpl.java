package com.aj.player.game.service;

import java.math.BigDecimal;
import java.util.List;

import com.aj.client.CasinoGameRequestService;
import com.aj.common.constant.ErrorCodeConstant;
import com.aj.common.service.BaseService;
import com.aj.dao.log.PlayerGameLogHbmDaoInf;
import com.aj.db.domain.log.PlayerGameLog;
import com.aj.player.game.dto.BancoCardDto;
import com.aj.player.game.dto.CasionCalculateRuleDto;
import com.aj.player.game.dto.GameDto;
import com.aj.player.game.dto.PlayerCardDto;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CasinoGameRequestServiceImpl extends BaseService implements CasinoGameRequestService {

	
	private PlayerGameLogHbmDaoInf playerGameLogHbmDao;
	
    public void setPlayerGameLogHbmDao(PlayerGameLogHbmDaoInf playerGameLogHbmDao) {
		this.playerGameLogHbmDao = playerGameLogHbmDao;
	}
    
    

	@Override
	public String getPlayerGameLog(String playerId, Integer maxRes) throws Exception {
		System.out.println("CasinoGameRequestServiceImpl.getPlayerGameLog() start ");
		JsonObject resultObj = new JsonObject();
		resultObj.addProperty(ErrorCodeConstant.LABEL_CODE, ErrorCodeConstant.CODE_SUCCESS);
		resultObj.addProperty(ErrorCodeConstant.LABEL_DESC, ErrorCodeConstant.DESC_SUCCESS);

		try {
			
			List<PlayerGameLog> playerGameLog = playerGameLogHbmDao.getPlayerGameLog(playerId, maxRes);
			
			JsonArray obj = (JsonArray)new Gson().toJsonTree(playerGameLog, new TypeToken<List<PlayerGameLog>>() {}.getType());
			
			resultObj.add(ErrorCodeConstant.LABEL_RESULT, obj);
			
		}catch (Exception e) {
			catchException(e, resultObj);
            e.printStackTrace();
            throw e;
		}
		
		return resultObj.toString();
	}
    
	
	
	

	public void bet(Long gameId,GameDto gameDto, BigDecimal amount, Long userId, Long entityId)throws Exception{
    	
    	try {
    		PlayerCardDto playerCardDto = gameDto.getPlayer();
    		BancoCardDto bancoDto = gameDto.getBanco();
    		
    		CasionCalculateRuleDto casionCalculateRuleDto = new CasionCalculateRuleDto(playerCardDto.getFirstCards(),playerCardDto.getOutCard(),bancoDto.getFirstCards() , bancoDto.getOutCard());
    		casionCalculateRuleDto.calCulationCardInfo();
    		
    		Integer bancoAmt = casionCalculateRuleDto.getBancoAmt();
    		Integer playerAmt = casionCalculateRuleDto.getPlayerAmt();
    		Integer winner = casionCalculateRuleDto.getWinner();
    		String winnerType = casionCalculateRuleDto.getWinnerType();
    		boolean extWine = casionCalculateRuleDto.isExtWine();
    		Integer winAmount = casionCalculateRuleDto.getWinAmount();
    		
    		
    		
    		
			
		} catch (Exception e) {
			throw e;
		}
    	
    }




    
    

}
