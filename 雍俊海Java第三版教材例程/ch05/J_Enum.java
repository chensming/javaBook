// ////////////////////////////////////////////////////////
// 
// J_Enum.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ö�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

enum E_SEASON
{
    ����, �ļ�, �＾, ���� 
} // ö��E_SEASON����

public class J_Enum
{
    public static void main(String args[ ])
    {
        E_SEASON [ ] sa = E_SEASON.values( );
        for ( int i=0; i< sa.length; i++ )
        {
            switch(sa[i])
            {
            case ����:
                System.out.println("����������");
                break;
            case �ļ�:
                System.out.println("�ļ����ޱ�");
                break;
            case �＾:
                System.out.println("�＾������");
                break;
            case ����:
                System.out.println("����ѩ����");
                break;                
            } // switch�ṹ����
        } // forѭ������
    } // ����main����
} // ��J_Enum����
