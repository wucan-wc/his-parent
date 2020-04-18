package cn.bdqn.his.masterdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 疾病信息表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Illness {
    private Integer id;
    private String name;
}
