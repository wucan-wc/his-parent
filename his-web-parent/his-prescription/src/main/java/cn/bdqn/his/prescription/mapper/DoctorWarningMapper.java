package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.DoctorWarning;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoctorWarningMapper {
    int addDoctorWarning(DoctorWarning doctorWarning);
}
