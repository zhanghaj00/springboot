/**
 * Create time
 */
package com.weapp.repository;

import com.weapp.entity.pdInfo.PdInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
public interface PdInfoRepository extends MongoRepository<PdInfo, String> {

    List<PdInfo> findByAppId(String appId);
    List<PdInfo> findByAppIdAndModuleId(String appId,String moduleId);


}
