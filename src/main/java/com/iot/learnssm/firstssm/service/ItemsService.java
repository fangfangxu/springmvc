package com.iot.learnssm.firstssm.service;

import com.iot.learnssm.firstssm.po.UserAcc;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface ItemsService {
    //商品查询列表
    List<UserAcc> findItemsList(UserAcc useracc) throws Exception;

    //根据id查询商品void信息
    void findItemsById(Integer id, @Validated UserAcc user,
                          BindingResult bindingResult) throws Exception;

    //修改商品信息
    void updateItems(Integer id,UserAcc itemsCustom) throws Exception;

}
