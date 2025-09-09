package com.delonic.productservice.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.delonic.productservice.model.Produk;
import com.delonic.productservice.repository.ProdukRepository;

@Service
public class ProdukService {

    @Autowired
    private ProdukRepository ProdukRepository;

    public List<Produk> getAllProduk() {
        return ProdukRepository.findAll();
    }

    public Produk getProdukById(Long id) {
        return ProdukRepository.findById(id).orElse(null);
    }

    public Produk createProduk(Produk produk) {
        return ProdukRepository.save(produk);
    }

    public void deleteProduk(Long id) {
       ProdukRepository.deleteById(id);
    }
}