package com.ssafy.daumnal.diary.constants;

public interface DiaryConstants {
    int CONTENT_MAX_LENGTH = 3000;
    int CONTENT_MIN_LENGTH = 20;
    int HASH_TAG_MAX_LENGTH = 10;
    int HASH_TAG_MAX_COUNT = 3;
    String SPLIT_REGEX = " ";
    String HASH_TAG_REGEX = "^[ㄱ-ㅎㅏ-ㅣ가-힣A-Za-z0-9_]+$";
    String NUMBER_REGEX = "^[1-9]\\d*$";
}
