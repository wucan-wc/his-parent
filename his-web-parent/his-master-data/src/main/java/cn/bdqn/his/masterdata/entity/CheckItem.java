package cn.bdqn.his.masterdata.entity;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 检查项目信息类
 */
@Api
@NoArgsConstructor
@AllArgsConstructor
public class CheckItem {
    private Integer id;
    private String name;
    private Integer type;//类型id
    private String unit;
    private Integer price;
    private String typeName;//类型名称
}
