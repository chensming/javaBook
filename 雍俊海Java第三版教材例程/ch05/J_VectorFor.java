// ////////////////////////////////////////////////////////
// 
// J_VectorFor.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��һ��for���ļ�д�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.util.Iterator;
import java.util.Vector;

public class J_VectorFor
{
    public static void main(String args[ ])
    {
        Vector<String> a = new Vector<String>( );
        a.add( "a" );
        a.add( "b" );
        a.add( "c" );

        for ( String c : a)
            System.out.print(c + ", ");
        System.out.println( );

        for ( Iterator<String> i=a.iterator( ); i.hasNext( ); )
        {
            String c = i.next( );
            System.out.print(c + ", ");
        } // forѭ������
        System.out.println( );
    } // ����main����
} // ��J_VectorFor����

//J_EnumFor.java