package assignment.hashmap;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("hi");
		Set<String> set = new TreeSet<>();
		set.add("chennai");
		set.add("madurai");
		set.add("paramakudi");
		set.add("ramnad");
		set.add("theni");
		logger.log(Level.INFO,()-> "Set :"+set);
		int n = set.size();
		logger.log(Level.INFO,()-> "Size of a Set :"+n);
		logger.log(Level.INFO,()-> "Is theni in the Treeset: "+set.contains("chennai"));
		set.remove("theni");
		logger.log(Level.INFO,()-> "Set :"+set);
		
	}

}
