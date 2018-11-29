package com.iot.learnssm.firstssm.mapper;

import com.iot.learnssm.firstssm.po.UserAcc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAccMapper {
    List<UserAcc> findItemsList(UserAcc useracc) throws Exception;

    UserAcc findItemsById(Integer id) throws Exception;

    void updateItems(@Param("userscc")UserAcc userscc) throws Exception;
}