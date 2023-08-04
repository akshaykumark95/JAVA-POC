package com.garbage.collector;

public class GarbageCollector {
	// to store object name
		String name;

		public GarbageCollector(String name) {
			this.name = name;
		}

		static void show() {
			// object g1 inside method becomes unreachable when show() removed
			GarbageCollector gc1 = new GarbageCollector("gc1");
			display();

		}

		static void display() {
			// object g2 inside method becomes unreachable when display() removed
			GarbageCollector gc2 = new GarbageCollector("gc2");
		}
		
		public static void main(String [] args) {
			
			//anonymous object without reference id
	        new GarbageCollector("obj"); 
	   
	        // calling garbage collector
	        System.gc();
		}

		@Override
		protected void finalize() throws Throwable {
			// will print name of object
			System.out.println(this.name + " successfully garbage collected");
		}
}
