// ////////////////////////////////////////////////////////
// 
// J_EnumFor.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     for���ļ�д����ö�����������е�Ӧ�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

enum E_SEASON
{
    ����, �ļ�, �＾, ���� 
} // ö��E_SEASON����

public class J_EnumFor
{
    public static void main(String args[ ])
    {
        for ( E_SEASON c : E_SEASON.values( ))
            System.out.print(c + ", ");
        System.out.println( );

        E_SEASON [ ] ca = E_SEASON.values( );
        for ( int i=0; i< ca.length; i++ )
        {
            E_SEASON c = ca[i];
            System.out.print(c + ", ");
        } // forѭ������
        System.out.println( );
    } // ����main����
} // ��J_EnumFor����


//J_Example.java