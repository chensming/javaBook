// ////////////////////////////////////////////////////////
// 
// J_Fibonacci.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���õݹ����Fibonacci(30)�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
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
    } // ����mb_fibonacci����

    public static void main(String args[ ])
    {
        int n = 30;
        System.out.println("Fibonacci(" + n + ")=" + mb_fibonacci(n));
    } // ����main����
} // ��J_Fibonacci����


//{J_Example.java J_Singleton.java}