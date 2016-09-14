package com.chou.dms.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.shop.dao.GoodsDao;
import com.chou.dms.shop.entity.Goods;

/**
 * 商品service
 * @author ty
 * @date 2015年1月22日
 */
@Service
@Transactional(readOnly=true)
public class GoodsService extends BaseService<Goods, Integer> {
	
	@Autowired
	private GoodsDao goodsDao;

	@Override
	public HibernateDao<Goods, Integer> getEntityDao() {
		return goodsDao;
	}

}
