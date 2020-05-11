package com.ceb.manager.dao;

import org.springframework.stereotype.Component;
import com.ceb.manager.domain.Asset;
import com.ceb.manager.repository.CustomBaseRepository;
import com.ceb.manager.repository.asset.AssetRepository;

@Component
public interface AssetDao extends CustomBaseRepository<Asset,Long>, AssetRepository{
    
}