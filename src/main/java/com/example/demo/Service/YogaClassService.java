package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.YogaClass;
import com.example.demo.Repository.YogaClassRepository;

import java.util.List;
import java.util.Optional;

@Service
public class YogaClassService {
    @Autowired
    private YogaClassRepository yogaClassRepository;

    public YogaClass createYogaClass(YogaClass yogaClass) {
        return yogaClassRepository.save(yogaClass);
    }

    public List<YogaClass> getAllYogaClasses() {
        return yogaClassRepository.findAll();
    }

    public Optional<YogaClass> getYogaClassById(Long id) {
        return yogaClassRepository.findById(id);
    }

    public YogaClass updateYogaClass(Long id, YogaClass updatedYogaClass) {
        updatedYogaClass.setId(id);
        return yogaClassRepository.save(updatedYogaClass);
    }

    public void deleteYogaClass(Long id) {
        yogaClassRepository.deleteById(id);
    }
}
