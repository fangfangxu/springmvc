package com.iot.learnssm.firstssm.controller;



import com.iot.learnssm.firstssm.po.UserAcc;
import com.iot.learnssm.firstssm.po.UserAccVO;
import com.iot.learnssm.firstssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping("/item")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    //1、查询商品列表
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception {
        List<UserAcc> userAccList = itemsService.findItemsList(new UserAcc());
        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法,在jsp页面中通过itemsList取数据
        modelAndView.addObject("userAccList", userAccList);

        //指定视图
        //下边的路径，如果在视图解析器中配置jsp的路径前缀和后缀，修改为items/itemsList
        //modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        //下边的路径配置就可以不在程序中指定jsp路径的前缀和后缀
        modelAndView.setViewName("items/itemsList");
        return modelAndView;
    }


    //2、商品信息修改页面显示
//    @RequestMapping("/editItems")
    //限制http请求方法，可以post和get
    @RequestMapping(value="/editItems",method={RequestMethod.POST})
//    @ModelAttribute("aaa")
//    public Map<String, String> editItems( )throws Exception {
//    public String editItems(HttpServletRequest request, HttpServletResponse response ,@Validated(value = ValidGroup1.class) @ModelAttribute("bbb")UserAcc user,
//                            BindingResult bindingResult )throws Exception {

    public String editItems(Model model)throws Exception {
//        itemsService.findItemsById(1,user,bindingResult);
//         System.out.print(user.getUsername());
//        user.setUsername("2");
//        Map<String, String> itemTypes = new HashMap<String, String>();
//        itemTypes.put("101", "YSL");
//        itemTypes.put("102", "ZMC");
//        return itemTypes;
            // 出错重新到商品修改页面
            model.addAttribute("abc","abc");
            return "items/editItems";

        }


//        //调用service根据商品id查询商品信息
//        UserAcc useracc = itemsService.findItemsById(1);
//        request.setAttribute("result",useracc);
//        //重定向
////        request.getRequestDispatcher("queryItems.action").forward(request, response);
//
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("application/json;charset=utf-8");
//        response.getWriter().write(String.valueOf(useracc.getBirthday()));
//        //转发
////        response.sendRedirect("queryItems.action");


    //商品信息修改提交
    @RequestMapping("/deleteItems")
    public String deleteItems(Integer[] items_id) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        //返回一个成功页面
        modelAndView.setViewName("success");
        return null;
    }


}
