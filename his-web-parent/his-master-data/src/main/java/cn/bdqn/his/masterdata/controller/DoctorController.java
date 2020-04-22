package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.doctor.DoctorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@RestController
@Api
@RequestMapping("/api/doctor")
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    @ApiOperation(value = "查询医生信息接口",response = Response.class)
    @GetMapping("")
    public Response getDoctors(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(doctorService.getDoctorAll());
    }
}
