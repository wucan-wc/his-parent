package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.doctorwarning.DoctorWarningService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api
@RestController
@RequestMapping("api/warning")
public class DoctorWarningController {
    @Resource private DoctorWarningService warningService;

    @GetMapping("")
    @ApiOperation(value = "查询医嘱信息接口",response = Response.class)
    public Response getWarningAll(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(warningService.getWarningAll());
    }
}
