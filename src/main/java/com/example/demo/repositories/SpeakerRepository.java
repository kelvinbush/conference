package com.example.demo.repositories;

import com.example.demo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository  extends JpaRepository<Speaker, Long> {
}
