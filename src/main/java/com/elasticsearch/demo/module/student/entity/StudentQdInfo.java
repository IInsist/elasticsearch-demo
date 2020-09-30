package com.elasticsearch.demo.module.student.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author fujh
 * @since 2020-09-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("student_qd_info")
@ApiModel(value="StudentQdInfo对象", description="")
public class StudentQdInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "学号")
    @TableId("XH")
    private String xh;

    @ApiModelProperty(value = "姓名")
    @TableField("XM")
    private String xm;

    @ApiModelProperty(value = "身份证")
    @TableField("SFZ")
    private String sfz;

    @ApiModelProperty(value = "联系电话")
    @TableField("LXDH")
    private String lxdh;

    @ApiModelProperty(value = "通讯地址")
    @TableField("TXDZ")
    private String txdz;

    @ApiModelProperty(value = "年级")
    @TableField("NJ")
    private String nj;

    @ApiModelProperty(value = "班级")
    @TableField("BJ")
    private String bj;

    @ApiModelProperty(value = "专业")
    @TableField("ZY")
    private String zy;

    @ApiModelProperty(value = "班主任")
    @TableField("BZR")
    private String bzr;

    @ApiModelProperty(value = "类型 0 统招  1 社招")
    @TableField("LX")
    private String lx;

    @ApiModelProperty(value = "系统联系电话")
    @TableField("XTLXDH")
    private String xtlxdh;

    @ApiModelProperty(value = "创建时间")
    @TableField("CJSJ")
    private Date cjsj;

    @ApiModelProperty(value = "更新时间")
    @TableField("GXSJ")
    private Date gxsj;

    @ApiModelProperty(value = "是否健康")
    @TableField("SFJK")
    private String sfjk;

    @ApiModelProperty(value = "是否进出重点区域")
    @TableField("SFJCZDQY")
    private String sfjczdqy;

    @ApiModelProperty(value = "重点区域城市")
    @TableField("ZDQYCS")
    private String zdqycs;

    @ApiModelProperty(value = "是否在隔离区")
    @TableField("SFZGLQY")
    private String sfzglqy;

    @ApiModelProperty(value = "班主任联系电话")
    @TableField("BZRLXDH")
    private String bzrlxdh;

    @ApiModelProperty(value = "学院")
    @TableField("XY")
    private String xy;

    @ApiModelProperty(value = "学校")
    @TableField("XX")
    private String xx;

}
