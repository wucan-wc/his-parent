package cn.bdqn.his.masterdata.mapper.warning;

import cn.bdqn.his.masterdata.entity.DoctorWarning;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorWarningMapper {
    /**
     * 查询医嘱信息
     * @return
     */
    List<DoctorWarning> getWarningAll();
}
