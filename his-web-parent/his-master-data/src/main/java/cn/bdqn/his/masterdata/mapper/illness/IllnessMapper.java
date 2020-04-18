package cn.bdqn.his.masterdata.mapper.illness;

import cn.bdqn.his.masterdata.entity.Illness;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IllnessMapper {
    List<Illness> getIllness();
}
