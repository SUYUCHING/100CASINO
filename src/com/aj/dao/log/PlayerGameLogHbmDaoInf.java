package com.aj.dao.log;

import java.util.List;

import com.aj.db.domain.log.PlayerGameLog;

public interface PlayerGameLogHbmDaoInf {

	public List<PlayerGameLog> getPlayerGameLog(String playerId, Integer maxRes)throws Exception;
	
	
}
