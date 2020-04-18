package cn.bdqn.his.masterdata.service.prescription;


import cn.bdqn.his.masterdata.entity.PrescriptionModel;

import java.util.List;
import java.util.Map;

public interface PrescriptionModelService {
    /**
     * 查询处方模板信息
     */
    List<PrescriptionModel> getPrescriptionModels(Map<String,Object> map);
}
