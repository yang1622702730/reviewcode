package com.fanyang.team.service;

import com.fanyang.team.domain.Architect;
import com.fanyang.team.domain.Designer;
import com.fanyang.team.domain.Employee;
import com.fanyang.team.domain.Programmer;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:17
 */
public class TeamService {
    private int counter = 1;////用来为开发团队新增成员自动生成团队中的唯一ID，即memberId。（提示：应使用增1的方式）
    private final int MAX_MEMBER = 5;//表示开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];//用来保存当前团队中的各成员对象
    private int total = 0; //记录团队成员的实际人数

    public Programmer[] getTeam() {
        Programmer[] new_team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            new_team[i] = team[i];
        }
        return new_team;
    }

    /**
     * @Description: 向团队中添加成员
     * @Prame: [employee]
     * @return: void
     * @author: FanYang
     * @time:  
     */ 
    public void addMember(Employee employee) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已经满了");
        }
        if (!(employee instanceof Programmer)) {
            throw new TeamException("这个人不是开发人员，不能加入团队");
        }
        Programmer programmer = (Programmer) employee;
        if (programmer.getStatus().getNAME().equals("BUSY")) {
            throw new TeamException("该成员已经是其它团队的成员");
        }
        if (programmer.getStatus().getNAME().equals("VOCATION")) {
            throw new TeamException("该员工正在休假中，暂时无法加入团队");
        }
        if (isExist(programmer)) {
            throw new TeamException("该员工已经在这个团队中了");

        }
        int numberOfArch = 0;
        int numberOfDesi = 0;
        int numberOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numberOfArch++;
            } else if (team[i] instanceof Designer) {
                numberOfDesi++;
            } else if (team[i] instanceof Programmer) {
                numberOfPro++;
            }
        }
        if (programmer instanceof Architect) {
            if (numberOfArch > 1) {
                throw new TeamException("只能有一个架构师");
            }
        }
        if (programmer instanceof Designer) {
            if (numberOfDesi > 2) {
                throw new TeamException("只能有两个设计师");
            }
        }
        if (programmer instanceof Programmer) {
            if (numberOfPro > 3) {
                throw new TeamException("只能有三个程序员");
            }
        }
        programmer.setStatus(Status.BUSY);
        programmer.setMemberId(counter++);
        team[total++] = programmer;
    }
    
    /**
     * @Description: 从团队中删除成员
     * @Prame: [numberId]
     * @return: void
     * @author: FanYang
     * @time:  
     */ 
    public void removeMember(int numberId) throws TeamException {
        int n;
        for(n=0;n<total;n++){
            if (team[n].getMemberId() == numberId){
                team[n].setStatus(Status.FREE);
                break;
            }
        }
        if (n>=total){
            throw new TeamException("没有这个成员");
        }
        for (int i = n;i<total-1;i++){
            team[i] = team[i+1];
        }
        team[--total] =null;
    }

    public boolean isExist(Programmer programmer) {
        for (int i = 0; i < total-1; i++) {
            if (programmer.getId() == team[i].getId()) {
                return true;
            }
        }
        return false;
    }
}
