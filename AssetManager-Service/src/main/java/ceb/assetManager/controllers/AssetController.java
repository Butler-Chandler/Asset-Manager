package ceb.assetManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ceb.assetManager.controllers.response.RestResponse;
import ceb.assetManager.dao.AssetDao;
import ceb.assetManager.domain.Asset;
import ceb.assetManager.util.NumericUtils;

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