package com.toko.online.toko.online.servis;

import com.toko.online.toko.online.exception.InternalErrorException;
import com.toko.online.toko.online.exception.NotFoundException;
import com.toko.online.toko.online.modal.Order;

import com.toko.online.toko.online.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Object getAllOrder() {
        try {
            return orderRepository.findAll();
        } catch (Exception e) {
            System.out.println("kamu nanya eror nya dimana");
            return "Kesalahan memunculkan data";
        }
    }
    @Override
    public Order addOrder(Order order) {
        if(orderRepository.findBypemilik(order.getPemilik()).isPresent()){
            throw new InternalErrorException("Email sudah ada");
        }
        return orderRepository.save(order);

    }

    @Override
    public Object  gerOrder(Long id) {

        try {
            var order = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("id Tidak ditemukan"));

            return orderRepository.save(order);
        } catch (Exception b) {
            throw new InternalErrorException("ada yang terdapat null");
        }
    }

    @Override
    public Order editOrder(Long id, String nameBarang, Integer harga, String pemilik) {
        Order order = orderRepository.findById(id).get();
        order.setNameBarang(nameBarang);
        order.setHarga(harga);
        order.setPemilik(pemilik);

return  orderRepository.save(order);
    }

    @Override
    public void deleteOrderById(Long id) {

    }
}
