// ////////////////////////////////////////////////////////
// 
// J_EnumFor.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     for语句的简化写法在枚举类型数组中的应用例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

enum E_SEASON
{
    春季, 夏季, 秋季, 冬季 
} // 枚举E_SEASON结束

public class J_EnumFor
{
    public static void main(String args[ ])
    {
        for ( E_SEASON c : E_SEASON.values( ))
            System.out.print(c + ", ");
        System.out.println( );

        E_SEASON [ ] ca = E_SEASON.values( );
        for ( int i=0; i< ca.length; i++ )
        {
            E_SEASON c = ca[i];
            System.out.print(c + ", ");
        } // for循环结束
        System.out.println( );
    } // 方法main结束
} // 类J_EnumFor结束


//J_Example.java