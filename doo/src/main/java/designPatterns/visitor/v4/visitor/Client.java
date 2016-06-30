package designPatterns.visitor.v4.visitor;

public class Client {

	private void exec() {
		//...
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementA());
		objectStructure.add(new ConcreteElementB());
		objectStructure.add(new ConcreteElementA());
		//...
		ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
		concreteVisitorA.visitObjectStructure(objectStructure);
		//...
		ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();
		concreteVisitorB.visitObjectStructure(objectStructure);		
	}
	
	public static void main(String[] args){
		new Client().exec();
	}

}
