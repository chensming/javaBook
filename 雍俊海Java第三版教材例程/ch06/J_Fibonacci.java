// ////////////////////////////////////////////////////////
// 
// J_Fibonacci.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     利用递归计算Fibonacci(30)的例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

public class J_Fibonacci
{
    public static int mb_fibonacci(int n)
    {
        if (n< 1)
            return(0);
        else if (n==1 || n==2)
            return(1);
        return(mb_fibonacci(n-1)+mb_fibonacci(n-2));
    } // 方法mb_fibonacci结束

    public static void main(String args[ ])
    {
        int n = 30;
        System.out.println("Fibonacci(" + n + ")=" + mb_fibonacci(n));
    } // 方法main结束
} // 类J_Fibonacci结束


//{J_Example.java J_Singleton.java}