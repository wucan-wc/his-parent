package cn.bdqn.his.prescription.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 处方信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {
    private Integer id;
    private Integer doctor_id;
    private Integer patient_id;
}
