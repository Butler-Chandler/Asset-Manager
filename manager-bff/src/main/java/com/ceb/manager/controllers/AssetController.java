package com.ceb.manager.controllers;

import java.util.List;

import com.ceb.manager.controllers.response.RestResponse;
import com.ceb.manager.dao.AssetDao;
import com.ceb.manager.domain.Asset;
import com.ceb.manager.util.NumericUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AssetController {
    
    @Autowired
    AssetDao assetDao;
    
    @RequestMapping("/asset")
    public List<Asset> getAllAssets(){
        return assetDao.findAll();
    }

    @RequestMapping("/asset/{assetId}")
    public Asset getAssetById(@RequestParam(name="assetId") Long assetId){
        return assetDao.findById(assetId).orElse(null);
    }

    @PostMapping(value="/asset")
    public RestResponse saveOrUpdateAsset(@RequestBody Asset asset) {
        if(NumericUtils.hasLong(asset.getId())){
            assetDao.findById(asset.getId()).ifPresent(value -> {
                value.deepCopy(asset);
                assetDao.save(value);
            });
        } else {
            assetDao.save(asset);
        }
        return new RestResponse(200L);        
    }
    
}