package com.ihrm.common.controller;

import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

/**
 * @Author: 846602483
 * @Date: 2019-8-6 23:21
 * @Version 1.0
 */
@RestController
@CrossOrigin
public class ErrorController {
    //公共错误跳转
    @RequestMapping (value = "autherror")
    public Result autherror(int code){
        return code == 1? new Result(ResultCode.UNAUTHENTICATED):new Result(ResultCode.UNAUTHORISE);
    }
}