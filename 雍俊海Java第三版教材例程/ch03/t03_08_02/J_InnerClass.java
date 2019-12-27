// ////////////////////////////////////////////////////////
// 
// J_InnerClass.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ������Ϊ��Ķ������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


abstract class J_Class {
    int m_data;

    public J_Class(int i) {
        m_data = i;
    } // J_Class���췽������

    public abstract void mb_method();
} // ��J_Class����

class J_Anonymity extends J_Class {
    public J_Anonymity(int i) {
        super(i);
    } // J_Anonymity���췽������

    public void mb_method() {
        System.out.println("m_data=" + m_data);
    } // ����mb_method����
} // ��J_Anonymity����

public class J_InnerClass {
    public static void main(String args[]) {
        J_Class b = new J_Anonymity(5);
        b.mb_method();
    } // ����main����
} // ��J_InnerClass����


//J_Scope.java