package cn.bdqn.his.prescription.service.cost;

import cn.bdqn.his.prescription.entity.PrescriptionCost;
import cn.bdqn.his.prescription.mapper.PrescriptionCostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@CacheConfig(cacheNames = "prescription1")
public class PrescriptionCostServiceImpl implements PrescriptionCostService {
    @Resource
    private PrescriptionCostMapper costMapper;
    @CachePut
    @Override
    public boolean addPrescriptionCost(PrescriptionCost prescriptionCost) {
        return costMapper.addPrescriptionCost(prescriptionCost)!=0;
    }
}
