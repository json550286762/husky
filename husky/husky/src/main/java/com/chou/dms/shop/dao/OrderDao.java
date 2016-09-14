package com.chou.dms.shop.dao;

import org.springframework.stereotype.Repository;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.shop.entity.Order;


@Repository
public class OrderDao extends HibernateDao<Order, Integer>{

}
