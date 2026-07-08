package org.example.chain;

// 抽象审批处理者
public abstract class Approver {
    // 下一个审批人
    protected Approver nextApprover;

    // 审批人姓名
    protected final String name;

    public Approver(String name) {
        this.name = name;
    }

    // 设置下一级审批人
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    // 抽象审批方法，由子类实现
    public abstract void handleRequest(LeaveRequest request);
}
