package cn.bdqn.his.prescription.entity;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Api
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionDrug {
    private Integer id;
    private Integer prescription_id;
    private Integer drug_id;
    private Integer dosage;//用量
    private String usage;//用法
    private Integer frequentness;//频度
    private Integer day;//天数
}
