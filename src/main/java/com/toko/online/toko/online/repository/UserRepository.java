package com.toko.online.toko.online.repository;

import com.toko.online.toko.online.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

@Query(value = "select * from user where email = :email",nativeQuery = true)
    Optional <User>findByEmial(String email);
}