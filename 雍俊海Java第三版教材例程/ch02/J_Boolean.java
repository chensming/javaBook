// ////////////////////////////////////////////////////////
//
// J_Boolean.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���������·�������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


public class J_Boolean {
    public static void main(String args[]) {
        int month = 8; // �������month��������ֵ8
        int day = 1; // �������day��������ֵ1
        if ((month == 8) || (++day < 15))      //ûִ���ұ�++day
            System.out.println("Month=" + month + ", Day=" + day);
        if ((month == 8) | (++day < 15))      //��ִ���ұ�++day
            System.out.println("Month=" + month + ", Day=" + day);
    } // ����main����
} // ��J_Boolean����


//J_Swap.java
