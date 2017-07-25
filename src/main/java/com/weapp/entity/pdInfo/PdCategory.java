/**
 * Create time
 */
package com.weapp.entity.pdInfo;

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
@Document(collection="pd_Category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PdCategory {

    @Id
    private String id;

    private String appId;       //用户ID

    private String moduleName;

    private String sortId;      //排序

}
