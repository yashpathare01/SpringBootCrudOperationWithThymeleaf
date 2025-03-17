package com.brightLink.thymeleafCrudOnBikeDB.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brightLink.thymeleafCrudOnBikeDB.entity.Bike;
@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

}
