package ceb.assetManager.dao;

import org.springframework.stereotype.Component;

import ceb.assetManager.domain.Asset;
import ceb.assetManager.repository.CustomBaseRepository;
import ceb.assetManager.repository.asset.AssetRepository;

@Component
public interface AssetDao extends CustomBaseRepository<Asset,Long>, AssetRepository{
    
}