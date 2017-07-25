/**
 * Create time
 */
package com.weapp.controller;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.weapp.common.annotation.Api;
import com.weapp.common.constant.ApiConstant;
import com.weapp.common.constant.ErrorResponse;
import com.weapp.entity.pdInfo.PdCategory;
import com.weapp.entity.pdInfo.PdInfo;
import com.weapp.service.PdCategoryService;
import com.weapp.service.PdInfoSerivce;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@RestController
public class PdInfoController extends BaseController {

    @Autowired
    private PdInfoSerivce pdInfoSerivce;

    @Autowired
    private PdCategoryService pdCategoryService;


    @ApiOperation(value = "插入商品信息", notes = "根据用户的appid插入用户信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_PD_INSERT)
    @RequestMapping(value = "/api/v1/wx/insertPdInfo", method = RequestMethod.POST, produces = "application/json")
    public Map<String,Object> insertPdInfo(@RequestParam(required = true,value = "code")String wxCode,
                                            PdInfo pdInfo){
        if(null == pdInfo) return rtnParam(50010, null);
        pdInfo.setAppId(wxCode);
        pdInfoSerivce.insertPdInfo(pdInfo);
        return rtnParam(0, new ErrorResponse("成功"));
    }

    @ApiOperation(value = "修改商品信息", notes = "根据用户的appid插入用户信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_PD_EDIT)
    @RequestMapping(value = "/api/v1/wx/editPdInfo", method = RequestMethod.POST, produces = "application/json")
    public Map<String,Object> editPdInfo(@RequestParam(required = true,value = "code")String wxCode,
                                           PdInfo pdInfo){
        if(null == pdInfo && null == pdInfo.getId()) return rtnParam(50010, null);
        pdInfo.setAppId(wxCode);
        pdInfoSerivce.editPdInfo(pdInfo);
        return rtnParam(0, new ErrorResponse("成功"));
    }

    @ApiOperation(value = "获取商品信息", notes = "根据用户的appid获取用户的商品和模块信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_PD_QUERY)
    @RequestMapping(value = "/api/v1/wx/queryPdInfo", method = RequestMethod.GET, produces = "application/json")
    public Map<String,Object> queryPdInfo(@RequestParam(required = true,value = "code")String wxCode,
                                          PdInfo pdInfo){
        if(null == wxCode) return rtnParam(50030, new ErrorResponse("用户ID 不能为空"));
        pdInfo.setAppId(wxCode);
        List<PdInfo> infos = pdInfoSerivce.findByAppIdAndModuleId(pdInfo);
        return rtnParam(0, ImmutableMap.of("pdInfos", infos));
    }


    @ApiOperation(value = "获取商品信息GROUP BY MODULE", notes = "根据用户的appid获取用户的商品和模块信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_PD_QUERY_GROUP_MODULE)
    @RequestMapping(value = "/api/v1/wx/queryPdInfoModule", method = RequestMethod.GET, produces = "application/json")
    public Map<String,Object> queryPdInfoGroupByModule(@RequestParam(required = true,value = "code")String wxCode){
        if(null == wxCode) return rtnParam(50030, new ErrorResponse("用户ID 不能为空"));
        List<PdCategory> infos = pdCategoryService.findByAppId(wxCode);
        return rtnParam(0, ImmutableMap.of("pdInfos",infos));
    }

    @ApiOperation(value = "插入商品MODULE", notes = "根据用户的appid获取用户的商品和模块信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_PD_INSERT_MODULE)
    @RequestMapping(value = "/api/v1/wx/insertPdModule", method = RequestMethod.POST, produces = "application/json")
    public Map<String,Object> insertPdModule(@RequestParam(required = true,value = "code")String wxCode,PdCategory pdCategory){
        if(null == wxCode) return rtnParam(50030, new ErrorResponse("用户ID 不能为空"));
        pdCategory.setAppId(wxCode);
        pdCategory = pdCategoryService.insert(pdCategory);
        return rtnParam(0, ImmutableMap.of("pdCategory",pdCategory));
    }
}
