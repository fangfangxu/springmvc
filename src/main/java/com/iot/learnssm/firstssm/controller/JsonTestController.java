package com.iot.learnssm.firstssm.controller;

import com.iot.learnssm.firstssm.po.UserAcc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonTestController {

    //请求json串(商品信息)，输出json(商品信息)
    //@RequestBody将请求的商品信息的json串转成itemsCustom对象
    //@ResponseBody将itemsCustom转成json输出
    @RequestMapping(value = "/requestJson" , method = RequestMethod.POST)
//    @ResponseBody
    public @ResponseBody UserAcc test1(UserAcc userAcc){

    UserAcc a=null;

     //@ResponseBody将itemsCustom转成json输出
      return userAcc;
    }


    //请求key/value，输出json
    @RequestMapping("/responseJson")
    public @ResponseBody UserAcc responseJson(UserAcc itemsCustom){

        //@ResponseBody将itemsCustom转成json输出
        return itemsCustom;
    }
}
