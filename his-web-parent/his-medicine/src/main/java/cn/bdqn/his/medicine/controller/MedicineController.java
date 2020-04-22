package cn.bdqn.his.medicine.controller;

import cn.bdqn.his.common.http.HttpClientHelper;
import cn.bdqn.his.common.response.Response;
import cn.bdqn.his.common.response.ResponseEnum;
import cn.bdqn.his.medicine.entity.Medicine;
import cn.bdqn.his.medicine.service.MedicineService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Api
@RestController
@RequestMapping("/api/medicines")
public class MedicineController {
    @Autowired private MedicineService medicineService;

    @GetMapping("")
    public Response findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Medicine> list = medicineService.findAll();
        PageInfo<Medicine> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
    @RequestMapping(value = "/findBy",method = {RequestMethod.GET,RequestMethod.POST})
    public Response findBy(Integer pageNum, Integer pageSize, Integer typeId, String name) {
        PageHelper.startPage(pageNum,pageSize);
        List<Medicine> list = medicineService.findAll(typeId, name);
        PageInfo<Medicine> pageInfo = new PageInfo<>(list);
        return new Response(ResponseEnum.SUCCESS).setResponseBody(pageInfo);
    }
    @Resource
    HttpClientHelper httpClientHelper;
    @GetMapping("test")
    public Response test() {
        return httpClientHelper.getForResponse("http://localhost:9007/api/doctor");
    }
}
