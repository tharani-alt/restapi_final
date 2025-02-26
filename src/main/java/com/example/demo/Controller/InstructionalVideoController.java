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

import com.example.demo.Entity.InstructionalVideo;
import com.example.demo.Service.InstructionalVideoService;

@RestController
@RequestMapping("/api/videos")
public class InstructionalVideoController {

    @Autowired
    private InstructionalVideoService instructionalVideoService;

    @PostMapping
    public InstructionalVideo createInstructionalVideo(@RequestBody InstructionalVideo video) {
        return instructionalVideoService.createInstructionalVideo(video);
    }

    @GetMapping("/{id}")
    public InstructionalVideo getInstructionalVideo(@PathVariable Long id) {
        return instructionalVideoService.getInstructionalVideoById(id);
    }

    @GetMapping
    public List<InstructionalVideo> getAllInstructionalVideos() {
        return instructionalVideoService.getAllInstructionalVideos();
    }

    @PutMapping("/{id}")
    public InstructionalVideo updateInstructionalVideo(@PathVariable Long id, @RequestBody InstructionalVideo video) {
        return instructionalVideoService.updateInstructionalVideo(id, video);
    }

    @DeleteMapping("/{id}")
    public boolean deleteInstructionalVideo(@PathVariable Long id) {
        return instructionalVideoService.deleteInstructionalVideo(id);
    }
}
