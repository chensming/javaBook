// ////////////////////////////////////////////////////////
// 
// J_Teacher.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ������--��ʦ���֡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////


public class J_Teacher extends J_Employee {
    public int m_classHour; // �ڿεĿ�ʱ

    public J_Teacher() {
        m_classHour = 96;
    } // J_Teacher���췽������

    public void mb_printInfo() {
        System.out.println("�ý�ʦ�Ĺ�������Ϊ" + m_workYear);
        System.out.println("�ý�ʦ�ڿεĿ�ʱΪ" + m_classHour);
    } // ����mb_printInfo����
} // ��J_Teacher����


//J_Book.java