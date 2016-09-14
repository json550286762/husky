package com.chou.dms.system.dao;

import org.springframework.stereotype.Repository;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.system.entity.Organization;


/**
 * 机构DAO
 * @author kkomge
 * @date 2015年5月09日
 */
@Repository
public class OrganizationDao extends HibernateDao<Organization, Integer>{

}
