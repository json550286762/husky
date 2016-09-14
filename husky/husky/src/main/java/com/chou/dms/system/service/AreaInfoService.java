package com.chou.dms.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.system.dao.AreaInfoDao;
import com.chou.dms.system.entity.AreaInfo;

/**
 * 区域service
 * @author kkomge
 * @date 2015年5月09日
 */
@Service
@Transactional(readOnly=true)
public class AreaInfoService extends BaseService<AreaInfo, Integer>{
	
	@Autowired
	private AreaInfoDao areaInfoDao;
	
	@Override
	public HibernateDao<AreaInfo, Integer> getEntityDao() {
		return areaInfoDao;
	}

}
