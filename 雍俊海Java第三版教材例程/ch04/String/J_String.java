// ////////////////////////////////////////////////////////
// 
// J_String.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����Ϊ�ַ����ķ����������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.

public class J_String {
    public static void mb_operate(String x, String y) {
        x.concat(y);
        y = x;
    } // ����mb_operate����

    public static void main(String args[]) {
        String a = "A";
        String b = "B";
        mb_operate(a, b);
        System.out.println(a + "." + b);
    } // ����main����
} // ��J_String����
