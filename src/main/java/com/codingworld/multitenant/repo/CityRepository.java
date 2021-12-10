package com.codingworld.multitenant.repo;

import com.codingworld.multitenant.bean.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {

    City findByName(String name);

    void deleteByName(String name);
}
