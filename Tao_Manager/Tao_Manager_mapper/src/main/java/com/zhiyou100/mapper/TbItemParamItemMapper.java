package com.zhiyou100.mapper;

import com.zhiyou100.domain.TbItemParamItem;
import com.zhiyou100.domain.TbItemParamItemExample;
import com.zhiyou100.domain.TbItemParamItemKey;
import com.zhiyou100.domain.TbItemParamItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamItemMapper {
    long countByExample(TbItemParamItemExample example);

    int deleteByExample(TbItemParamItemExample example);

    int deleteByPrimaryKey(TbItemParamItemKey key);

    int insert(TbItemParamItemWithBLOBs record);

    int insertSelective(TbItemParamItemWithBLOBs record);

    List<TbItemParamItemWithBLOBs> selectByExampleWithBLOBs(TbItemParamItemExample example);

    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    TbItemParamItemWithBLOBs selectByPrimaryKey(TbItemParamItemKey key);

    int updateByExampleSelective(@Param("record") TbItemParamItemWithBLOBs record, @Param("example") TbItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") TbItemParamItemWithBLOBs record, @Param("example") TbItemParamItemExample example);

    int updateByExample(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    int updateByPrimaryKeySelective(TbItemParamItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamItemWithBLOBs record);

    int updateByPrimaryKey(TbItemParamItem record);
}