package cn.bdqn.his.masterdata.mapper.prescription;

import cn.bdqn.his.masterdata.entity.PrescriptionModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PrescriptionModelMapper {
    /**
     * 处方模型信息查询
     */
    List<PrescriptionModel> getPrescriptionModels(Map<String,Object> map);
}
