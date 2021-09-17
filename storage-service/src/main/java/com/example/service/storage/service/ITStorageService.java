package com.example.service.storage.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.service.common.dto.CommodityDTO;
import com.example.service.common.response.ObjectResponse;
import com.example.service.storage.entity.TStorage;

/**
 * 仓库服务
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface ITStorageService extends IService<TStorage> {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
