package sky.pro.springkorzina.hwkorzina.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OnlineStore {
    private Integer productNum;
    private String productName;

    public OnlineStore(Integer productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public String getProductName() {
        return productName;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineStore that = (OnlineStore) o;
        return Objects.equals(productNum, that.productNum) && Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNum, productName);
    }

    @Override
    public String toString() {
        return "OnlineStore{" +
                "productNum=" + productNum +
                ", productName='" + productName + '\'' +
                '}';
    }
}
