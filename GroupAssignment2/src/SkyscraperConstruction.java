import java.util.*;

public class SkyscraperConstruction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Enter total no of floors in the building");
		int totalfloors = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		Queue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (i = 1; i <= totalfloors; i++) {

			System.out.println("Enter floor size of day " + i);
			list.add(sc.nextInt());
		}
		for (i = 0; i < totalfloors; i++) {

			queue.add(list.get(i));
		}

		System.out.println("The order of construction is as follows:");
		calculateOrderOfConstruction(list, queue);

	}

	 static void calculateOrderOfConstruction(LinkedList<Integer> list, Queue<Integer> queue) {
		
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