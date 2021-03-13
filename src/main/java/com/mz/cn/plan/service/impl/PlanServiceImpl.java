package com.mz.cn.plan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mz.cn.plan.dao.PlanMapper;
import com.mz.cn.plan.entity.Plan;
import com.mz.cn.plan.service.IPlanService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author huanglin
 * @since 2021-02-18
 */
@Service
public class PlanServiceImpl extends ServiceImpl<PlanMapper, Plan> implements IPlanService {


    /**
     * 添加计划信息
     */
    @Override
    public void addPlanInfo(Plan plan) {
        LocalDateTime localDateTime = LocalDateTime.now();
        // 保存创建时间
        plan.setCreateTime(localDateTime);
        // 默认计划开始时间是在创建时间 1小时候开始
        plan.setStartTime(localDateTime.plusHours(1));
        // 默认计划在开始时间的1小时内完成
        plan.setEndTime(localDateTime.plusHours(2));
        this.baseMapper.insert(plan);
    }

    /**
     * 删除计划信息
     */
    @Override
    public void delPlanInfo(Plan plan) {
        this.baseMapper.updateById(plan);
    }

    /**
     * 修改计划信息
     */
    @Override
    public void updatePlanInfo(Plan plan) {
        this.baseMapper.updateById(plan);
    }

    /**
     * 分页查询计划信息
     * @return
     */
    @Override
    public List<Plan> getPlanInfoByPage() {

        return null;
    }

    /**
     * 按条件查询分页信息
     */
    @Override
    public Plan getPlanInfo(Plan plan) {
        return null;
    }

}
