package service;

import java.util.*;

public class SkyscraperConstruction {

 public void calculateOrderOfConstruction(LinkedList<Integer> list, Queue<Integer> queue) {
		
		Queue<Integer> tempqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
		int day = 1;
		
		while(list.peek() != null) {     
			
			if(list.getFirst() == queue.peek()) {    
				
				int top = queue.poll();   
				System.out.println();
				System.out.print("Day: "+day+"\n"+ top);  
				day++;
				list.poll();                     
				if(list.peek() == null)    // to save the program from throwing null pointer exception
					break;
				while(tempqueue.peek() != null && tempqueue.peek() > list.peek()){  
					   
					System.out.print(" "+tempqueue.poll()); 
					queue.poll();
				}
				continue;
			}
			else {
				System.out.println();
				System.out.print("Day: "+day+"\n");
				day++;
				tempqueue.add(list.poll()); 
				
				continue;
			}
		}
		if(tempqueue.peek() != null)
		{
			System.out.print(" ");
			while(tempqueue.peek() != null){     
   
					System.out.print(tempqueue.poll()+" "); 
			}
		}
	}
}