/**
 * Create time
 */
package com.weapp.entity.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@Document(collection="Shop_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    @Id
    private String id;

    private String shopName;

    private String shopId;
}
