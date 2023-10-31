package sky.pro.springkorzina.hwkorzina.service;

import java.util.List;

public interface OnlineStoreService {
    boolean  addProduct(List<Integer> product);

    List<Integer> getProduct();
}
