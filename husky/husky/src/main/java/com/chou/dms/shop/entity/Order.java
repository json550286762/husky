package com.chou.dms.shop.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "biz_order_t")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer orderId;
	private String itemCode;
	private String orderNo;
	private String buyerId;
	private String buyerNickName;
	private String buyerSystemUserId;
	private String orderStatus;
	private Date orderDate;
	private Date createTime;
	private Integer createId;
	private Date lastUpdateTime;
	private Integer lastUpdateId;
	
	/** default constructor */
	public Order() {
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "order_id", nullable = false)
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Column(name = "item_code", nullable = false)
	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	@Column(name = "order_no", nullable = false)
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "buyer_id", nullable = false)
	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	@Column(name = "buyer_nick_name", nullable = false)
	public String getBuyerNickName() {
		return buyerNickName;
	}

	public void setBuyerNickName(String buyerNickName) {
		this.buyerNickName = buyerNickName;
	}

	@Column(name = "buyer_system_user_id", nullable = false)
	public String getBuyerSystemUserId() {
		return buyerSystemUserId;
	}

	@Column(name = "buyer_system_user_id", nullable = false)
	public void setBuyerSystemUserId(String buyerSystemUserId) {
		this.buyerSystemUserId = buyerSystemUserId;
	}

	@Column(name = "order_status", nullable = false)
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	@Column(name = "order_date", nullable = false)
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	@Column(name = "create_time", nullable = false)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "create_id", nullable = false)
	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	@Column(name = "last_update_time", nullable = false)
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "last_update_id", nullable = false)
	public Integer getLastUpdateId() {
		return lastUpdateId;
	}

	public void setLastUpdateId(Integer lastUpdateId) {
		this.lastUpdateId = lastUpdateId;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", itemCode="
				+ itemCode + ", orderNo=" + orderNo + ", buyerId=" + buyerId
				+ ", buyerNickName=" + buyerNickName + ", buyerSystemUserId="
				+ buyerSystemUserId + ", orderStatus=" + orderStatus
				+ ", orderDate=" + orderDate + ", createTime=" + createTime
				+ ", createId=" + createId + ", lastUpdateTime="
				+ lastUpdateTime + ", lastUpdateId=" + lastUpdateId + "]";
	}
	
	
}
