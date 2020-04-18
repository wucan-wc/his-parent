package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.PrescriptionCost;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrescriptionCostMapper {
    int addPrescriptionCost(PrescriptionCost prescriptionCost);
}
