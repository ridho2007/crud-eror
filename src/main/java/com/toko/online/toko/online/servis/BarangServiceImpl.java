package com.toko.online.toko.online.servis;


import com.toko.online.toko.online.exception.InternalErrorException;
import com.toko.online.toko.online.exception.NotFoundException;
import com.toko.online.toko.online.modal.Barang;
import com.toko.online.toko.online.repository.BarangRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarangServiceImpl implements BarangService {
    @Autowired
    BarangRepository barangRepository;

    @Override
    public Object getAllBarang() {
        try {
            return barangRepository.findAll();
        } catch (Exception e) {
            System.out.println("kamu nanya eror nya dimana");
            return "Kesalahan memunculkan data";
        }
    }


    @Override
    public Barang addBarang(Barang barang) {
        return barangRepository.save(barang);

    }

    @Override
    public Object getBarang(Long No) {
        var barang = barangRepository.findById(No).orElseThrow(() -> new NotFoundException("Id Tidak Ditemukan"));
        try {
            barang.setPrice(barang.getPrice()+ 0);
            barang.setReting(barang.getReting()+ 0);
            return barangRepository.save(barang);
        } catch (Exception e) {
            throw  new InternalErrorException("Kesalahan Munculkan Data");
        }
    }

    @Override
    public Barang editBarang(Long id, String name, Float price, Integer count, Integer reting, String deskripsi,Boolean publish) {
        Barang barang = barangRepository.findById(id).get();
        barang.setName(name);
        barang.setPrice(price);
        barang.setCount(count);
        barang.setReting(reting);
        barang.setDeskripsi(deskripsi);
        barang.setPublish(publish);

        return barangRepository.save(barang);
    }

    @Override
    public void deleteBarangById(Long No) {
        barangRepository.deleteById(No);
    }

}

