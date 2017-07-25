/**
 * Create time
 */
package com.weapp.repository;

import com.weapp.entity.pdInfo.PdCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
public interface PdCategoryRepository  extends MongoRepository<PdCategory, String> {

    public List<PdCategory> findByAppId(String appId);
}
