package com.ssafy.daumnal.music.repository;

import com.ssafy.daumnal.music.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {

    boolean existsByYoutubeId(String youtubeId);
}