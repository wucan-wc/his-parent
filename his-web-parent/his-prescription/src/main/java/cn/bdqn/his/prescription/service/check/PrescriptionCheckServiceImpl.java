package cn.bdqn.his.prescription.service.check;

import cn.bdqn.his.prescription.entity.PrescriptionCheck;
import cn.bdqn.his.prescription.mapper.PrescriptionCheckMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PrescriptionCheckServiceImpl implements PrescriptionCheckService {
    @Resource
    private PrescriptionCheckMapper checkMapper;

    @Override
    public boolean addPrescriptionCheck(PrescriptionCheck prescriptionCheck) {
        return checkMapper.addPrescriptionCheck(prescriptionCheck)!=0;
    }
}
