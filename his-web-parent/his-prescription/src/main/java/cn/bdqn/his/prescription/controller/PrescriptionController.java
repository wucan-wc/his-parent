package cn.bdqn.his.prescription.controller;

import cn.bdqn.his.common.http.HttpClientHelper;
import cn.bdqn.his.common.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Api
@RestController
@Slf4j
@RequestMapping("/api")
public class PrescriptionController {
    @Value("${server.medicine.url}")
    private String serverMedicineUrl;
    @Value("${server.masterdata.url}")
    private String serverMasterdataUrl;
    @Resource
    private HttpClientHelper httpClientHelper;
    @ApiOperation(value = "调用药品模块api,分页查询药品列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据,必填",name = "pageNum", required = true),
            @ApiImplicitParam(value = "每页显示几条,必填",name = "pageSize", required = true)
    })
    @GetMapping("getMedicines")
    public Response getMedicines(Integer pageNum, Integer pageSize) {
        Response response = httpClientHelper.getForResponse(serverMedicineUrl + "/api/medicines?pageNum="+pageNum+"&pageSize="+pageSize);
        return response;
    }
    @ApiOperation(value = "调用药品模块api,分页查询药品列表",response = Response.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "页码，查询第几页数据,必填",name = "pageNum", required = true),
            @ApiImplicitParam(value = "每页显示几条,必填",name = "pageSize", required = true),
            @ApiImplicitParam(value = "药品分类ID",name = "typeId"),
            @ApiImplicitParam(value = "药品名称，模糊匹配",name = "name")
    })
    @RequestMapping(value = "getMedicines/findBy", method = {RequestMethod.GET,RequestMethod.POST})
    public Response getMedicines(Integer pageNum, Integer pageSize, Integer typeId, String name) throws Exception {
        if(pageNum == null) pageNum = 1;
        if(pageSize == null) pageSize = 5;
        StringBuffer buffer = new StringBuffer(("?"));
        buffer.append("pageNum="+pageNum);
        buffer.append("&pageSize="+pageSize);
        if(typeId!=null) {
            buffer.append("&typeId="+typeId);
        }
        if(!StringUtils.isEmpty(name)) {
            buffer.append("&name=" + URLEncoder.encode(name,"UTF-8"));
        }
        log.debug("params:{}", buffer);
        Response response = httpClientHelper.getForResponse(serverMedicineUrl + "/api/medicines/findBy"+ buffer);
        return response;
    }

}
