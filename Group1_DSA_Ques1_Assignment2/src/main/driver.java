package main;

import java.util.*;
import service.SkyscraperConstruction;

public class driver {

	public static void main(String[] args) {

		SkyscraperConstruction skyconst = new SkyscraperConstruction();
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
		skyconst.calculateOrderOfConstruction(list, queue);

	}
}