package cn.bdqn.his.masterdata.mapper.doctor;

import cn.bdqn.his.masterdata.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorMapper {
    /**
     * 查询所有医生信息
     */
    List<Doctor> getDoctorAll();
}
