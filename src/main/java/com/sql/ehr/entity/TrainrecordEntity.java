package com.sql.ehr.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author shenqinlin
 * @email 1392825484@qq.com
 * @date 2020-07-06 23:04:32
 */
@ApiModel
@Data
@TableName("trainrecord")
public class TrainrecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "trno",value = "")
	private String trno;
	/**
	 * 
	 */
	@ApiModelProperty(name = "trresult",value = "")
	private String trresult;
	/**
	 * 
	 */
	@ApiModelProperty(name = "tevaluate",value = "")
	private String tevaluate;

}
