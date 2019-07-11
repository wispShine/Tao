package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.pojo.EasyUITreeNode;
import com.zhiyou100.service.TbItemCatService;

@Controller
public class TbItemCatController {
	@Autowired
	private TbItemCatService TbItemCatService;
	
	
	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id",defaultValue="0")Long parentId){
		return TbItemCatService.getItemCatList(parentId);
	}
	
	
}
