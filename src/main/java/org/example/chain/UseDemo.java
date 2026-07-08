package org.example.chain;

import org.example.chain.chain.DeptManager;
import org.example.chain.chain.Director;
import org.example.chain.chain.GroupLeader;

public class UseDemo {
    public static void main(String[] args){
        // 1.创建所有审批节点
        Approver groupLeader = new GroupLeader("张组长");
        Approver deptManager = new DeptManager("李经理");
        Approver director = new Director("王总监");

        // 2.组装责任链：组长 > 部门经理 > 总经理
        groupLeader.setNextApprover(deptManager);
        deptManager.setNextApprover(director);

        // 3.发起不同的请假申请
        System.out.println("========= 请假 2 天 =========");
        groupLeader.handleRequest(new LeaveRequest("小明", 2, "身体不适"));

        System.out.println("========= 请假 5 天 =========");
        groupLeader.handleRequest(new LeaveRequest("小红", 5, "病假"));

        System.out.println("========= 请假 10 天 =========");
        groupLeader.handleRequest(new LeaveRequest("小刚", 10, "婚假"));

        System.out.println("========= 请假 20 天 =========");
        groupLeader.handleRequest(new LeaveRequest("小丽", 20, "出国旅游"));
    }
}
