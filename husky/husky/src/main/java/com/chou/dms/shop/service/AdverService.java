package com.chou.dms.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.shop.dao.AdverDao;
import com.chou.dms.shop.entity.Adver;

/**
 * 广告service
 * @author ty
 * @date 2015年1月22日
 */
@Service
@Transactional(readOnly=true)
public class AdverService extends BaseService<Adver, Integer>{
	
	@Autowired
	private AdverDao adverDao;

	@Override
	public HibernateDao<Adver, Integer> getEntityDao() {
		return adverDao;
	}

}
