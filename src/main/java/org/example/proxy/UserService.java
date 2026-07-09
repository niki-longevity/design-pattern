package org.example.proxy;

// 抽象主题：用户服务接口
public interface UserService {
    // 根据 ID 查询用户
    String getUserById(Integer id);
}
