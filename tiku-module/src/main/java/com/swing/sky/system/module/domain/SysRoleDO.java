package com.swing.sky.system.module.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
public class SysRoleDO implements Serializable {

    @NotNull(message = "not null")
    @Size(min = 1, max = 100, message = "1-100")
    private String roleName;

    private Boolean deleted;

    protected Long id;

    protected Boolean use;

    protected Integer orderNum;

    protected String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    protected Date createTime;

    protected String updateBy;

    protected Date updateTime;

    protected String remark;


}
