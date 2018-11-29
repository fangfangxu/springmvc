package com.iot.learnssm.firstssm.controller;

import com.iot.learnssm.firstssm.exception.CustomException;
import com.iot.learnssm.firstssm.po.UserAcc;
import com.iot.learnssm.firstssm.service.TestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestExceptionController {
    @Autowired
    private TestException testException;

    @RequestMapping(value="/testexception", method = RequestMethod.POST)
    public String testException(Model model, @RequestParam(value="id",required=true) Integer items_id)throws Exception {

        //调用service根据商品id查询商品信息
        UserAcc user = testException.findItemsById(items_id);

        //判断商品是否为空，根据id没有查询到商品，抛出异常，提示用户商品信息不存在
        if(user == null){
            throw new CustomException("修改的商品信息不存在Controller!");
        }

        //通过形参中的model将model数据传到页面
        //相当于modelAndView.addObject方法
        model.addAttribute("user", user);

        return "items/editItems";
    }



}
