/**
 * Create time
 */
package com.weapp.service;

import com.weapp.entity.app.TUser;
import com.weapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@Service
@Transactional(readOnly=true)
public class TUserService {
    @Autowired
    private UserRepository userRepository;

    public TUser getByAppId(String appId){
        return userRepository.findByAppId(appId);
    }
}
