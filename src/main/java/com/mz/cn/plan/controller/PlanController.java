package com.mz.cn.plan.controller;


import com.mz.cn.plan.entity.Plan;
import com.mz.cn.plan.service.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author huanglin
 * @since 2021-02-18
 */
@RestController
@RequestMapping("/mz/plan")
public class PlanController {
    @Autowired
    private IPlanService service;

    /**
     * 增加计划信息
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addPlanInfo(@RequestBody Plan plan) {
        service.addPlanInfo(plan);
    }

}

