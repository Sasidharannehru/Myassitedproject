package com.sasi.assist.project;


	class MyThreads extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		MyThreads mt = new  MyThreads();
	  		mt.start();
	 	}
	}



	public class RunnableThreads implements Runnable{
	 
	    public static int myCount = 0;
	    public RunnableThreads(){
	         
	    }
	    public void run() {
	        while(RunnableThreads.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++RunnableThreads.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        RunnableThreads mrt = new RunnableThreads();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(RunnableThreads.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++RunnableThreads.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}


