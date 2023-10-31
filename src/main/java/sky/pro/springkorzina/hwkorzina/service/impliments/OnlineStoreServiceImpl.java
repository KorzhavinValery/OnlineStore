package sky.pro.springkorzina.hwkorzina.service.impliments;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import sky.pro.springkorzina.hwkorzina.service.OnlineStoreService;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OnlineStoreServiceImpl implements OnlineStoreService {
    private final List<Integer> productList = new ArrayList<>();

    @Override
    public boolean addProduct(List<Integer> product) {
        return productList.addAll(product);
    }

    @Override
    public List<Integer> getProduct() {
        return productList;
    }
}
