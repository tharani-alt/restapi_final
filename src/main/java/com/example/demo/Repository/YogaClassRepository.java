package com.example.demo.Repository;

import com.example.demo.Entity.YogaClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YogaClassRepository extends JpaRepository<YogaClass, Long> {
}
