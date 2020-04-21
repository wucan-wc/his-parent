package cn.bdqn.his.prescription.service.check;

import cn.bdqn.his.prescription.entity.PrescriptionCheck;
import cn.bdqn.his.prescription.mapper.PrescriptionCheckMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@CacheConfig(cacheNames = "prescription1")
public class PrescriptionCheckServiceImpl implements PrescriptionCheckService {
    @Resource
    private PrescriptionCheckMapper checkMapper;
    @CachePut
    @Override
    public boolean addPrescriptionCheck(PrescriptionCheck prescriptionCheck) {
        return checkMapper.addPrescriptionCheck(prescriptionCheck)!=0;
    }
}
