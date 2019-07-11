package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.domain.TbItem;
import com.zhiyou100.mapper.TbItemMapper;
import com.zhiyou100.pojo.EasyUIDataGridResult;
import com.zhiyou100.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService {
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public EasyUIDataGridResult getItemList(int page, int rows) {
		//分页处理
		PageHelper.startPage(page,rows);
		//
		List<TbItem> list = tbItemMapper.selectAll();
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
