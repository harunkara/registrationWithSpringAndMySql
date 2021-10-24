package com.example.registration.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.registration.Model.people;

@Repository
public interface InformationRepository extends JpaRepository<people,Long>{

}