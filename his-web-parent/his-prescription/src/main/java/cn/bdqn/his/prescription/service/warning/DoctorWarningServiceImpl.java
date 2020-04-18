package cn.bdqn.his.prescription.service.warning;

import cn.bdqn.his.prescription.entity.DoctorWarning;
import cn.bdqn.his.prescription.mapper.DoctorWarningMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorWarningServiceImpl implements DoctorWarningService {
    @Autowired
    private DoctorWarningMapper warningMapper;

    @Override
    public boolean addDoctorWarning(DoctorWarning doctorWarning) {
        return warningMapper.addDoctorWarning(doctorWarning)!=0;
    }
}
