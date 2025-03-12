package com.example.demo.Service;

import com.example.demo.Entity.InstructionalVideo;
import com.example.demo.Repository.InstructionalVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructionalVideoService {

    @Autowired
    private InstructionalVideoRepository instructionalVideoRepository;

    public InstructionalVideo createVideo(InstructionalVideo video) {
        return instructionalVideoRepository.save(video);
    }

    public List<InstructionalVideo> getAllVideos() {
        return instructionalVideoRepository.findAll();
    }

    public Optional<InstructionalVideo> getVideoById(Long id) {
        return instructionalVideoRepository.findById(id);
    }

    public InstructionalVideo updateVideo(Long id, InstructionalVideo videoDetails) {
        InstructionalVideo existingVideo = instructionalVideoRepository.findById(id).orElseThrow();
        existingVideo.setSessionTiming(videoDetails.getSessionTiming());
        existingVideo.setInstructorName(videoDetails.getInstructorName());
        existingVideo.setVideoLink(videoDetails.getVideoLink());
        return instructionalVideoRepository.save(existingVideo);
    }

    public void deleteVideo(Long id) {
        instructionalVideoRepository.deleteById(id);
    }
}
