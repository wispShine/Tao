package com.zhiyou100.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.pojo.EasyUIDataGridResult;
import com.zhiyou100.service.TbItemService;

@Controller
public class TbItemController {
	
	@Autowired
	private TbItemService tbItemService;
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult list2(Integer page, Integer rows) {
		return tbItemService.getItemList(page, rows);
	}
	
	
	
	
	
}
