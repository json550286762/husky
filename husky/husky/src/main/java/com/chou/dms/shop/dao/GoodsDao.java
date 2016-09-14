package com.chou.dms.shop.dao;

import org.springframework.stereotype.Repository;

import com.chou.dms.common.persistence.HibernateDao;
import com.chou.dms.shop.entity.Goods;

/**
 * 商品DAO
 * @author ty
 * @date 2015年1月22日
 */
@Repository
public class GoodsDao extends HibernateDao<Goods, Integer>{

}
