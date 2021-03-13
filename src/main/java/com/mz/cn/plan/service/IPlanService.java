package com.mz.cn.plan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mz.cn.plan.entity.Plan;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author huanglin
 * @since 2021-02-18
 */
public interface IPlanService extends IService<Plan> {
    void addPlanInfo(Plan plan);

    void delPlanInfo(Plan plan);

    void updatePlanInfo(Plan plan);

    List<Plan> getPlanInfoByPage();

    Plan getPlanInfo(Plan plan);
}
