package com.contentsale.mapper;

import com.contentsale.pojo.Contents;
import com.contentsale.pojo.ContentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentsMapper {
    int countByExample(ContentsExample example);

    int deleteByExample(ContentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contents record);

    int insertSelective(Contents record);

    List<Contents> selectByExample(ContentsExample example);

    Contents selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByExample(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByPrimaryKeySelective(Contents record);

    int updateByPrimaryKey(Contents record);
}