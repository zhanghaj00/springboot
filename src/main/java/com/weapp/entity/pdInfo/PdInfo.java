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
@Document(collection="pd_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PdInfo {

    @Id
    private String id;

    private String appId;

    private String moduleId;  //规则 app id + 序列号

    private String moduleName;

    private String pdName;

    private String pdPic;

    private String pdDesc;

    private String pdVideo;

    private String pdPrice;

    private String pdStore;


}
