package com.chou.dms.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.system.dao.DictDao;
import com.chou.dms.system.entity.Dict;

/**
 * 字典service
 * @author ty
 * @date 2015年1月13日
 */
@Service
@Transactional(readOnly=true)
public class DictService extends BaseService<Dict, Integer> {
	
	@Autowired
	private DictDao dictDao;

	@Override
	public HibernateDao<Dict, Integer> getEntityDao() {
		return dictDao;
	}
}
