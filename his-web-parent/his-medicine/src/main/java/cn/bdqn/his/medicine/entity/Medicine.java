package cn.bdqn.his.medicine.entity;

import lombok.*;

import java.io.Serializable;

/**
 * 药品基本信息表
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Medicine implements Serializable {
    private Integer id;
    private Integer typeId;
    private String code;
    private String name;
    private String specification;//规格
    private Integer count;
    private String unit;//单位
    private Integer price;
    private String inventory;//库存
    private String manufacturer;//生产商
    private String supplier;//供应商
    private String type;
}
