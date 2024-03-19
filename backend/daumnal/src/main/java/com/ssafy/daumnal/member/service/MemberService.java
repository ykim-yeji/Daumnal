package com.ssafy.daumnal.member.service;

import com.ssafy.daumnal.member.dto.MemberDTO.GetMemberLoginResponse;
import com.ssafy.daumnal.member.dto.MemberDTO.GetMemberNicknameResponse;

public interface MemberService {
    GetMemberNicknameResponse modifyMemberNickname(String memberId, String nickname);
    GetMemberLoginResponse login(String socialId, String socialProvider);
}