package com.fanyang.team.service;

import com.fanyang.team.domain.*;
import sun.security.krb5.internal.crypto.Des;

import static com.fanyang.team.service.Data.*;

/**
 * @program: project03
 * @description:
 * @author: FanYang
 * @create: 2021-06-10 14:17
 */
public class NameListService {
    public static void main(String[] args) {
        NameListService nameListService = new NameListService();

    }
    private Employee[] employees;
    public NameListService(){
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0;i<employees.length;i++){
            String type = EMPLOYEES[i][0];
//            int type = Integer.parseInt(EMPLOYEES[i][0]);
            System.out.println(type);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case "10":  //普通员工
                    employees[i] = new Employee(id,name,age,salary);
//                    System.out.println(employees[i].toString());
//                    System.out.println("-----------------------");
                    break;
                case "11": //程序员
                    equipment =creatEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
//                    System.out.println(employees[i].toString());
//                    System.out.println("-----------------------");
                    break;
                case "12": //设计师
                    equipment=creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
//                    System.out.println(employees[i].toString());
//                    System.out.println("-----------------------");
                    break;
                case "13": //架构师
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    equipment=creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
//                    System.out.println(employees[i].toString());
//                    System.out.println("-----------------------");
                    break;
            }
        }
     }

     /**
      * @Description: 获取当前所有员工
      * @Prame: []
      * @return: com.fanyang.team.domain.Employee[]
      * @author: FanYang
      * @time:  
      */ 
    public Employee[] getAllEmployees(){
        return employees;
    }

    /**
     * @Description: 从Data中把每个人的设备实例化
     * //PC      :21, model, display
     * //NoteBook:22, model, price
     * //Printer :23, name, type
     * @Prame:
     * @return:
     * @author: FanYang
     * @time:
     */
    public Equipment creatEquipment(int index){
        int id = Integer.parseInt(EQUIPMENTS[index][0]);
        String model = null;
        switch(id){
            case 21:
                model = EQUIPMENTS[index][1];
                String display = EQUIPMENTS[index][2];
                return new PC(model,display);
            case 22:
                model = EQUIPMENTS[index][1];
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(model,price);
            case 23:
                String name = EQUIPMENTS[index][1];
                String type1 =EQUIPMENTS[index][2];
                return new Printer(name,type1);
        }
        return null;
    }
//    public Employee getEmployee(int id) throws TeamException{
//        return null;
//    }
public Employee getEmployee(int id) throws TeamException {
    for (Employee e : employees) {
        if (e.getId() == id)
            return e;
    }
    throw new TeamException("该员工不存在");
}

}
