/**
 * Create time
 */
package com.weapp.service;

import com.weapp.entity.pdInfo.PdInfo;
import com.weapp.repository.PdInfoRepository;
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
@Transactional(readOnly=true)
public class PdInfoSerivce {

    @Autowired
    private PdInfoRepository pdInfoRepository;

    public List<PdInfo> findByAppId(String appId){
        return pdInfoRepository.findByAppId(appId);
    }
    public PdInfo insertPdInfo(PdInfo pdInfo){
        return pdInfoRepository.insert(pdInfo);
    }
    public void editPdInfo(PdInfo pdInfo){
        pdInfoRepository.save(pdInfo);
    }
    public void deletePdInfo(PdInfo pdInfo){
        pdInfoRepository.delete(pdInfo);
    }
    public List<PdInfo> findByAppIdAndModuleId(PdInfo pdInfo){
        return pdInfoRepository.findByAppIdAndModuleId(pdInfo.getAppId(),pdInfo.getModuleId());
    }
}
