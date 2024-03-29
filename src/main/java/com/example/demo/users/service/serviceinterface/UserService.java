package com.example.demo.users.service.serviceinterface;

import com.example.demo.users.dto.UserDto;
import com.example.demo.vo.request.user.RequestLogin;
import com.example.demo.vo.request.user.RequestUser;

import java.util.Map;

public interface UserService {
    Long createUser(RequestUser request);
    Map<String, Object> login(RequestLogin requestLogin);
    UserDto getUser(Long userId);
    void updateUser(Long userId, RequestUser request);
    void deleteUser(Long userId);
    boolean isNicknameExists(String nickname);
    boolean isEmailExists(String email);
}
