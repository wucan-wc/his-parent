package cn.bdqn.his.prescription.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处方费用信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionCost {
    private Integer id;
    private Integer prescription_id;
    private Integer cost_id;
}
