package com.toko.online.toko.online.controller;

import com.toko.online.toko.online.modal.Barang;
import com.toko.online.toko.online.modal.Order;
import com.toko.online.toko.online.response.ResponHelper;
import com.toko.online.toko.online.servis.BarangService;
import com.toko.online.toko.online.servis.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public Object getAllOrder(){
        return ResponHelper.ok( orderService.getAllOrder()) ;

    }
    @GetMapping("/{id}")
    public Object getOrder(@PathVariable("id") Long id) {

        return ResponHelper.ok( orderService.gerOrder(id));
    }
    @PostMapping
    public Object addOrder(@RequestBody Order order) {
        return ResponHelper.
                ok(orderService.addOrder(order));
    }
    @PutMapping("/{id}")
    public Object editOrderById(@PathVariable("id") Long id, @RequestBody Order order) {
        return ResponHelper.ok( orderService.editOrder(id, order.getNameBarang(), order.getHarga(), order.getPemilik()));
    }
    @DeleteMapping("/{id}")
    public void deleteOrderById(@PathVariable("id") Long id) { orderService.deleteOrderById(id);}

}
