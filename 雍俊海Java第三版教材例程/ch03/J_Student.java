// ////////////////////////////////////////////////////////
//
// J_Student.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��̬��̬�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_Student {
    public int m_id; // ѧ��
    public int m_age; // ����

    public J_Student() {
        mb_setData(2008010400, 19);
    } // J_Student���췽������

    public J_Student(int id, int age) {
        mb_setData(id, age);
    } // J_Student���췽������

    public void mb_setData(int id, int age) {
        m_id = id;
        m_age = age;
    } // ����mb_setData����

    public void mb_setData(int id) {
        m_id = id;
    } // ����mb_setData����

    public static void main(String args[]) {
        J_Student jack = new J_Student();
        jack.mb_setData(2008010408);
        J_Student lisa = new J_Student();
        lisa.mb_setData(2008010428, 18);
        System.out.print("Jack��ѧ����" + jack.m_id);
        System.out.println("��������" + jack.m_age);
        System.out.print("Lisa��ѧ����" + lisa.m_id);
        System.out.println("��������" + lisa.m_age);
    } // ����main����
} // ��J_Student����


//t03_03_02 J_Teacher.java