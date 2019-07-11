package com.zhiyou100.mapper;

import com.zhiyou100.domain.TbOrderShipping;
import com.zhiyou100.domain.TbOrderShippingExample;
import com.zhiyou100.domain.TbOrderShippingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderShippingMapper {
    long countByExample(TbOrderShippingExample example);

    int deleteByExample(TbOrderShippingExample example);

    int deleteByPrimaryKey(TbOrderShippingKey key);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    TbOrderShipping selectByPrimaryKey(TbOrderShippingKey key);

    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    int updateByPrimaryKeySelective(TbOrderShipping record);

    int updateByPrimaryKey(TbOrderShipping record);
}