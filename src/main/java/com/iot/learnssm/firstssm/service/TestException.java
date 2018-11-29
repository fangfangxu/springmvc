package com.iot.learnssm.firstssm.service;

import com.iot.learnssm.firstssm.po.UserAcc;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestParam;

public interface TestException {
    //根据id查询商品void信息
    UserAcc findItemsById(Integer items_id) throws Exception;
}
