package com.contentsale.mapper;

import com.contentsale.pojo.UserShoppingRecord;
import com.contentsale.pojo.UserShoppingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShoppingRecordMapper {
    int countByExample(UserShoppingRecordExample example);

    int deleteByExample(UserShoppingRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(UserShoppingRecord record);

    int insertSelective(UserShoppingRecord record);

    List<UserShoppingRecord> selectByExample(UserShoppingRecordExample example);

    UserShoppingRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") UserShoppingRecord record, @Param("example") UserShoppingRecordExample example);

    int updateByExample(@Param("record") UserShoppingRecord record, @Param("example") UserShoppingRecordExample example);

    int updateByPrimaryKeySelective(UserShoppingRecord record);

    int updateByPrimaryKey(UserShoppingRecord record);
}