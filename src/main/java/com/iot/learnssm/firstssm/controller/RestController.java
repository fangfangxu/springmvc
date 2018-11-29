package com.iot.learnssm.firstssm.controller;

import com.iot.learnssm.firstssm.po.UserAcc;
import com.iot.learnssm.firstssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
    @Autowired
    private ItemsService itemsService;

    //(1)定义方法，进行url映射使用REST风格的url，将查询商品信息的id传入controller .
    //(2)输出json使用@ResponseBody将java对象输出json。

    //查询商品信息，输出json
//itemsView/{id}里边的{id}表示占位符，通过@PathVariable获取占位符中的参数，
//@PathVariable中名称要和占位符一致，形参名无需和其一致
//如果占位符中的名称和形参名一致，在@PathVariable可以不指定名称
    @RequestMapping("/itemsView/{id}")
    public @ResponseBody String itemsView(@PathVariable("id") Integer items_id) throws Exception {
        //调用service查询商品信息
        UserAcc itemsCustom = null;

        return items_id.toString();

    }


}
