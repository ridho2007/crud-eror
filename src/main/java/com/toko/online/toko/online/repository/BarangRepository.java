package com.toko.online.toko.online.repository;

import com.toko.online.toko.online.modal.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends JpaRepository<Barang,Long> {
}
