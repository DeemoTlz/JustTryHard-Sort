package com.deemo.foundation.inner;

public class MemberOuter {

	private int a = 1;
	public int b = 2;
	public int c = 2;

	public class Inner {
		private int a = 3;
		public int b = 4;

		public void print() {
			System.out.println("a = " + a);
			System.out.println("MemberInner.this.a = " + MemberOuter.this.a);
			System.out.println("b = " + b);
			System.out.println("MemberInner.this.b = " + MemberOuter.this.b);
			System.out.println("MemberInner c = " + c);
		}
	}

	public void print() {
		System.out.println("a = " + a);
		System.out.println("new Inner().a = " + new Inner().a);
		System.out.println("b = " + b);
		System.out.println("new Inner().b = " + new Inner().b);
	}

	public void constrator() {
		Inner inner = new Inner();
	}

	public static void constrators() {
		Inner inner = new MemberOuter().new Inner();
	}
}
