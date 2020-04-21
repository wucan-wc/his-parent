package cn.bdqn.his.prescription.service.illness;

import cn.bdqn.his.prescription.entity.PrescriptionIllness;
import cn.bdqn.his.prescription.mapper.PrescriptionIllnessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@CacheConfig(cacheNames = "prescription1")
public class PrescriptionIllnessServiceImpl implements PrescriptionIllnessService {
    @Resource
    private PrescriptionIllnessMapper mapper;
    @CachePut
    @Override
    public boolean addPrescriptionIllness(PrescriptionIllness prescriptionIllness) {
        return mapper.addPrescriptionIllness(prescriptionIllness)!=0;
    }
}
