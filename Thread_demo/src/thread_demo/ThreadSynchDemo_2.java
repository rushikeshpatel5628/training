package thread_demo;

public class ThreadSynchDemo_2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  final THreadSynch_Demo s1 = new THreadSynch_Demo();
			  
		        Thread t1 = new Thread("Thread - 1")
		        {
		            @Override
		            public void run()
		            {
		                s1.SharedMethod();
		            }
		        };
		 
		        Thread t2 = new Thread("Thread - 2")
		        {
		            @Override
		            public void run()
		            {
		                s1.SharedMethod();
		            }
		        };
		 
		        t1.start();
		 
		        t2.start();
		}

}
