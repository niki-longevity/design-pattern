package org.example.chain.chain;

import org.example.chain.Approver;
import org.example.chain.LeaveRequest;

// 组长：审批 3 天以内的请假
public class GroupLeader extends Approver {
    public GroupLeader(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.days() <= 3){
            System.out.printf("[%s] 审批通过：%s 请假 %d 天（%s）%n",
                    name, request.name(), request.days(), request.reason());
        } else if(nextApprover != null){
            // 超出权限，转发给下一个审批者
            nextApprover.handleRequest(request);
        } else {
            System.out.printf("审批终止：%s 的请假申请无人可处理，已驳回%n", request.name());
        }
    }
}
