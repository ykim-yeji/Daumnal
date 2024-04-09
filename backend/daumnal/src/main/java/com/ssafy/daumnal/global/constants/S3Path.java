package com.ssafy.daumnal.global.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum S3Path {

    //서버별 경로
    PRODUCTION_SERVER("운영 서버 경로"),
    //기능별 경로
    PLAYLIST_COVER_PATH("플레이리스트 커버 경로"),
    DIARY_PHOTO_PATH("일기 사진 경로"),
    MUSIC_COVER_PATH("노래 커버 경로");

    private final String name;
}