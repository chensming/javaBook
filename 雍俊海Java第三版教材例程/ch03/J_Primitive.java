// ////////////////////////////////////////////////////////
//
// J_Primitive.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ������������ֵ�������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_Primitive {
    public static void mb_method(int a) {
        System.out.println("��a++֮ǰ��������a=" + a); //a = 0
        a++;
        System.out.println("��a++֮�󷽷�����a=" + a); //a = 1
    } // ����mb_method����

    public static void main(String args[]) {
        int i = 0;
        System.out.println("�ڷ�������֮ǰ����i=" + i); //i = 0
        mb_method(i);
        System.out.println("�ڷ�������֮�����i=" + i); //i = 0
    } // ����main����
} // ��J_Primitive����

//J_Reference.java