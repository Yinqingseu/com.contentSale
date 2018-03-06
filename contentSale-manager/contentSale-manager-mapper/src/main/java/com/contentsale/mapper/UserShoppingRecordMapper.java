package com.contentsale.mapper;

import com.contentsale.pojo.UserShoppingRecord;
import com.contentsale.pojo.UserShoppingRecordExample;
import com.contentsale.pojo.UserShoppingRecordKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShoppingRecordMapper {
    int countByExample(UserShoppingRecordExample example);

    int deleteByExample(UserShoppingRecordExample example);

    int deleteByPrimaryKey(UserShoppingRecordKey key);

    int insert(UserShoppingRecord record);

    int insertSelective(UserShoppingRecord record);

    List<UserShoppingRecord> selectByExample(UserShoppingRecordExample example);

    UserShoppingRecord selectByPrimaryKey(UserShoppingRecordKey key);

    int updateByExampleSelective(@Param("record") UserShoppingRecord record, @Param("example") UserShoppingRecordExample example);

    int updateByExample(@Param("record") UserShoppingRecord record, @Param("example") UserShoppingRecordExample example);

    int updateByPrimaryKeySelective(UserShoppingRecord record);

    int updateByPrimaryKey(UserShoppingRecord record);
}