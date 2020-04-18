package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.Prescription;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrescriptionMapper {
    int addPrescription(Prescription prescription);
}
