package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.InstructionalVideo;
import com.example.demo.Repository.InstructionalVideoRepository;

@Service
public class InstructionalVideoService {
    
    @Autowired
    private InstructionalVideoRepository instructionalVideoRepository;

    public void deleteByYogaClassId(Long yogaClassId) {
        // Logic to delete instructional videos by yoga class ID
        instructionalVideoRepository.deleteByYogaClassId(yogaClassId);
    }

    public InstructionalVideo createInstructionalVideo(InstructionalVideo video) {
        return instructionalVideoRepository.save(video);
    }

    public InstructionalVideo getInstructionalVideoById(Long id) {
        return instructionalVideoRepository.findById(id).orElse(null);
    }

    public List<InstructionalVideo> getAllInstructionalVideos() {
        return instructionalVideoRepository.findAll();
    }

    public InstructionalVideo updateInstructionalVideo(Long id, InstructionalVideo updatedVideo) {
        if (instructionalVideoRepository.existsById(id)) {
            updatedVideo.setId(id);
            return instructionalVideoRepository.save(updatedVideo);
        }
        return null;
    }

    public boolean deleteInstructionalVideo(Long id) {
        if (instructionalVideoRepository.existsById(id)) {
            instructionalVideoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
