package com.zhiyou100.mapper;

import com.zhiyou100.domain.TbItem;
import com.zhiyou100.domain.TbItemExample;
import com.zhiyou100.domain.TbItemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
    long countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(TbItemKey key);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemExample example);
    
    List<TbItem> selectAll();

    TbItem selectByPrimaryKey(TbItemKey key);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}