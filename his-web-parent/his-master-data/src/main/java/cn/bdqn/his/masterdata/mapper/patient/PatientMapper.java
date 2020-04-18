package cn.bdqn.his.masterdata.mapper.patient;

import cn.bdqn.his.masterdata.entity.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientMapper {
    List<Patient> getPatients();
}
