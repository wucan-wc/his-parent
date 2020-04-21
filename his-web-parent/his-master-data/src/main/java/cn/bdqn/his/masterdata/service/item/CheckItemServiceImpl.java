package cn.bdqn.his.masterdata.service.item;

import cn.bdqn.his.masterdata.entity.CheckItem;
import cn.bdqn.his.masterdata.mapper.item.CheckItemMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = "masterdata")
public class CheckItemServiceImpl implements CheckItemService {
    @Resource
    private CheckItemMapper itemMapper;
    @Cacheable
    @Override
    public List<CheckItem> getItems() {
        return itemMapper.getItems();
    }
}
