package com.example.service.order.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.service.common.dto.OrderDTO;
import com.example.service.common.response.ObjectResponse;
import com.example.service.order.entity.TOrder;

/**
 * <p>
 *  创建订单
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
