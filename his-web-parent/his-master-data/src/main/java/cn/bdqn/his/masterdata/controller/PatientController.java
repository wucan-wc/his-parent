package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.service.patient.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("api/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @ApiOperation(value = "查询患者信息接口",response = Response.class)
    @GetMapping("")
    public Response getPatients(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(patientService.getPatients());
    }
}
