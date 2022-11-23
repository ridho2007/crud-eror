package com.toko.online.toko.online.repository;

import com.toko.online.toko.online.modal.Order;
import com.toko.online.toko.online.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    @Query(value = "select * from orders where pemilik = :pemilik",nativeQuery = true)
    Optional<Order> findBypemilik(String pemilik);

}
