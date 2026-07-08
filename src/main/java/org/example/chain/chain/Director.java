package org.example.chain.chain;

import org.example.chain.Approver;
import org.example.chain.LeaveRequest;

// 总监：审批 15 天以内的请假
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.days() <= 15){
            System.out.printf("[%s] 审批通过：%s 请假 %d 天（%s）%n",
                    name, request.name(), request.days(), request.reason());
        } else{
            System.out.printf("[%s] 驳回：%s 请假 %d 天，超出最大审批权限%n",
                    name, request.name(), request.days());
        }
    }
}
