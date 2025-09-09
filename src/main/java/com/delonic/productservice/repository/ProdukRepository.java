package com.delonic.productservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.delonic.productservice.model.Produk;

@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
}