package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.PrescriptionCheck;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrescriptionCheckMapper {
    int addPrescriptionCheck(PrescriptionCheck prescriptionCheck);
}
