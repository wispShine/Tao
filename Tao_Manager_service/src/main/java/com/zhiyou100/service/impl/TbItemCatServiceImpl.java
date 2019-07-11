package com.zhiyou100.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.domain.TbItemCat;
import com.zhiyou100.domain.TbItemCatExample;
import com.zhiyou100.domain.TbItemCatExample.Criteria;
import com.zhiyou100.mapper.TbItemCatMapper;
import com.zhiyou100.pojo.EasyUITreeNode;
import com.zhiyou100.service.TbItemCatService;
@Service
public class TbItemCatServiceImpl implements TbItemCatService {
	
	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	
	@Override
	public List<EasyUITreeNode> getItemCatList(long parentId) {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		List<EasyUITreeNode> nodeList = new ArrayList<EasyUITreeNode>();
		for (TbItemCat tbItemCat : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent()?"closed":"open");
			nodeList.add(node);
		}
		return nodeList;
	}

}
