package com.toko.online.toko.online.controller;

import com.toko.online.toko.online.modal.Barang;

import com.toko.online.toko.online.response.ResponHelper;
import com.toko.online.toko.online.servis.BarangService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Barang")
public class BarangController {
    @Autowired
    private BarangService barangService;

    @GetMapping("/all")
    public Object getAllBarang(){
        return ResponHelper.ok( barangService.getAllBarang()) ;

    }
    @GetMapping("/{No}")
    public Object getBarang(@PathVariable("No") Long No) {

        return ResponHelper.ok( barangService.getBarang(No));
    }
    @PostMapping
    public Object addBarang(@RequestBody Barang barang) {
        return ResponHelper.ok(barangService.addBarang(barang));
    }
    @PutMapping("/{No}")
    public Object editBarangById(@PathVariable("No") Long No, @RequestBody Barang barang) {
        return ResponHelper.ok( barangService.editBarang(No, barang.getName(), barang.getPrice(), barang.getCount(), barang.getReting(), barang.getDeskripsi(),barang.getPublish()));
    }
    @DeleteMapping("/{No}")
    public void deleteBarangById(@PathVariable("No") Long No) { barangService.deleteBarangById(No);}

}

