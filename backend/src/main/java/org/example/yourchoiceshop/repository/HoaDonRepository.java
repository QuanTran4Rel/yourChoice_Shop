package org.example.yourchoiceshop.repository;

import org.example.yourchoiceshop.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {    
}
