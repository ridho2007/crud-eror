package com.toko.online.toko.online.servis;

import com.toko.online.toko.online.modal.Order;

public interface OrderService {
    Object getAllOrder();

    Order addOrder(Order order);

    Object gerOrder(Long id);


    Order editOrder(Long id, String nameBarang, Integer harga, String pemilik );

    void  deleteOrderById(Long id);
}
