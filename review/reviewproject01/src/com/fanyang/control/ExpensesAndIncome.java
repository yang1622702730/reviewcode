package com.fanyang.control;

import com.fanyang.model.FamilyAccount;
import org.junit.Test;

import java.util.Scanner;

/**
 * @program: reviewproject01
 * @description:控制家庭余额
 * @author: FanYang
 * @create: 2021-07-21 19:23
 */
public class ExpensesAndIncome extends FamilyAccount{
    Scanner scanner = new Scanner(System.in);
    /**
     * @Description: 把收入添加至余额中
     * @Param: [money]
     * @return: int
     * @author: FanYang
     * @time: 2021/7/21 19:29
    */
    public int income(int money){
        System.out.println("请输入收入说明");
        notes = scanner.next();
        balance +=money;
        details +="收入\t"+getBalance()+"\t"+money+"\t\t"+notes+"\n";
        return balance;
    }
    /**
     * @Description: 从余额中扣除支出的金额
     * @Param: [money]
     * @return: int
     * @author: FanYang
     * @time: 2021/7/21 19:30
    */
    public int expenses(int money){
        System.out.println("请输入支出说明");
        notes = scanner.next();
        balance -=money;
        details +="支出\t"+getBalance()+"\t"+money+"\t\t"+notes+"\n";
        return balance;
    }
    
    /**
     * @Description: 打印收支的信息
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/21 20:16
    */ 
    public void showBill(){
        System.out.println(details);
    }
   /* @Test
    public void Test(){
        income(2000);
        expenses(1000);
        showBill();
    }*/

    public static void main(String[] args) {
        ExpensesAndIncome expensesAndIncome = new ExpensesAndIncome();
        expensesAndIncome.income(2000);
        expensesAndIncome.expenses(1000);
        expensesAndIncome.showBill();
    }
}
