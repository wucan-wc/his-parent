package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.Medicine;
import cn.bdqn.his.medicine.mapper.MedicineMapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = "medicine1")
public class MedicineServiceImpl implements MedicineService {
    @Resource
    private MedicineMapper medicineMapper;

    @Cacheable
    @Override
    public List<Medicine> findAll()
    {
        System.out.println("findAll");
        return medicineMapper.findAll();
    }
    @Cacheable
    @Override
    public List<Medicine> findAll(Integer typeId, String name) {
        return medicineMapper.findAllBy(typeId, name);
    }
}
