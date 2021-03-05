package com.mz.cn.account.service.impl;

import com.mz.cn.account.entity.Account;
import com.mz.cn.account.dao.AccountMapper;
import com.mz.cn.account.service.IAccountService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mz.cn.plan.entity.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huanglin
 * @since 2021-02-26
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

    @Override
    public void addAccountInfo(Account account) {
        LocalDateTime localDateTime = LocalDateTime.now();
        // 添加差创建时间
        account.setCreatDate(localDateTime);
        // 添加是有效状态
        account.setStatue("1");
        this.baseMapper.insert(account);

    }

    @Override
    public void delAccountInfo(Account account) {

    }

    @Override
    public void updateAccountInfo(Account account) {

    }

    @Override
    public List<Plan> getAccountInfoByPage() {
        return null;
    }

    @Override
    public Plan getAccountInfo(Account account) {
        return null;
    }
}
