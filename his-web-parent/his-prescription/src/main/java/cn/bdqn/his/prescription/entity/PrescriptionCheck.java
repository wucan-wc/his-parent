package cn.bdqn.his.prescription.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处方检查项目信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionCheck {
    private Integer id;
    private Integer prescription_id;
    private Integer check_id;
}
