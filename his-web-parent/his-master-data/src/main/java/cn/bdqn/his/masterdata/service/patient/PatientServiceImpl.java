package cn.bdqn.his.masterdata.service.patient;

import cn.bdqn.his.masterdata.entity.Patient;
import cn.bdqn.his.masterdata.mapper.patient.PatientMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = "masterdata")
public class PatientServiceImpl implements PatientService {
    @Resource
    private PatientMapper patientMapper;
    @Cacheable
    @Override
    public List<Patient> getPatients() {
        return patientMapper.getPatients();
    }
}
