package com.cui.doubbo.client.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by cjs
 * Date： 2017/11/20.
 * Time： 11:44.
 */
@Data
public class Collage implements Serializable {
    private Integer id;
    private String name;
    private String phone;
    private Integer status;
    private Integer sex;
    private String company;
    private String workType;
    private String number;
    private String remark;
    private String yn;
    private Date createTime;
    private Date updateTime;
}
