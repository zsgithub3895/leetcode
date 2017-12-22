package com.leetcode.array.thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestPool {
	private static List<MyTask> list = new ArrayList<MyTask>(); 
	public static void main(String[] args) throws InterruptedException {
		/*ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(2));
		ExecutorService executor1 =  Executors.newFixedThreadPool(1);
		ExecutorService executor2 =  Executors.newCachedThreadPool();
		ExecutorService executor3 =  Executors.newSingleThreadExecutor();
		ScheduledExecutorService executor4 =  Executors.newScheduledThreadPool(2);
		executor4.scheduleAtFixedRate(new MyTask(1), 1, 1, TimeUnit.SECONDS);*/
		ExecutorService executor =  Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000000; i++) {
			MyTask myTask = new MyTask(i);
			//executor.execute(myTask);
			list.add(myTask);
			/*System.out.println("线程池中线程数目：" + executor.getPoolSize() + "，队列中等待执行的任务数目：" + executor.getQueue().size()
					+ "，已执行玩别的任务数目：" + executor.getCompletedTaskCount());*/
		}
	}
}


class MyTask implements Runnable {
	private int taskNum;

	public MyTask(int num) {
		this.taskNum = num;
	}

	@Override
	public void run() {
		System.out.println("正在执行task " + taskNum);
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("task " + taskNum + "执行完毕");
	}
}