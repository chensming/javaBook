// ////////////////////////////////////////////////////////
//
// J_StringBuffer.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �ַ������������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_StringBuffer {
    public static void main(String args[]) {
        StringBuffer b = new StringBuffer("0123");
        System.out.println("�ַ������������ַ�����Ϊ\"" + b + "\"");
        System.out.println("�ַ����������ĳ�����" + b.length());
        System.out.println("�ַ�����������������" + b.capacity());

        b.ensureCapacity(25);
        System.out.println();
        System.out.println("�ڵ���\"b.ensureCapacity(25)\"֮��");
        System.out.println("�ַ������������ַ�����Ϊ\"" + b + "\"");
        System.out.println("�ַ����������ĳ�����" + b.length());
        System.out.println("�ַ�����������������" + b.capacity());
    } // ����main����
} // ��J_StringBuffer����


//J_Hashtable.java