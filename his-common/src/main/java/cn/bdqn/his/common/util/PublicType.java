package cn.bdqn.his.common.util;

/**
 * 工共类型表
 */
public class PublicType {
    private Integer id;
    private Integer type_id;
    private String type_value;
    private Integer group;

    public PublicType() {
    }

    public PublicType(Integer id, Integer type_id, String type_value, Integer group) {
        this.id = id;
        this.type_id = type_id;
        this.type_value = type_value;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_value() {
        return type_value;
    }

    public void setType_value(String type_value) {
        this.type_value = type_value;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}
