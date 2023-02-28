package assignment.hashmap;

import java.util.logging.Logger;
import java.util.*;
public class MainHash {
	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger("hi");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			logger.info("Choose Option:\n1.Hashmap\n2.Hashset\n3.Treeset\n4.Exit");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				Hashmap map = new Hashmap();
				map.hashmap();
			}
			else if(choice == 2)
			{
				Hashset hset = new Hashset();
				hset.hashset();
			}
			else if(choice == 3)
			{
				Treeset tset = new Treeset();
				tset.treeset();
			}
			else if(choice == 4)
			{
				System.exit(0);
			}
			else
			{
				logger.info("Invalid Option");
			}
		}
	}
}
