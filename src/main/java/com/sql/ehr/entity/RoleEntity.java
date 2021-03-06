package com.sql.ehr.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
@TableName("role")
public class RoleEntity {
    private static final long serialVersionUID = 1L;
    @TableId
    @ApiModelProperty(name = "roleid",value = "")
    private String roleid;
    @TableId
    @ApiModelProperty(name = "rolename",value = "")
    private String rolename;
}
