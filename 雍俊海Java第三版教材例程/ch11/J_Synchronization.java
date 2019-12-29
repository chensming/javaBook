// ////////////////////////////////////////////////////////
// 
// J_Synchronization.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��ʵ�����н������ݸ�������������̣�����˵�����̲߳������⡣
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

class J_Experiment // ʵ��
{
    private int m_temperature, m_pressure; // �¶�����ѹ
    
    public void mb_update(int t, int p) // ���ݸ���
    {
        m_temperature = t;
        m_pressure    = p;
    } // ����mb_update����
    
    public void mb_analyze( ) // ���ݷ���
    {
        int t= m_temperature;
        int p= m_pressure;
        for (int i=0; i<1000; i++) // ������ʱ��ʹ�ò�����������׳���
            ;
        if (t!=m_temperature) // �����¶�����
        {
            System.out.print("ʵ�����ݳ������: ");
            System.out.println("t(" + t + ") != (" + m_temperature + ")");
            System.exit(0);
        } // if�ṹ����
        if (p!= m_pressure) // ������ѹ����
        {
            System.out.print("ʵ�����ݳ������: ");
            System.out.println("p(" + p + ") != (" + m_pressure + ")");
            System.exit(0);
        } // if�ṹ����
    } // ����mb_analyze����
} // ��J_Experiment����

class J_Assistant extends Thread // ʵ���ҵ�������Ա
{
    J_Experiment m_data;
    
    public J_Assistant(J_Experiment d)
    {
        m_data= d;
    } // ���췽��J_Assistant����

    public void run( )
    {
        int i, j;
        for(; true; )
        {
            i= (int)(Math.random( ) * 1000);
            j= (int)(Math.random( ) * 1000);
            m_data.mb_update(i, j);
        } // forѭ������
    } // ����run����
} // ��J_Assistant����

class J_Analyst extends Thread // ʵ���ҵķ�����Ա
{
    J_Experiment m_data;
    
    public J_Analyst(J_Experiment d)
    {
        m_data= d;
    } // ���췽��J_Analyst����
    
    public void run( )
    {
        for(; true; )
            m_data.mb_analyze( );
    } // ����run����
} // ��J_Analyst����

public class J_Synchronization
{
    public static void main( String args[ ] )
    { 
        J_Experiment data= new J_Experiment( );
        J_Assistant threadA = new J_Assistant(data);
        J_Analyst   threadB = new J_Analyst(data);
        threadA.start( );
        threadB.start( );
    } // ����main����
} // ��J_Synchronization����



//J_ThreadSum.java