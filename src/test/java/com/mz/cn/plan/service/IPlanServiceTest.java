package com.mz.cn.plan.service;

import com.mz.cn.plan.controller.PlanController;
import com.mz.cn.plan.entity.Plan;
import org.junit.jupiter.api.Test;

/**
 * @Description <p></p>
 * @Author: Huanglin
 * @Date: 2021/2/19 10:06
 * @Version 0.0.1
 */
class IPlanServiceTest {

    @Test
    void addPlanInfo() {
        Plan p = new Plan();
        p.setStatus(0);
        p.setPriority(1);
        p.setId(0);
        p.setDel("0");
        p.setTitle("这是一个测试");

    }

    @Test
    void delPlanInfo() {
    }

    @Test
    void updatePlanInfo() {
    }

    @Test
    void getPlanInfoByPage() {
    }

    @Test
    void getPlanInfo() {
    }
}