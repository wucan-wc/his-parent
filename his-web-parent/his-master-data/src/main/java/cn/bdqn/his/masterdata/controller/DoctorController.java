package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.doctor.DoctorService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api
@RequestMapping("/api/masterdata")
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    @GetMapping("")
    public Response findDoctorAll(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(doctorService.getDoctorAll());
    }
}
