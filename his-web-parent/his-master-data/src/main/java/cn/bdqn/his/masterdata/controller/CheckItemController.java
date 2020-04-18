package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.item.CheckItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api
@RestController
@RequestMapping("api/item")
public class CheckItemController {
    @Resource private CheckItemService itemService;

    @ApiOperation(value = "查询检查项目信息接口",response = Response.class)
    @GetMapping("")
    public Response getItems(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(itemService.getItems());
    }
}
