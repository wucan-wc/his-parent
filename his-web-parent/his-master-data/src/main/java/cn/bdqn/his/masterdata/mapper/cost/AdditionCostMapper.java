package cn.bdqn.his.masterdata.mapper.cost;

import cn.bdqn.his.masterdata.entity.AdditionCost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdditionCostMapper {
    List<AdditionCost> getAdditionCosts();
}
