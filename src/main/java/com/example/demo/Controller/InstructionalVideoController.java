package com.example.demo.Controller;

import com.example.demo.Entity.InstructionalVideo;
import com.example.demo.Service.InstructionalVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructional-videos")
public class InstructionalVideoController {

    @Autowired
    private InstructionalVideoService instructionalVideoService;

    @PostMapping
    public InstructionalVideo createVideo(@RequestBody InstructionalVideo video) {
        return instructionalVideoService.createVideo(video);
    }

    @GetMapping
    public List<InstructionalVideo> getAllVideos() {
        return instructionalVideoService.getAllVideos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InstructionalVideo> getVideoById(@PathVariable Long id) {
        return instructionalVideoService.getVideoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public InstructionalVideo updateVideo(@PathVariable Long id, @RequestBody InstructionalVideo videoDetails) {
        return instructionalVideoService.updateVideo(id, videoDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVideo(@PathVariable Long id) {
        instructionalVideoService.deleteVideo(id);
        return ResponseEntity.noContent().build();
    }
}
