package cn.bdqn.his.masterdata.mapper.item;

import cn.bdqn.his.masterdata.entity.CheckItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CheckItemMapper {
    List<CheckItem> getItems();
}
