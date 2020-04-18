package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.masterdata.entity.PrescriptionModel;
import cn.bdqn.his.masterdata.service.prescription.PrescriptionModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@Api
@RequestMapping("/api/prescriptionmodel")
public class PrescriptionModelController {
    @Resource
    private PrescriptionModelService modelService;

    @ApiOperation(value = "调用处方模型api,分页查询处方模型详细信息",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "处方类型",name = "type"),
            @ApiImplicitParam(value = "模板权限",name = "jurisdiction"),
            @ApiImplicitParam(value = "模板编号/模板名称",name = "code"),
            @ApiImplicitParam(value = "查询第几页数据",name = "pageNum",required = true),
            @ApiImplicitParam(value = "每页显示数据条数",name = "pageSize",required = true)
    })
    @GetMapping("")
    public Response fingAll(Integer type,String jurisdiction,String code,Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Map<String,Object> map=new HashMap<>();
        map.put("type",type);
        map.put("jurisdiction",jurisdiction);
        map.put("code",code);
        List<PrescriptionModel> list=modelService.getPrescriptionModels(map);
        PageInfo<PrescriptionModel> pageInfo=new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }

}
