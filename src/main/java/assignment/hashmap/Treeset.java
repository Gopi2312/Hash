package assignment.hashmap;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {

	void treeset(){
		Logger logger = Logger.getLogger("hi");
		Set<String> set = new TreeSet<>();
		set.add("chennai");
		set.add("madurai");
		set.add("theni");
		set.add("ramnad");
		set.add("paramakudi");
		logger.info(String.valueOf(set));
		int n = set.size();
		logger.info("Size of a set"+String.valueOf(n));
		logger.info("Is theni in the Treeset: "+String.valueOf(set.contains("theni")));
		set.remove("theni");
		logger.info(String.valueOf(set));
		
	}

}
