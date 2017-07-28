/**
 * Create time
 */
package com.weapp.controller;

import com.weapp.common.annotation.Api;
import com.weapp.common.constant.ApiConstant;
import com.weapp.entity.shop.Shop;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@RestController
public class ShopController {


    @ApiOperation(value = "获取商品信息GROUP BY MODULE", notes = "根据用户的appid获取用户的商品和模块信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_SHOP_LIST)
    @RequestMapping(value = "/api/v1/wx/queryShop", method = RequestMethod.GET, produces = "application/json")
    public List queryShop(){
        List<Shop> shops= new ArrayList<>();
        shops.add(new Shop("1","店铺1","1"));
        shops.add(new Shop("2","店铺2","2"));
        return shops;
    }

    @ApiOperation(value = "获取商品信息GROUP BY MODULE", notes = "根据用户的appid获取用户的商品和模块信息")
    @ApiImplicitParam(name = "code", value = "用户登录回调内容会带上 ", required = true, dataType = "String")
    @Api(name = ApiConstant.WX_SHOP_INFO)
    @RequestMapping(value = "/api/v1/wx/queryShopInfo", method = RequestMethod.GET, produces = "application/json")
    public Shop queryShopList(){
        return new Shop("1","店铺1","1");
    }
}
