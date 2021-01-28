package coupling2example.tightcoupling;

 class A {
	B b;

	public A() {

		b = new B();
	}

	void display() {
		System.out.println("A");
		b.display();
	}

}
