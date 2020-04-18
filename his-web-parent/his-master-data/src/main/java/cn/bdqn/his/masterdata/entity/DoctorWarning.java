package cn.bdqn.his.masterdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 医嘱信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorWarning {
    private Integer id;
    private String message;
}
