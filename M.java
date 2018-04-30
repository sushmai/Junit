
public class M 
{
	private E current; 
    private S0 s0 = new S0(this);
    private S1 s1 = new S1(this);
    private S2 s2 = new S2(this);
    private S3 s3 = new S3(this);
    private D2 d2 = new D2(s1);
    private D1 d1 = new D1(d2);   
    public M() {current =s0;}    
    public String getCurrentState() {return current.d();}
    public void do_e1(){current.e1();}
    public void do_e2(){current.e2();}
    public void do_e3(){current.e3();}
    
    
    void set_s0(){current=s0;}
    void set_s1(){current=d1;}
    void set_s2(){current=s2;}
    void set_s3(){current=s3;}

}

public class MTest
{
	private M m1;
	
	public MTest()
	{
	}
	
	
	public void setUp()
	{
		m1= new M();
	}
	

	public void tearDown()
	{
		m1 = null;
	}
	
	

	public void test1()
	{
		m1.do_e1();
		assertEquals("S1", m1.getCurrentState() );
	}
	
	public void test2()
	{
		m1.do_e2();
		assertEquals("S2", m1.getCurrentState());
	}
	
	public void test3()
	{
		m1.do_e3();
		assertEquals("S1", m1.getCurrentState());
	}
	public void test4()
	{
		m1.do_e2();
		m1.do_e1();
		assertEquals("S0", m1.getCurrentState());
	}
	
	public void test5()
	{
		m1.do_e2();
		m1.do_e2();
		assertEquals("S1", m1.getCurrentState() );
	}
	public void test6()
	{
		m1.do_e2();
		m1.do_e2();
		m1.do_e2();
		assertEquals("S2", m1.getCurrentState() );
	}
	
	public void test7()
	{
		m1.do_e2();
		m1.do_e2();
		m1.do_e2();
		m1.do_e3();
		assertEquals("S2", m1.getCurrentState() );

	}
	public void test8()
	{
		m1.do_e2();
		m1.do_e2();
		m1.do_e2();
		m1.do_e3();
		m1.do_e2();
		assertEquals("S3", m1.getCurrentState());
	}
	
	public void test9()
	{
		m1.do_e2();
		m1.do_e2();
		m1.do_e2();
		m1.do_e3();
		m1.do_e2();
		m1.do_e2();
		assertEquals("S1", m1.getCurrentState());
	}
	
	public void test10()
	{
		m1.do_e3();
		m1.do_e3();
		m1.do_e3();
		m1.do_e2();
		m1.do_e2();
		assertEquals("S2", m1.getCurrentState());
	}
	
}


