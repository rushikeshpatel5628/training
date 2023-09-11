package thread_demo;

public class THreadSynch_Demo {
	
	    int i;
	 
	    synchronized void SharedMethod()
	    {
	        Thread t = Thread.currentThread();
	 
	        for(i = 0; i <= 10; i++)
	        {
	            System.out.println(t.getName()+" : "+i);
	        }
	    }
}
	

