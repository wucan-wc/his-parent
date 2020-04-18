package cn.bdqn.his.prescription.mapper;

import cn.bdqn.his.prescription.entity.PrescriptionDrug;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrescriptionDrugMapper {
    int addPrescriptionDrug(PrescriptionDrug prescriptionDrug);
}
