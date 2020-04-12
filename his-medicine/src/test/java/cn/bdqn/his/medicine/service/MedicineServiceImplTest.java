package cn.bdqn.his.medicine.service;

import cn.bdqn.his.common.util.PageHelpers;
import cn.bdqn.his.medicine.entity.Medicine;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class MedicineServiceImplTest {
    @Resource MedicineService medicineService;

    @Test
    public void findAll() {
        PageHelpers.startPage(1,2);
        List<Medicine> list = medicineService.findAll();
        PageInfo<Medicine> pageInfo = new PageInfo<>(list);
        log.debug(pageInfo.toString());
        pageInfo.getList().forEach(medicine -> {
            log.debug(medicine.toString());
        });
    }
    @Test
    public void findAllBy() {
        PageHelpers.startPage(2,2);
        List<Medicine> list = medicineService.findAll(1,"化");
        PageInfo<Medicine> pageInfo = new PageInfo<>(list);
        log.debug(pageInfo.toString());
        pageInfo.getList().forEach(medicine -> {
            log.debug(medicine.toString());
        });

    }
}