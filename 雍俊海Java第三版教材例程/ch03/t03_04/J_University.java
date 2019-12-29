// ////////////////////////////////////////////////////////
// 
// J_University.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     包例程--主程序部分。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import cn.edu.tsinghua.universityOrganization.J_Employee;
import cn.edu.tsinghua.universityOrganization.J_Teacher;

public class J_University {
    public static void main(String args[]) {
        J_Employee a = new J_Employee();
        a.mb_printInfo();
        a = new J_Teacher();
        a.mb_printInfo();
    } // 方法main结束
} // 类J_University结束

//J_Book.java