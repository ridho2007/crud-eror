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
            throw new InternalErrorException("pemilik sudah ada");
        }
        return orderRepository.save(order);

    }

    @Override
    public Object  gerOrder(Long id) {

        var order = orderRepository.findById(id).orElseThrow(() -> new NotFoundException("Id Tidak Ditemukan"));
        try {
            order.setHarga(order.getHarga()+ 0);

            return orderRepository.save(order);
        } catch (Exception e) {
            throw  new InternalErrorException("Kesalahan Munculkan Data");
        }
    }

    @Override
    public Order editOrder(Long id, String nameBarang, String harga) {
        Order order = orderRepository.findById(id).get();

        order.setNameBarang(nameBarang);
        order.setHarga(harga);
        return orderRepository.save(order);

    }

    @Override
    public void deleteOrderById(Long id) {

    }
}
