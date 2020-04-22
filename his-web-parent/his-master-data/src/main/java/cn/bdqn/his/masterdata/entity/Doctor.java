package cn.bdqn.his.masterdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 医生信息表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Doctor {
    private Integer id;
    private String name;
    private Integer type;
    private Integer age;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String typeName;
}
