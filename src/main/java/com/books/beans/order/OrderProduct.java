package com.books.beans.order;
import java.util.Date;


public class OrderProduct {
    private int id;
    private int customerId;
    private int productId;
    private int amount;
    private Date date;
    private String productName;
    private String productCategory;
    private String productDescription;
    private double productPrice;
    private int productAmount;
    private String productImg;
    private String totalPrice;
    public OrderProduct(int id, int customerId, int productId, int amount, Date date, String productName,
            String productCategory, String productDescription, double productPrice, int productAmount,
            String productImg, String totalPrice) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.amount = amount;
        this.date = date;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
        this.productImg = productImg;
        this.totalPrice = totalPrice;
    }
    public OrderProduct() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public int getProductAmount() {
        return productAmount;
    }
    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }
    public String getProductImg() {
        return productImg;
    }
    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }
    public String getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "OrderProduct [id=" + id + ", customerId=" + customerId + ", productId=" + productId + ", amount="
                + amount + ", date=" + date + ", productName=" + productName + ", productCategory=" + productCategory
                + ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", productAmount="
                + productAmount + ", productImg=" + productImg + ", totalPrice=" + totalPrice + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + customerId;
        result = prime * result + productId;
        result = prime * result + amount;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
        result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
        long temp;
        temp = Double.doubleToLongBits(productPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + productAmount;
        result = prime * result + ((productImg == null) ? 0 : productImg.hashCode());
        result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderProduct other = (OrderProduct) obj;
        if (id != other.id)
            return false;
        if (customerId != other.customerId)
            return false;
        if (productId != other.productId)
            return false;
        if (amount != other.amount)
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        if (productCategory == null) {
            if (other.productCategory != null)
                return false;
        } else if (!productCategory.equals(other.productCategory))
            return false;
        if (productDescription == null) {
            if (other.productDescription != null)
                return false;
        } else if (!productDescription.equals(other.productDescription))
            return false;
        if (Double.doubleToLongBits(productPrice) != Double.doubleToLongBits(other.productPrice))
            return false;
        if (productAmount != other.productAmount)
            return false;
        if (productImg == null) {
            if (other.productImg != null)
                return false;
        } else if (!productImg.equals(other.productImg))
            return false;
        if (totalPrice == null) {
            if (other.totalPrice != null)
                return false;
        } else if (!totalPrice.equals(other.totalPrice))
            return false;
        return true;
    }
   
    
    
}
