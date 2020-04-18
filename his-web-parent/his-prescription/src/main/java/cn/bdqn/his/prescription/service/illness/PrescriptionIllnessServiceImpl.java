package cn.bdqn.his.prescription.service.illness;

import cn.bdqn.his.prescription.entity.PrescriptionIllness;
import cn.bdqn.his.prescription.mapper.PrescriptionIllnessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PrescriptionIllnessServiceImpl implements PrescriptionIllnessService {
    @Resource
    private PrescriptionIllnessMapper mapper;

    @Override
    public boolean addPrescriptionIllness(PrescriptionIllness prescriptionIllness) {
        return mapper.addPrescriptionIllness(prescriptionIllness)!=0;
    }
}
