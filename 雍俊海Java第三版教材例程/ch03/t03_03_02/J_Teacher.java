// ////////////////////////////////////////////////////////
//
// J_Teacher.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ְ�����ʦ֮��Ķ�̬��̬�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

class J_Employee {
    public int m_workYear; // ����������

    public J_Employee() {
        m_workYear = 1;
    } // J_Employee���췽������

    public void mb_printInfo() {
        System.out.println("��ְ���Ĺ�������Ϊ" + m_workYear);
    } // ����mb_printInfo����
} // ��J_Employee����

public class J_Teacher extends J_Employee {
    public int m_classHour; // �ڿεĿ�ʱ

    public J_Teacher() {
        m_classHour = 96;
    } // J_Teacher���췽������

    public void mb_printInfo() {
        System.out.println("�ý�ʦ�Ĺ�������Ϊ" + m_workYear);
        System.out.println("�ý�ʦ�ڿεĿ�ʱΪ" + m_classHour);
    } // ����mb_printInfo����

    public static void main(String args[]) {
        J_Employee a = new J_Employee();
        a.mb_printInfo();
        a = new J_Teacher();
        a.mb_printInfo(); //���ø���ķ���
    } // ����main����
} // ��J_Teacher����


//t03_04