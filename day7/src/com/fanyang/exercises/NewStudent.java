package com.fanyang.exercises;

public class NewStudent {
    public int number = 20;
    public int state = 0;
    public int score = 0;

    /**
     * Description 随机生成学生成绩
     *
     * @return
     */
    public int creatRandom() {
        score = (int) (Math.random() * 100);
        return score;
    }

    /**
     * Description 随机生成学生所在年级
     *
     * @return
     */
    public int randomState() {
        state = (int) (Math.random() * 3 + 1);
        return state;
    }

    /**
     * Description 打印学生的信息
     *
     * @return
     */
    public String info() {
        return ("number " + number + ",score " + score + ",state " + state);
    }

    /**
     * Description 两个*一回车就可以出现了  寻找对应年级的学生
     *
     * @param student
     * @param state
     */
    public void searchState(NewStudent[] student, int state) {
        for (int i = 0; i < student.length; i++) {
            if (student[i].state == state) {
                System.out.println(student[i].info());
            }
        }
    }

    /**
     * Description 对学生的成绩冒泡排序
     *
     * @param student
     * @return
     */
    public NewStudent[] bubbleSort(NewStudent[] student) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - i - 1; j++) {
                if (student[j].score > student[j + 1].score) {
                    NewStudent temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        return student;
//        for (int i = 0; i < student.length - 1; i++) {
//            System.out.println(student[i].info());
//        }
    }
}
