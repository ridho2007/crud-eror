package com.toko.online.toko.online.servis;

import com.toko.online.toko.online.modal.Barang;

public interface BarangService {
     Object getAllBarang();
    Barang addBarang(Barang barang);

    Object getBarang(Long No);
    Barang editBarang(Long id, String name, Float price,Integer count, Integer reting, String deskripsi,Boolean publish);

    void deleteBarangById(Long No);
}
