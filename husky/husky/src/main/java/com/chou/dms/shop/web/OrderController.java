package com.chou.dms.shop.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chou.dms.common.persistence.Page;
import com.chou.dms.common.persistence.PropertyFilter;
import com.chou.dms.common.web.BaseController;
import com.chou.dms.shop.entity.Order;
import com.chou.dms.shop.service.OrderService;

/**
 * 商品controller
 * @author ty
 * @date 2015年1月22日
 */
@Controller
@RequestMapping("order/list")
public class OrderController extends BaseController{
	
	@Autowired
	private OrderService orderService;

	/**
	 * 默认页面
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String list() {
		return "order/orderList";
	}
	
	/**
	 * 获取商品json
	 */
	@RequestMapping(value="json",method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> orderList(HttpServletRequest request) {
		Page<Order> page = getPage(request);
		List<PropertyFilter> filters = PropertyFilter.buildFromHttpRequest(request);
		page = orderService.search(page, filters);
		return getEasyUIData(page);
	}
	
	/**
	 * 添加商品跳转
	 * 
	 * @param model
	 */
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String createForm(Model model) {
		model.addAttribute("order", new Order());
		model.addAttribute("action", "create");
		return "order/orderForm";
	}

	/**
	 * 添加商品
	 * 
	 * @param goods
	 * @param model
	 */
	@RequestMapping(value = "create", method = RequestMethod.POST)
	@ResponseBody
	public String create(@Valid Order order, Model model) {
		orderService.save(order);
		return "success";
	}

	/**
	 * 修改商品跳转
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("order", orderService.get(id));
		model.addAttribute("action", "update");
		return "order/orderForm";
	}

	/**
	 * 修改商品
	 * 
	 * @param goods
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	@ResponseBody
	public String update(@Valid @ModelAttribute @RequestBody Order order,Model model) {
		orderService.update(order);
		return "success";
	}

	/**
	 * 删除商品
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "delete/{id}")
	@ResponseBody
	public String delete(@PathVariable("id") Integer id) {
		orderService.delete(id);
		return "success";
	}
	
	@ModelAttribute
	public void getOrder(@RequestParam(value = "id", defaultValue = "-1") Integer id,Model model) {
		if (id != -1) {
			model.addAttribute("order", orderService.get(id));
		}
	}
}
