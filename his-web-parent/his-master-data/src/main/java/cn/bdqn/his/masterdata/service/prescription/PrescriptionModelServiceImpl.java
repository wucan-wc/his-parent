package cn.bdqn.his.masterdata.service.prescription;

import cn.bdqn.his.masterdata.entity.PrescriptionModel;
import cn.bdqn.his.masterdata.mapper.prescription.PrescriptionModelMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PrescriptionModelServiceImpl implements PrescriptionModelService {
    @Resource
    private PrescriptionModelMapper modelMapper;
    @Override
    public List<PrescriptionModel> getPrescriptionModels(Map<String, Object> map) {
        return modelMapper.getPrescriptionModels(map);
    }
}
