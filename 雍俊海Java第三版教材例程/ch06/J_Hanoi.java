// ////////////////////////////////////////////////////////
// 
// J_Hanoi.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���õݹ���⺺ŵ��(Tower of Hanoi)��������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_Hanoi
{
    public static void mb_hanoi(int n, char start, char temp, char end)
    {
        if (n<=1)
            System.out.println("���̴�" + start + "�Ƶ�" + end);
        else
        {
            mb_hanoi(n-1, start, end, temp);
            System.out.println("���̴�" + start + "�Ƶ�" + end);
            mb_hanoi(n-1, temp, start, end);
        } // if-else�ṹ����
    } // ����mb_hanoi����

    public static void main(String args[ ])
    {
        mb_hanoi(3, 'S', 'T', 'E');
    } // ����main����
} // ��J_Hanoi����

//J_Fibonacci.java