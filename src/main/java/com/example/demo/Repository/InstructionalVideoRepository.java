package com.example.demo.Repository;

import com.example.demo.Entity.InstructionalVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructionalVideoRepository extends JpaRepository<InstructionalVideo, Long> {
    void deleteByYogaClassId(Long yogaClassId);

}
