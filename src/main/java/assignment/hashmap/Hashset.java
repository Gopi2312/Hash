package assignment.hashmap;

import java.util.*;
import java.util.logging.Logger;
public class Hashset {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("hi");
		Set<String> set = new HashSet<>();
		set.add("chennai");
		set.add("madurai");
		set.add("paramakudi");
		set.add("ramnad");
		set.add("theni");
		set.remove("ramnad");
		logger.log(Level.INFO,()-> "Set :"+set);
		int len = set.size();
		logger.log(Level.INFO,()-> "Size of a Set"+len);
		Set<String> lset = new LinkedHashSet<>();
		lset.add("chennai");
		lset.add("madurai");
		lset.add("paramakudi");
		lset.add("kamuthi");
		lset.add("theni");
		lset.remove("kamuthi");
		logger.log(Level.INFO,()-> "LinkedSet :"+lset);
	}
}
