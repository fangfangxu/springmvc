package com.iot.learnssm.firstssm.service.impl;

import com.iot.learnssm.firstssm.exception.CustomException;
import com.iot.learnssm.firstssm.mapper.UserAccMapper;
import com.iot.learnssm.firstssm.po.UserAcc;
import com.iot.learnssm.firstssm.service.TestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

public class TestExceptionImpl implements TestException {
    @Autowired
    private UserAccMapper userAccMapper;



    public UserAcc findItemsById(Integer items_id) throws Exception {
        UserAcc user =userAccMapper.findItemsById(items_id);
//        if(user==null){
////            throw new Exception("修改的商品信息不存在!Service");
////        }
        return user;
    }
}
