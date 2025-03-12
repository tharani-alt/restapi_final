package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.YogaClass;
import com.example.demo.Service.YogaClassService;

import java.util.List;

@RestController
@RequestMapping("/api/yoga-classes")
public class YogaClassController {
    @Autowired
    private YogaClassService yogaClassService;

    @PostMapping
    public YogaClass createYogaClass(@RequestBody YogaClass yogaClass) {
        return yogaClassService.createYogaClass(yogaClass);
    }

    @GetMapping
    public List<YogaClass> getAllYogaClasses() {
        return yogaClassService.getAllYogaClasses();
    }

    @GetMapping("/{id}")
    public YogaClass getYogaClassById(@PathVariable Long id) {
        return yogaClassService.getYogaClassById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public YogaClass updateYogaClass(@PathVariable Long id, @RequestBody YogaClass yogaClass) {
        return yogaClassService.updateYogaClass(id, yogaClass);
    }

    @DeleteMapping("/{id}")
    public void deleteYogaClass(@PathVariable Long id) {
        yogaClassService.deleteYogaClass(id);
    }
}
