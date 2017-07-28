/**
 * Create time
 */
package com.weapp.entity.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCount {

    private String total;

    private String paymentOrder;

    private String income;

    private String visitShopLog;

    private String paymentGoods;

    public OrderCount(String total) {
        this.total = total;
    }
}
