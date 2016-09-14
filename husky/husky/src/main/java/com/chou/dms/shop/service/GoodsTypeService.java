package com.chou.dms.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.shop.dao.GoodsTypeDao;
import com.chou.dms.shop.entity.GoodsType;

/**
 * 商品类型service
 * @author ty
 * @date 2015年1月22日
 */
@Service
@Transactional(readOnly=true)
public class GoodsTypeService extends BaseService<GoodsType, Integer> {
	
	@Autowired
	private GoodsTypeDao goodsTypeDao;

	@Override
	public HibernateDao<GoodsType, Integer> getEntityDao() {
		return goodsTypeDao;
	}

}
