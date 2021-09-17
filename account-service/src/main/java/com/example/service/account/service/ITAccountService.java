package com.example.service.account.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.service.account.entity.TAccount;
import com.example.service.common.dto.AccountDTO;
import com.example.service.common.response.ObjectResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface ITAccountService {

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
