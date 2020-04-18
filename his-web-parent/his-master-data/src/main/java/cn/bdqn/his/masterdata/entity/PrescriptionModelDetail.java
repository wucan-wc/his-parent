package cn.bdqn.his.masterdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionModelDetail {
    private Integer id;
    private Integer group;
    private Integer drug_id;
    private Integer dosage;
    private String usage;
    private String frequentness;
    private Integer day;
    private Integer sum;
    private Integer price;
    private Integer model_id;
    private String name;
}
