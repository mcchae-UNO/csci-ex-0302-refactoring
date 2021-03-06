package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p); 
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  extractedMethod(edgeList, p); 
      // other implementation
      return null;
   }

   /**
    * Extracted method using type parameterizing 
    * (weird term/name) 
    */
   <T extends Graph> void extractedMethod(List<T>objs, String p) {
	   for (T generic : objs) {
		   if (generic.contains(p)) {
			   System.out.println(generic); 
		   }
	   }
   }
}

/**
 * Super Class Refactoring 
 * @author Min 
 */
class Graph {
	   String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   }
	}

class Node extends Graph {
}

class Edge extends Graph {
}