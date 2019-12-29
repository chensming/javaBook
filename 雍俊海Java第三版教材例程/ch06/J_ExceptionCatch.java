// ////////////////////////////////////////////////////////
// 
// J_ExceptionCatch.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     异常捕捉例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


public class J_ExceptionCatch
{
    public static void main(String args[ ])
    {
        try
        {
            System.out.println("try语句块");
            throw new Exception( );
        }
        catch(Exception e)
        {
            System.err.println("catch语句块");
            e.printStackTrace( );
        }
        finally
        {
            System.out.println("finally语句块");
        } // try-catch-finally结构结束
    } // 方法main结束
} // 类J_ExceptionCatch结束

//J_Exception.java