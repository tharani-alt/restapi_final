package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.YogaClass;
import com.example.demo.Service.YogaClassService;

@RestController
@RequestMapping("/api/yoga-classes")
public class YogaClassController {

    @Autowired
    private YogaClassService yogaClassService;

    @PostMapping
    public YogaClass createYogaClass(@RequestBody YogaClass yogaClass) {
        return yogaClassService.createYogaClass(yogaClass);
    }

    @GetMapping("/{id}")
    public YogaClass getYogaClass(@PathVariable Long id) {
        return yogaClassService.getYogaClassById(id);
    }

    @GetMapping
    public List<YogaClass> getAllYogaClasses() {
        return yogaClassService.getAllYogaClasses();
    }

    @PutMapping("/{id}")
    public YogaClass updateYogaClass(@PathVariable Long id, @RequestBody YogaClass yogaClass) {
        return yogaClassService.updateYogaClass(id, yogaClass);
    }

    @DeleteMapping("/{id}")
    public boolean deleteYogaClass(@PathVariable Long id) {
        return yogaClassService.deleteYogaClass(id);
    }   
}
