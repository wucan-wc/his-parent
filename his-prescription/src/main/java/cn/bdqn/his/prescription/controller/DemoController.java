package cn.bdqn.his.prescription.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.bdqn.his.common.http.HttpClientHelper;
import cn.bdqn.his.common.response.Response;

/**
 * api调用demo
 * @author Administrator
 *
 */
@Api
@RestController
public class DemoController {
	@Value("${server.medicine.url}")
	private String serverMedicineUrl;
	@Autowired private HttpClientHelper httpClientHelper;
	
	@GetMapping("api/medicine/users")
	public Response getUsers() {
		return httpClientHelper.get(serverMedicineUrl + "/api/medicine/users");
	}
}
