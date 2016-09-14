package com.chou.dms.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.system.dao.LogDao;
import com.chou.dms.system.entity.Log;

/**
 * 日志service
 * @author ty
 * @date 2015年1月14日
 */
@Service
@Transactional(readOnly=true)
public class LogService extends BaseService<Log, Integer> {
	
	@Autowired
	private LogDao logDao;
	
	@Override
	public HibernateDao<Log, Integer> getEntityDao() {
		return logDao;
	}
	
	/**
	 * 批量删除日志
	 * @param idList
	 */
	@Transactional(readOnly=false)
	public void deleteLog(List<Integer> idList){
		logDao.deleteBatch(idList);
	}
	
}
