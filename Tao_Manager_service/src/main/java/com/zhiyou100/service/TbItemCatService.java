package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.pojo.EasyUITreeNode;

public interface TbItemCatService {
	List<EasyUITreeNode> getItemCatList(long parentId);
}
