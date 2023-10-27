package sky.pro.springkorzina.hwkorzina.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.springkorzina.hwkorzina.service.impliments.OnlineStoreServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OnlineStoreController {
    private final OnlineStoreServiceImpl onlineStoreService;

    public OnlineStoreController(OnlineStoreServiceImpl onlineStoreService) {
        this.onlineStoreService = onlineStoreService;
    }

    @GetMapping(path = "/add")
    public boolean addProduct (@RequestParam ("id") ArrayList<Integer> productList) {
      return onlineStoreService.addProduct(productList);
    }
    @RequestMapping(path = "/get")
    public List<Integer> getProduct() {
        return onlineStoreService.getProduct();
    }

}
