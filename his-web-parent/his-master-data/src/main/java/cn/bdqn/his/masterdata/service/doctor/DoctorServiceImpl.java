package cn.bdqn.his.masterdata.service.doctor;

import cn.bdqn.his.masterdata.entity.Doctor;
import cn.bdqn.his.masterdata.mapper.doctor.DoctorMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = "masterdata")
public class DoctorServiceImpl implements DoctorService {
    @Resource
    private DoctorMapper doctorMapper;
    @Cacheable
    @Override
    public List<Doctor> getDoctorAll() {
        return doctorMapper.getDoctorAll();
    }
}
