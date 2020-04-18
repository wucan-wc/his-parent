package cn.bdqn.his.prescription.service.prescription;

import cn.bdqn.his.prescription.entity.Prescription;
import cn.bdqn.his.prescription.mapper.PrescriptionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    @Resource
    private PrescriptionMapper prescriptionMapper;

    @Override
    public boolean addPrescription(Prescription prescription) {
        return prescriptionMapper.addPrescription(prescription)!=0;
    }
}
