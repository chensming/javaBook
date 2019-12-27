// ////////////////////////////////////////////////////////
// 
// J_Teacher.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     包例程--教师部分。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////


public class J_Teacher extends J_Employee {
    public int m_classHour; // 授课的课时

    public J_Teacher() {
        m_classHour = 96;
    } // J_Teacher构造方法结束

    public void mb_printInfo() {
        System.out.println("该教师的工作年限为" + m_workYear);
        System.out.println("该教师授课的课时为" + m_classHour);
    } // 方法mb_printInfo结束
} // 类J_Teacher结束


//J_Book.java