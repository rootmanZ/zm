package com.mz.cn.account.controller;


import com.mz.cn.account.entity.Account;
import com.mz.cn.account.service.IAccountService;
import com.mz.cn.plan.entity.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author huanglin
 * @since 2021-02-26
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService service;

    /**
     * 添加账户密码信息
     *
     * @param account
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    void plusAccountInfo(@RequestBody Account account) {
        service.addAccountInfo(account);
    }

    /**
     * 删除账户密码信息
     *
     * @param account
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    void removeAccountInfo(@RequestBody Account account) {
    }

    /**
     * 更新账户密码信息
     *
     * @param account
     */
    @RequestMapping(value = "update", method = RequestMethod.POST)
    void updateAccountInfo(@RequestBody Account account) {
    }

    /**
     * 查询账户密码信息列表
     *
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.POST)
    List<Plan> searchAccountInfoByPage() {
        List<Plan> list = new ArrayList<>();
        return list;
    }

    /**
     * 查询账号信息
     *
     * @param account
     * @return
     */
    @RequestMapping(value = "get", method = RequestMethod.POST)
    Plan searchAccountInfo(Account account) {
        return null;
    }

}

