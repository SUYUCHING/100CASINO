package com.aj.dao.log;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.aj.db.domain.log.PlayerGameLog;

public class PlayerGameLogHbmDao extends HibernateDaoSupport implements PlayerGameLogHbmDaoInf {

	
	@Override
	public List<PlayerGameLog> getPlayerGameLog(String playerId, Integer maxRes)throws Exception{
		
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(" select playerGameLog ");
		strBuff.append(" from PlayerGameLog playerGameLog ");
		strBuff.append(" where playerGameLog.playerId = :obj1 ");
		
		Query query = getSessionFactory().getCurrentSession().createQuery(strBuff.toString());
		query.setParameter("obj1", playerId);
		if(maxRes != null)
		   query.setMaxResults(maxRes);
		
		
		return query.list();
		
	}
	
}
