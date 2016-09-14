package com.chou.dms.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.common.service.BaseService;
import com.chou.dms.shop.dao.OrderDao;
import com.chou.dms.shop.entity.Order;

@Service
@Transactional(readOnly=true)
public class OrderService extends BaseService<Order, Integer> {
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public HibernateDao<Order, Integer> getEntityDao() {
		return orderDao;
	}

}
