// ////////////////////////////////////////////////////////
// 
// J_Employee.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     包例程--职工部分。
// ////////////////////////////////////////////////////////
// Copyright:
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
package cn.edu.tsinghua.universityOrganization;

public class J_Employee {
    public int m_workYear; // 工作的年限

    public J_Employee() {
        m_workYear = 1;
    } // J_Employee构造方法结束

    public void mb_printInfo() {
        System.out.println("该职工的工作年限为" + m_workYear);
    } // 方法mb_printInfo结束
} // 类J_Employee结束

//J_Book.java