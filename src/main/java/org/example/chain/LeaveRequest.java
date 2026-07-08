package org.example.chain;

/**
 * @param name   申请人
 * @param days   请假天数
 * @param reason 请假理由
 */ // 请假申请（请求封装类，封装请假请求的业务参数，与处理逻辑解耦。）
public record LeaveRequest(String name, int days, String reason) {
}
