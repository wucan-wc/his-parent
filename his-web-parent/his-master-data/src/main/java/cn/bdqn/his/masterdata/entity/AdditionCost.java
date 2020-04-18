package cn.bdqn.his.masterdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 附加费用信息表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdditionCost {
    private Integer id;
    private String cost;
    private Integer price;
}
