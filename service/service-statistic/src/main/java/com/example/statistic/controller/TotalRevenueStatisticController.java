package com.example.statistic.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.statistic.entity.CardIssueStatistic;
import com.example.statistic.entity.TotalRevenueStatistic;
import com.example.statistic.entity.query.TotalRevenueStatisticQuery;
import com.example.statistic.entity.query.UserStatisticQuery;
import com.example.statistic.service.TotalRevenueStatisticService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xiaozhiwei
 * @since 2022-05-04
 */
@RestController
@RequestMapping("total-revenue")
public class TotalRevenueStatisticController {
    @Autowired
    TotalRevenueStatisticService totalRevenueStatisticService;

    @PostMapping("page/{current}/size/{size}")
    List<TotalRevenueStatistic> list(@PathVariable int current, @PathVariable int size, @RequestBody(required = false) TotalRevenueStatisticQuery query) {
        Page<TotalRevenueStatistic> page = new Page<>(current, size);
        QueryWrapper<TotalRevenueStatistic> wrapper = null;
        if (query != null) {
            wrapper = new QueryWrapper<>();
            wrapper.ge(query.getStartTime() != null, "date", query.getStartTime());
            wrapper.le(query.getEndTime() != null, "date", query.getEndTime());
        }
        totalRevenueStatisticService.page(page, wrapper);

        return page.getRecords();
    }
}
