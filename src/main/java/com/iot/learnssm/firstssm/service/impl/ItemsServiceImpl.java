package com.iot.learnssm.firstssm.service.impl;

import com.iot.learnssm.firstssm.mapper.UserAccMapper;
import com.iot.learnssm.firstssm.po.UserAcc;
import com.iot.learnssm.firstssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private UserAccMapper userAccMapper;


    public List<UserAcc> findItemsList(UserAcc useracc) throws Exception {

        return userAccMapper.findItemsList(useracc);
    }

    public void findItemsById(Integer id, @Validated UserAcc user,
                                 BindingResult bindingResult) throws Exception {
        user =userAccMapper.findItemsById(id);
//        //获取校验错误信息
//        if (bindingResult.hasErrors()) {
//            // 输出错误信息
//            List<ObjectError> allErrors = bindingResult.getAllErrors();
//
//            for (ObjectError objectError : allErrors) {
//                // 输出错误信息
//                System.out.println(objectError.getDefaultMessage());
//            }
//            // 将错误信息传到页面
//            model.addAttribute("allErrors", allErrors);
//
//            //可以直接使用model将提交pojo回显到页面
//            model.addAttribute("items", userAcc);
//        }


    }

    public void updateItems(Integer id, UserAcc itemsCustom) throws Exception {
        itemsCustom.setId(id);
        userAccMapper.updateItems(itemsCustom);
    }
}
