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
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
public class ExcelUtil {


    @Autowired
    DoctorService doctorService;


//    @Scheduled(fixedRate = 20000)
    public void test()throws IOException{
        List<Doctor> list = doctorService.getDoctorAll();
        HSSFWorkbook wb = new HSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();
        HSSFSheet sheet = wb.createSheet("sheel1");
        Row headRow = sheet.createRow(0); //第一行为头
        List<String> headList = Arrays.asList("医生id","医生姓名","医生邮箱");
        for (int i=0;i<headList.size();i++){  //遍历表头数据
           Cell cell = headRow.createCell(i);  //创建单元格
           cell.setCellValue(createHelper.createRichTextString(headList.get(i)));  //设置值
        }
        int num=0;
        for (int i=0;i<list.size();i++){  //遍历表头数据
           headRow = sheet.createRow(i+1);
           Cell cell = headRow.createCell(num++);  //创建单元格
           cell.setCellValue(createHelper.createRichTextString(list.get(i).getId()+""));  //设置值
           cell = headRow.createCell(num++);  //创建单元格
           cell.setCellValue(createHelper.createRichTextString(list.get(i).getName()));
           cell = headRow.createCell(num++);  //创建单元格
            cell.setCellValue(createHelper.createRichTextString(list.get(i).getEmail()));
            num=0;
        }

        FileOutputStream output = new FileOutputStream("E:/workbook-"+randomUUID()+".xls");
        wb.write(output);
        output.close();
    }

    public  String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
