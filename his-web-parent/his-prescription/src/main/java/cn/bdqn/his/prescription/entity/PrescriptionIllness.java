package cn.bdqn.his.prescription.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处方疾病信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionIllness {
    private Integer id;
    private Integer prescription_id;
    private Integer illness_id;
}
