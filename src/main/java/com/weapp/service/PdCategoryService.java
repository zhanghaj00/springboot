/**
 * Create time
 */
package com.weapp.service;

import com.weapp.entity.pdInfo.PdCategory;
import com.weapp.repository.PdCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@Service
@Transactional(readOnly = true)
public class PdCategoryService {

    @Autowired
    private PdCategoryRepository pdCategoryRepository;


    public List<PdCategory> findByAppId(String appId){
        return pdCategoryRepository.findByAppId(appId);
    }

    public PdCategory insert(PdCategory pdCategory){
        return pdCategoryRepository.insert(pdCategory);
    }




}
