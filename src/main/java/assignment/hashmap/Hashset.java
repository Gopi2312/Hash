package assignment.hashmap;

import java.util.*;
import java.util.logging.Logger;
public class Hashset {
	void hashset() {
		Logger logger = Logger.getLogger("hi");
		Set<String> set = new HashSet<>();
		set.add("chennai");
		set.add("madurai");
		set.add("paramakudi");
		set.add("ramnad");
		set.add("theni");
		set.remove("ramnad");
		logger.info(String.valueOf(set));
		int len = set.size();
		logger.info(String.valueOf(len));
		Set<String> lset = new LinkedHashSet<>();
		lset.add("chennai");
		lset.add("madurai");
		lset.add("paramakudi");
		lset.add("ramnad");
		lset.add("theni");
		lset.remove("ramnad");
		logger.info(String.valueOf(lset));
	}
}