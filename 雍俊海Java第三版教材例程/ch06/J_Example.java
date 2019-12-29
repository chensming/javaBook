// ////////////////////////////////////////////////////////
// 
// J_Example.java
// 与J_Singleton.java一起运行
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     使用类J_Singleton的实例对象的例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

public class J_Example
{
    public static void main(String args[ ])
    {
        J_Singleton a = J_Singleton.mb_getObject( );
        J_Singleton b = J_Singleton.mb_getObject( );
        if (a==b)
            System.out.println("a和b指向同一个实例对象。");
        else
            System.out.println("a和b指向不同的实例对象。");
    } // 方法main结束
} // 类J_Example结束


//t06_03_01