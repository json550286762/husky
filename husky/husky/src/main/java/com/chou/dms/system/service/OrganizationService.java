package com.chou.dms.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.system.dao.OrganizationDao;
import com.chou.dms.system.entity.Organization;

/**
 * 区域service
 * @author kkomge
 * @date 2015年5月09日
 */
@Service
@Transactional(readOnly=true)
public class OrganizationService extends BaseService<Organization, Integer>{
	
	@Autowired
	private OrganizationDao organizationDao;
	
	@Override
	public HibernateDao<Organization, Integer> getEntityDao() {
		return organizationDao;
	}

}
