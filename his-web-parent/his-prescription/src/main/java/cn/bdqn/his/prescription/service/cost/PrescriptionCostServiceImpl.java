package cn.bdqn.his.prescription.service.cost;

import cn.bdqn.his.prescription.entity.PrescriptionCost;
import cn.bdqn.his.prescription.mapper.PrescriptionCostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PrescriptionCostServiceImpl implements PrescriptionCostService {
    @Resource
    private PrescriptionCostMapper costMapper;

    @Override
    public boolean addPrescriptionCost(PrescriptionCost prescriptionCost) {
        return costMapper.addPrescriptionCost(prescriptionCost)!=0;
    }
}
