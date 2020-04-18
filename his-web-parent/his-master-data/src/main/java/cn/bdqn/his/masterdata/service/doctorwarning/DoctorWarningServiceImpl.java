package cn.bdqn.his.masterdata.service.doctorwarning;

import cn.bdqn.his.masterdata.entity.DoctorWarning;
import cn.bdqn.his.masterdata.mapper.warning.DoctorWarningMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoctorWarningServiceImpl implements DoctorWarningService {
    @Resource private DoctorWarningMapper warningMapper;
    @Override
    public List<DoctorWarning> getWarningAll() {
        return warningMapper.getWarningAll();
    }
}
