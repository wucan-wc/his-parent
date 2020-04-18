package cn.bdqn.his.prescription.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.prescription.entity.DoctorWarning;
import cn.bdqn.his.prescription.service.warning.DoctorWarningService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("/api/prescriptionDoctorWarning")
public class DoctorWarningController {
    @Autowired
    private DoctorWarningService doctorWarningService;

    @ApiOperation(value = "新增处方医嘱信息接口",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "处方id",name = "prescription_id",required = true),
            @ApiImplicitParam(value = "医嘱id",name = "doctor_warning_id",required = true)
    })
    @PostMapping("/add")
    public Response add(DoctorWarning doctorWarning){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(doctorWarning);
    }
}
