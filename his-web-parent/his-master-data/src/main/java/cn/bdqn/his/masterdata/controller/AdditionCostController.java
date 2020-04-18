package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.cost.AdditionCostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api
@RequestMapping("/api/cost")
@RestController
public class AdditionCostController {
    @Resource
    private AdditionCostService costService;

    @ApiOperation(value = "查询附加费用信息接口",response = Response.class)
    @GetMapping("")
    public Response getAdditionCosts(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(costService.getAdditionCosts());
    }
}
