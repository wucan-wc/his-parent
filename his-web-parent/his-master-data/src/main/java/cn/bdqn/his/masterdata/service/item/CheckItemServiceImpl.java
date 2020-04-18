package cn.bdqn.his.masterdata.service.item;

import cn.bdqn.his.masterdata.entity.CheckItem;
import cn.bdqn.his.masterdata.mapper.item.CheckItemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CheckItemServiceImpl implements CheckItemService {
    @Resource
    private CheckItemMapper itemMapper;

    @Override
    public List<CheckItem> getItems() {
        return itemMapper.getItems();
    }
}
