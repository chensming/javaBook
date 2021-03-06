// ////////////////////////////////////////////////////////
// 
// J_Student.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     学生例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.Serializable;

public class J_Student implements Serializable
{
    static final long serialVersionUID = 123456L;
    String m_name;
    int m_id;
    int m_height;

    public J_Student( String name, int id, int h )
    {
        m_name = name;
        m_id = id;
        m_height = h;
    } // J_Student构造方法结束

    public void mb_output( )
    {
        System.out.println("姓名: " + m_name);
        System.out.println("学号: " + m_id);
        System.out.println("身高: " + m_height);
    } // 方法mb_output结束
} // 类J_Student结束



//t07_04_02