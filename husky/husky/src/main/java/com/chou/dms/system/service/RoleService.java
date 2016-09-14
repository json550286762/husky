package com.chou.dms.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.system.dao.RoleDao;
import com.chou.dms.system.entity.Role;

/**
 * 角色service
 * @author ty
 * @date 2015年1月13日
 */
@Service
@Transactional(readOnly = true)
public class RoleService extends BaseService<Role, Integer> {

	@Autowired
	private RoleDao roleDao;

	@Override
	public HibernateDao<Role, Integer> getEntityDao() {
		return roleDao;
	}
}
