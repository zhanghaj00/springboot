/**
 * Create time
 */
package com.weapp.repository;

import com.weapp.entity.app.TUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
public interface UserRepository extends MongoRepository<TUser, String> {
    TUser findByAppId(String appId);
}
