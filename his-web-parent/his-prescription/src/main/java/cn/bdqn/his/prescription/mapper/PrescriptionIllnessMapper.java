package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.PrescriptionIllness;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrescriptionIllnessMapper {
    int addPrescriptionIllness(PrescriptionIllness prescriptionIllness);
}
