package cn.bdqn.his.masterdata.service.illness;

import cn.bdqn.his.masterdata.entity.Illness;
import cn.bdqn.his.masterdata.mapper.illness.IllnessMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = "masterdata")
public class IllnessServiceImpl implements IllnessService {
    @Resource
    private IllnessMapper illnessMapper;
    @Cacheable
    @Override
    public List<Illness> getIllness() {
        return illnessMapper.getIllness();
    }
}
