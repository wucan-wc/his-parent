package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.PrescriptionModel;
import cn.bdqn.his.masterdata.entity.PrescriptionModelDetail;
import cn.bdqn.his.masterdata.service.cost.AdditionCostService;
import cn.bdqn.his.masterdata.service.doctor.DoctorService;
import cn.bdqn.his.masterdata.service.doctorwarning.DoctorWarningService;
import cn.bdqn.his.masterdata.service.illness.IllnessService;
import cn.bdqn.his.masterdata.service.item.CheckItemService;
import cn.bdqn.his.masterdata.service.patient.PatientService;
import cn.bdqn.his.masterdata.service.prescription.PrescriptionModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
@RunWith(SpringRunner.class)
public class MasterDataTest {
    @Resource
    private DoctorService doctorService;
    @Resource
    private IllnessService illnessService;
    @Resource
    private DoctorWarningService warningService;
    @Resource
    private AdditionCostService costService;
    @Resource
    private CheckItemService itemService;
    //医生信息查询
    @Test
    public void test1(){
        doctorService.getDoctorAll().forEach(doctor -> {
            log.debug(doctor.toString());
        });
    }
    //疾病信息查询
    @Test
    public void test2(){
        illnessService.getIllness().forEach(illness ->{
            log.debug(illness.toString());
        });
    }

    //医嘱信息查询
    @Test
    public void test3(){
        warningService.getWarningAll().forEach(doctorWarning -> {
            log.debug(doctorWarning.toString());
        });
    }

    //费用信息查询
    @Test
    public void test4(){
        costService.getAdditionCosts().forEach(additionCost -> {
            log.debug(additionCost.toString());
        });
    }

    //检查项目信息查询
    @Test
    public void test5(){
        itemService.getItems().forEach(checkItem -> {
            log.debug(checkItem.toString());
        });
    }
    @Autowired
    private PatientService patientService;
    //患者信息查询
    @Test
    public void test6(){
        patientService.getPatients().forEach(patient -> {
            log.debug(patient.toString());
        });
    }

    @Resource
    private PrescriptionModelService modelService;

    //处方模板详情查询
    @Test
    public void test7(){
        Integer type=1;
        String jurisdiction="私人模板";
        String code="R";
        Map<String,Object> map=new HashMap<>();
        map.put("type",type);
        map.put("jurisdiction",jurisdiction);
        map.put("code",code);
        PageHelper.startPage(1,2);
        List<PrescriptionModel> list=modelService.getPrescriptionModels(map);
        PageInfo<PrescriptionModel> pageInfo=new PageInfo<>(list);
        log.debug(pageInfo.toString());
        for (PrescriptionModel model:list) {
            log.debug(model.toString());
            for (PrescriptionModelDetail modelDetail:model.getDetailList()) {
                log.debug(modelDetail.toString());
            }
        }
    }
}
