package com.zensar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Disease;

@Repository
public interface DiseasesRepo extends JpaRepository<Disease, String>{

}
