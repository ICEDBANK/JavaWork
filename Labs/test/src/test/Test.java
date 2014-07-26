package test;

public class Test extends Object {
public static void main(String[] args) {
Test test = new Test();
}
public Test() {
System.out.print("A");
}
{
System.out.print("B");
}
static {
System.out.print("C");
}
}

