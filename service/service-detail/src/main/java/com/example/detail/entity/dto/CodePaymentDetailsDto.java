package com.example.detail.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * com.example.detail.entity.bo
 *
 * @author xzwnp
 * 2022/4/27
 * 16:36
 * 交易流水号、凭证号、票卡类型、交易时间、交易类型、交易金额
 */

@Data
@ApiModel("扫码交易明细")
public class CodePaymentDetailsDto {
    @ApiModelProperty("交易流水号")
    private String transSn;

    //在pay_union表查询
    @ApiModelProperty("凭证号")
    private String voucherNo;

    @ApiModelProperty("票卡类型")
    private String ticketType;

    @ApiModelProperty("交易时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime transTime;

    @ApiModelProperty("交易类型:现金交易;电子交易")
    private String transType;

    @ApiModelProperty("交易金额")
    private String transAmount;

}
