package com.fanyang.team.service;

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
        for (int i = 0;i<total;i++){
            team[i] = new_team[i];
        }
        return new_team;
    }
    public void addMember(Employee employee) throws TeamException{
        if (total>=MAX_MEMBER){
            throw new TeamException("成员已经满了");
        }
        if (!(employee instanceof Programmer)) {
            throw new TeamException("这个人不是开发人员，不能加入团队");
        }
        Programmer programmer = (Programmer)employee;
        if (programmer.getStatus().getNAME().equals("BUSY")){
            throw new TeamException("该成员已经是其它团队的成员");
        }
        if (programmer.getStatus().getNAME().equals("VOCATION")){
            throw new TeamException("该员工正在休假中，暂时无法加入团队")
        }
        counter ++;
        total ++;
    }
    public void removeMember(int numberId) throws TeamException{

    }
}
