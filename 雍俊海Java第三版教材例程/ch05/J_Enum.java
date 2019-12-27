// ////////////////////////////////////////////////////////
// 
// J_Enum.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     枚举例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

enum E_SEASON
{
    春季, 夏季, 秋季, 冬季 
} // 枚举E_SEASON结束

public class J_Enum
{
    public static void main(String args[ ])
    {
        E_SEASON [ ] sa = E_SEASON.values( );
        for ( int i=0; i< sa.length; i++ )
        {
            switch(sa[i])
            {
            case 春季:
                System.out.println("春季花满天");
                break;
            case 夏季:
                System.out.println("夏季热无边");
                break;
            case 秋季:
                System.out.println("秋季果累累");
                break;
            case 冬季:
                System.out.println("冬季雪皑皑");
                break;                
            } // switch结构结束
        } // for循环结束
    } // 方法main结束
} // 类J_Enum结束
