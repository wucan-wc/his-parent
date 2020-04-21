package cn.bdqn.his.prescription.service.warning;

import cn.bdqn.his.prescription.entity.DoctorWarning;
import cn.bdqn.his.prescription.mapper.DoctorWarningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "prescription1")
public class DoctorWarningServiceImpl implements DoctorWarningService {
    @Autowired
    private DoctorWarningMapper warningMapper;
    @CachePut
    @Override
    public boolean addDoctorWarning(DoctorWarning doctorWarning) {
        return warningMapper.addDoctorWarning(doctorWarning)!=0;
    }
}
