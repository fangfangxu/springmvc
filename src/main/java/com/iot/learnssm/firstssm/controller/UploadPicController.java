package com.iot.learnssm.firstssm.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.UUID;

/**
 * 文件上传Controller
 */
@Controller
public class UploadPicController {

    @RequestMapping(value = "/uploadpic" ,method = RequestMethod.POST)
    public void uploadPic(MultipartFile items_pic, @RequestParam(value ="id" ) Integer id)throws Exception {
        //上传图片
        if (items_pic != null && items_pic.getOriginalFilename() != null && items_pic.getOriginalFilename().length() > 0) {
            //存储图片的物理路径
            String pic_path = "E:\\image\\";

            //新的图片名称
            String newFileName = UUID.randomUUID() + items_pic.getOriginalFilename().substring(items_pic.getOriginalFilename().lastIndexOf("."));
            //新图片
            File newFile = new File(pic_path + newFileName);
            //将内存中的数据写入磁盘
            items_pic.transferTo(newFile);


        }

    }


}