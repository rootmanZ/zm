package com.mz.cn.account.service;

import com.mz.cn.account.entity.Account;
import com.baomidou.mybatisplus.service.IService;
import com.mz.cn.plan.entity.Plan;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huanglin
 * @since 2021-02-26
 */
public interface IAccountService extends IService<Account> {


    /**
     * 添加账户密码信息
     * @param account
     */
    void addAccountInfo(Account account);

    /**
     * 删除账户密码信息
     * @param account
     */
    void delAccountInfo(Account account);

    /**
     * 更新账户密码信息
     * @param account
     */
    void updateAccountInfo(Account account);

    /**
     * 查询账户密码信息列表
     * @return
     */
    List<Plan> getAccountInfoByPage();

    /**
     * 查询账号信息
     * @param account
     * @return
     */
    Plan getAccountInfo(Account account);

}
