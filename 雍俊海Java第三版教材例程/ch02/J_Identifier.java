// ////////////////////////////////////////////////////////
//
// J_Identifier.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �ж�һ���ַ��Ƿ������Java��ʶ������ʼ�ַ������ַ������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.

public class J_Identifier {
    public static void main(String args[]) {
        char c = 'è';
        if (Character.isJavaIdentifierStart(c))
            System.out.println("�ַ�\'" + c + "\'��������ʶ�������ַ�");
        else
            System.out.println("�ַ�\'" + c + "\'����������ʶ�������ַ�");
        if (Character.isJavaIdentifierPart(c))
            System.out.println("�ַ�\'" + c
                    + "\'��������ʶ�������ַ��������ַ�");
        else
            System.out.println("�ַ�\'" + c
                    + "\'����������ʶ�������ַ��������ַ�");
    } // ����main����
} // ��J_Identifier����


//J_CastExample.java