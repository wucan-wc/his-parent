package cn.bdqn.his.prescription.service.drug;

import cn.bdqn.his.prescription.entity.PrescriptionDrug;
import cn.bdqn.his.prescription.mapper.PrescriptionDrugMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PrescriptionDrugServiceImpl implements PrescriptionDrugService {
    @Resource
    private PrescriptionDrugMapper drugMapper;

    @Override
    public boolean addPrescriptionDrug(PrescriptionDrug prescriptionDrug) {
        return drugMapper.addPrescriptionDrug(prescriptionDrug)!=0;
    }
}
