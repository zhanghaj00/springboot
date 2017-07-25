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

    private String pdPic;           //主图片

    private String pdDesc;          //描述

    private String pdVideo;         //视频

    private String pdPrice;         //价格

    private String pdStore;        //库存

    private String pdPicMore;   //详情图片

    private String pdBuyNum;  //总购买数量




}
