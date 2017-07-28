/**
 * Create time
 */
package com.weapp.controller;

import com.weapp.common.annotation.Api;
import com.weapp.common.constant.ApiConstant;
import com.weapp.entity.order.OrderCount;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@RestController
public class OrderController {

    @ApiOperation(value = "获取商品信息GROUP BY MODULE", notes = "根据用户的appid获取用户的商品和模块信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_ORDER_COUNT)
    @RequestMapping(value = "/api/v1/wx/orderCount", method = RequestMethod.GET, produces = "application/json")
    public Integer orderCount(@RequestParam(required = true,value = "count_type")String count_type){

        switch (count_type){
            case "TODAY":
                return 10;
            case "MONTH":
                return 20;
            default:
                return 30;

        }
    }

    @ApiOperation(value = "获取商品信息GROUP BY MODULE", notes = "根据用户的appid获取用户的商品和模块信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_ORDER_STATUS_COUNT)
    @RequestMapping(value = "/api/v1/wx/orderStatusCount", method = RequestMethod.GET, produces = "application/json")
    public Map<String,Object> orderStatusCount(){
        Map<String,Object> orders = new HashMap<>();

        orders.put("1",new OrderCount("1"));
        orders.put("2",new OrderCount("2"));
        orders.put("3",new OrderCount("3"));
        return orders;
    }
}
