package cn.bdqn.his.prescription.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处方医嘱信息类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorWarning {
    private Integer id;
    private Integer prescription_id;//处方id
    private Integer doctor_warning_id;//医嘱id
}
