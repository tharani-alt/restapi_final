package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.YogaClass;
import com.example.demo.Repository.YogaClassRepository;

@Service
public class YogaClassService {
    @Autowired
    private YogaClassRepository yogaClassRepository;

    public YogaClass createYogaClass(YogaClass yogaClass) {
        return yogaClassRepository.save(yogaClass);
    }

    public YogaClass getYogaClassById(Long id) {
        return yogaClassRepository.findById(id).orElse(null);
    }

    public List<YogaClass> getAllYogaClasses() {
        return yogaClassRepository.findAll();
    }

    public YogaClass updateYogaClass(Long id, YogaClass updatedYogaClass) {
        if (yogaClassRepository.existsById(id)) {
            updatedYogaClass.setId(id);
            return yogaClassRepository.save(updatedYogaClass);
        }
        return null;
    }

    public boolean deleteYogaClass(Long id) {
        if (yogaClassRepository.existsById(id)) {
            yogaClassRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
