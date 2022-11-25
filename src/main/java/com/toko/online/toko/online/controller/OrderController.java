package com.toko.online.toko.online.controller;

import com.toko.online.toko.online.dto.OrderDTO;
import com.toko.online.toko.online.modal.Barang;
import com.toko.online.toko.online.modal.Order;
import com.toko.online.toko.online.response.ResponHelper;
import com.toko.online.toko.online.servis.BarangService;
import com.toko.online.toko.online.servis.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ModelMapper modelMapper;
    @GetMapping("/all")
    public Object getAllOrder(){
        return ResponHelper.ok( orderService.getAllOrder()) ;

    }
    @GetMapping("/{id}")
    public Object getOrder(@PathVariable("id") Long id) {

        return ResponHelper.ok( orderService.gerOrder(id));
    }
    @PostMapping
    public Object addOrder(@RequestBody OrderDTO orderDTO) {
        return ResponHelper.ok(orderService.addOrder(modelMapper.map(orderDTO,Order.class)));
    }
    @PutMapping("/{id}")
    public Object editOrderById(@PathVariable("id") Long id, @RequestBody Order order) {
        return ResponHelper.ok( orderService.editOrder(id, order.getNameBarang(), order.getHarga()));
    }
    @DeleteMapping("/{id}")
    public void deleteOrderById(@PathVariable("id") Long id) { orderService.deleteOrderById(id);}

}
