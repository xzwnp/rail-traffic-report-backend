package com.example.statistic.service;

import com.example.statistic.entity.CardIssueStatistic;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.Nullable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaozhiwei
 * @since 2022-05-04
 */
public interface CardIssueStatisticService extends IService<CardIssueStatistic> {

    void saveCardIssueStatistics(@Nullable String date);
}
