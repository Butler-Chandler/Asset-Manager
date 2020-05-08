package com.ceb.manager.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import com.ceb.manager.domain.types.AssetType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="asset")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value={"createdAt","updatedAt"},allowGetters=true)
public class Asset extends BaseEntity implements Serializable{
    private static final long serialVersionUID = 8663428335679686522L;

    @ManyToOne
    private AssetType assetType;

    private String location;
    private Date warrantyExpiration;
    private String manufacturer;
    private BigDecimal price;
    private String description;

    public AssetType getAssetType() {
        return this.assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getWarrantyExpiration() {
        return this.warrantyExpiration;
    }

    public void setWarrantyExpiration(Date warrantyExpiration) {
        this.warrantyExpiration = warrantyExpiration;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void deepCopy(Asset newAssetData){
        this.assetType = newAssetData.getAssetType();
        this.location = newAssetData.getLocation();
        this.warrantyExpiration = newAssetData.getWarrantyExpiration();
        this.manufacturer = newAssetData.getManufacturer();
        this.price = newAssetData.getPrice();
        this.description = newAssetData.getDescription();
    }

}