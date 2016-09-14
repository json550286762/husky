package com.chou.dms.system.dao;

import org.springframework.stereotype.Repository;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.system.entity.Role;


/**
 * 角色DAO
 * @author ty
 * @date 2015年1月13日
 */
@Repository
public class RoleDao extends HibernateDao<Role, Integer>{

}
