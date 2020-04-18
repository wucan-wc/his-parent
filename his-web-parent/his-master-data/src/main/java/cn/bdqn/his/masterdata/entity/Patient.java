package cn.bdqn.his.masterdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 患者信息类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private Integer id;
    private String name;
    private String card;
    private Integer age;
    private Date birthday;
    private String gender;
    private String phone;
    private Integer accept_type;//患者类型id
    private String address;
    private String acceptTypeName;//患者类型名称
}
