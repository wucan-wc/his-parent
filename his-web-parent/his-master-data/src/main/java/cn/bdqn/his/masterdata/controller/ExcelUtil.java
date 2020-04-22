package cn.bdqn.his.masterdata.controller;

import cn.bdqn.his.masterdata.entity.Doctor;
import cn.bdqn.his.masterdata.service.doctor.DoctorService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Component
public class ExcelUtil {


    @Autowired
    DoctorService doctorService;


//    @Scheduled(fixedRate = 20000)
    @Scheduled(cron = "0 0 22 28-31 * ?")
    public void test()throws Exception{
        final Calendar c = Calendar.getInstance();
        if (c.get(Calendar.DATE) == c.getActualMaximum(Calendar.DATE)) {
            //是最后一天
            List<Doctor> list = doctorService.getDoctorAll();
            HSSFWorkbook wb = new HSSFWorkbook();
            CreationHelper createHelper = wb.getCreationHelper();
            HSSFSheet sheet = wb.createSheet("sheel1");
            Row headRow = sheet.createRow(0); //第一行为头
            List<String> headList = Arrays.asList("医生id","医生姓名","医生类型id","年龄","性别","电话号码","医生邮箱","地址","医生类型");
            for (int i=0;i<headList.size();i++){  //遍历表头数据
                Cell cell = headRow.createCell(i);  //创建单元格
                cell.setCellValue(createHelper.createRichTextString(headList.get(i)));  //设置值
            }
            for (int i=0;i<list.size();i++){
                Doctor doctor=list.get(i);
                Field[] fields =doctor.getClass().getDeclaredFields();
                headRow = sheet.createRow(i+1);
                for (int k=0;k<fields.length;k++){
                    Field field=fields[k];
                    field.setAccessible(true);
                    Cell cell = headRow.createCell(k);  //创建单元格
                    cell.setCellValue(createHelper.createRichTextString(field.get(doctor).toString()));  //设置值
                }
            }
            FileOutputStream output = new FileOutputStream("E:/workbook-"+randomUUID()+".xls");
            wb.write(output);
            output.close();
        }

    }

    public  String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
