package com.lxy.model;

import java.io.Serializable;

public class Menu implements Serializable {
    private String id;

    private String foodId;

    private String foodName;

    private String foodType;

    private Double foodPrice;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId == null ? null : foodId.trim();
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType == null ? null : foodType.trim();
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFoodId() == null ? other.getFoodId() == null : this.getFoodId().equals(other.getFoodId()))
            && (this.getFoodName() == null ? other.getFoodName() == null : this.getFoodName().equals(other.getFoodName()))
            && (this.getFoodType() == null ? other.getFoodType() == null : this.getFoodType().equals(other.getFoodType()))
            && (this.getFoodPrice() == null ? other.getFoodPrice() == null : this.getFoodPrice().equals(other.getFoodPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFoodId() == null) ? 0 : getFoodId().hashCode());
        result = prime * result + ((getFoodName() == null) ? 0 : getFoodName().hashCode());
        result = prime * result + ((getFoodType() == null) ? 0 : getFoodType().hashCode());
        result = prime * result + ((getFoodPrice() == null) ? 0 : getFoodPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", foodId=").append(foodId);
        sb.append(", foodName=").append(foodName);
        sb.append(", foodType=").append(foodType);
        sb.append(", foodPrice=").append(foodPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}