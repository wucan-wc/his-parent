package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.illness.IllnessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api
@RequestMapping("/api/illness")
public class IllnessController {
    @Resource
    private IllnessService illnessService;

    @ApiOperation(value = "疾病信息查询接口",response = Response.class)
    @GetMapping("")
    public Response findAll(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(illnessService.getIllness());
    }
}
