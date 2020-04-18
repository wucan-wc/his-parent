package cn.bdqn.his.masterdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionModel {
    private Integer id;
    private String name;
    private String code;
    private String explain;
    private Integer type;
    private String jurisdiction;
    private Date createDate;
    private Integer doctor_id;
    List<PrescriptionModelDetail> detailList;
    private String type_name;
}
