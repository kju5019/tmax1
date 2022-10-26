package ch08.sec10.exam02;

public interface A {
	void action();
}

class B implements A{
	@Override
	public void action() {
		System.out.println("B-action");
			}}

class C implements A{
	@Override
	public void action() {
		System.out.println("C-action");
		
	}}

class D extends B{
	@Override
	public void action() {	
		System.out.println("D-action");
	}}

class E extends C{
	@Override
	public void action() {
		System.out.println("E-action");
	}}

