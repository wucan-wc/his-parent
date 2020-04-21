package cn.bdqn.his.masterdata.service.cost;

import cn.bdqn.his.masterdata.entity.AdditionCost;
import cn.bdqn.his.masterdata.mapper.cost.AdditionCostMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = "masterdata")
public class AdditionCostServiceImpl implements AdditionCostService {
    @Resource private AdditionCostMapper costMapper;
    @Cacheable
    @Override
    public List<AdditionCost> getAdditionCosts() {
        return costMapper.getAdditionCosts();
    }
}
