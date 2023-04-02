package ir.patterns.bihavioral.state;

import ir.patterns.bihavioral.state.impl.Package;

public class StateExample {
	
	public static void main(String[] args) {
		Package obj = new Package();
		System.out.println(obj.showState());
		obj.next();
		System.out.println(obj.showState());
		obj.next();
		System.out.println(obj.showState());
		obj.next();
		System.out.println(obj.showState());
		obj.next();
		System.out.println(obj.showState());
	}
}
