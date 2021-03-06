package com.learn.java;

import com.learn.java.accessmodifier.p1.ClassAlpha;
import com.learn.java.accessmodifier.p1.ClassBeta;
import com.learn.java.arrays.ThreeDArray;
import com.learn.java.arrays.TwoDArray;
import com.learn.java.automobile.Driver;
import com.learn.java.automobile.FourWheeler;
import com.learn.java.automobile.Maruti;
import com.learn.java.automobile.Porsche;
import com.learn.java.automobile.TwoWheeler;
import com.learn.java.automobile.Vehicle;
import com.learn.java.bool.BooleanLogicalOp;
import com.learn.java.control.SwitchEx;
import com.learn.java.deadlock.Common;
import com.learn.java.deadlock.DThread1;
import com.learn.java.deadlock.DThread2;
import com.learn.java.encapsulation.Car;
import com.learn.java.inheritance.BabyDog;
import com.learn.java.inheritance.Cat;
import com.learn.java.inheritance.Dog;
import com.learn.java.inheritance.Programmer;
import com.learn.java.inheritance.advance.ClassA;
import com.learn.java.inheritance.advance.ClassB;
import com.learn.java.inheritance.advance.ClassC;
import com.learn.java.multilevel.LevelNode;
//import com.learn.java.multilevel.PathFinder;
import com.learn.java.narytree.NaryTreeNode;
import com.learn.java.nestedClass.Outer;
import com.learn.java.nestedInterface.A;
import com.learn.java.nestedInterface.B;
import com.learn.java.overriding.Axis;
import com.learn.java.overriding.Bank;
import com.learn.java.overriding.HSBC;
import com.learn.java.overriding.SBI;
import com.learn.java.polymorphism.Add;
import com.learn.java.print.PrintAtoZ;
import com.learn.java.stack.Stack;
import com.learn.java.stack.usingInterface.DynStack;
import com.learn.java.stack.usingInterface.FixedStack;
import com.learn.java.stack.usingInterface.IntStack;
import com.learn.java.stack.usingInterface.PrintStack;
import com.learn.java.threads.NAThread1;
import com.learn.java.threads.NAThread2;
import com.learn.java.threads.NAThread3;
import com.learn.java.threads.Thread1;
import com.learn.java.threads.Thread2;
import com.learn.java.tree.BinaryTree;
import com.learn.java.tree.Node;

public class First {

	public static void main(String[] args) {
		//Hello World | main class
		System.out.println("Hello...");
		
		//Encapsulation | getters, setters
		Car car = new Car();
		car.setName("McLaren");
		System.out.println(car.getName());
		
		//Inheritance
		Programmer p=new Programmer();  
		System.out.println("Programmer salary is: "+p.getSalary());  
		System.out.println("Bonus of Programmer is: "+p.getBonus());
		System.out.println("Total income of Programmer is: "+p.totalIncome());
		
		//Single Inheritance
		Dog d = new Dog();  
		d.bark();  
		d.eat();
		
		//Multilevel Inheritance
		BabyDog bd = new BabyDog();  
		bd.weep();   
		bd.bark();  
		bd.eat();  
		
		//Hierarchical Inheritance
		Cat c = new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//Compile.Time.Error 
		
		//Polymorphism
		Add adder = new Add();
		adder.add(4, 5);
		adder.add("Hello", "World");
		
		//Automobile
		TwoWheeler t1;
		FourWheeler f1;
		t1=new TwoWheeler("KA 74 A 2345", 1,2);
	    f1=new FourWheeler("KA 34 B 5677",5,4);
		t1.display();
		f1.display();
		        
		Porsche p1=new Porsche("KA 01 A 0001",911,4);
		p1.steering();
		p1.brake();
		p1.accelerate();
		        
		Maruti m1=new Maruti("KA 01 G 4867",10,4);
		m1.steering();
		m1.brake();
		m1.accelerate();
		m1.display();
		
		Vehicle vehicle = new Vehicle("KA 01 A 0001",911,2);
		Driver d1 = new Driver(vehicle);
		d1.test();
		
		//PrintAtoZ
		PrintAtoZ pr = new PrintAtoZ();
		pr.printAtoZ();
		System.out.println();
		
		//Arrays
		TwoDArray twod = new TwoDArray();
		twod.printStepArray(-9);
		twod.printStepArray(6);
		twod.printStepArrayReverse(5);
		twod.printProduct(4);
		
		ThreeDArray threed= new ThreeDArray();
		threed.print3DArray(3,4,2);
		
		//Switch case Example
		SwitchEx switchEx = new SwitchEx();
		switchEx.printDay(3);
		
		//Logical Boolean Operators
		BooleanLogicalOp boolOp = new BooleanLogicalOp();
		boolOp.boolLogicalOpDemo();
		
		//Stack
		Stack st = new Stack(10);
		for(int i = 0; i < 12 ; i++) {
			st.push(i);
		}
		st.popAllAndPrint();
		System.out.println();
		
		//N-ary Tree
        int n = 3;
        NaryTreeNode root = new NaryTreeNode("0. Things", n);

        root.addChild("1. Men");
            root.getChild(0).addChild("1.1. Clothes");
                root.getChild(0).getChild(0).addChild("1.1.1. T-Shirt");
                root.getChild(0).getChild(0).addChild("1.1.2. Shirt");
                root.getChild(0).getChild(0).addChild("1.1.3. Jeans");
            root.getChild(0).addChild("1.2. Footwear");
                root.getChild(0).getChild(1).addChild("1.2.1. Sports Shoes");
                root.getChild(0).getChild(1).addChild("1.2.2. Casual Shoes");
                root.getChild(0).getChild(1).addChild("1.2.3. Formal Shoes");
                root.getChild(0).getChild(1).addChild("1.2.4. Funky Shoes");  // won't add
        root.addChild("2.Women");
            root.getChild(1).addChild("2.1. Clothes");
                root.getChild(1).getChild(0).addChild("2.1.1. Western");
                root.getChild(1).getChild(0).addChild("2.1.2. Ethnic");
            root.getChild(1).addChild("2.2. Footwear");
                root.getChild(1).getChild(1).addChild("2.2.1. Heels");
                root.getChild(1).getChild(1).addChild("2.2.2. Wedges");

        NaryTreeNode.print(root);
		
		//Binary Tree
		BinaryTree tree = new BinaryTree();
		tree.root1 = new Node(1); 
        tree.root1.left = new Node(2); 
        tree.root1.right = new Node(3); 
        tree.root1.left.left = new Node(4); 
        tree.root1.left.right = new Node(5); 
   
        tree.root2 = new Node(1); 
        tree.root2.left = new Node(2); 
        tree.root2.right = new Node(3); 
        tree.root2.left.left = new Node(4); 
        tree.root2.left.right = new Node(5);
        
        if (tree.identicalBinaryTrees(tree.root1, tree.root2)) 
            System.out.println("Both trees are identical"); 
        else
            System.out.println("Trees are not identical"); 
        
        
        //Multilevel selection task
        LevelNode n0 = new LevelNode("0. Things");
        
        LevelNode n1 = new LevelNode("1. Men");
        n0.addChild(n1);
        LevelNode n2 = new LevelNode("2. Women");
        n0.addChild(n2);
        
        LevelNode n11 = new LevelNode("1.1. Clothes");
        n1.addChild(n11);
        LevelNode n12 = new LevelNode("1.2. Footwear");
        n1.addChild(n12);
        
        LevelNode n111 = new LevelNode("1.1.1. Shirt");
        n11.addChild(n111);
        LevelNode n112 = new LevelNode("1.1.2. Jeans");
        n11.addChild(n112);
        
        LevelNode n121 = new LevelNode("1.2.1. Sports Shoes");
        n12.addChild(n121);
        LevelNode n122 = new LevelNode("1.2.2. Formal Shoes");
        n12.addChild(n122);
        LevelNode n123 = new LevelNode("1.2.3. Casual Shoes");
        n12.addChild(n123);
        
        LevelNode n21 = new LevelNode("2.1. Clothes");
        n2.addChild(n21);
        LevelNode n22 = new LevelNode("2.2. Footwear");
        n2.addChild(n22);
        
        LevelNode n211 = new LevelNode("2.1.1. Western");
        n21.addChild(n211);
        LevelNode n212 = new LevelNode("2.1.2. Ethnic");
        n21.addChild(n212);
        
        LevelNode n221 = new LevelNode("2.2.1. Wedges");
        n22.addChild(n221);
        LevelNode n222 = new LevelNode("2.2.2. Heels");
        n22.addChild(n222);
        LevelNode n223 = new LevelNode("2.2.3. Casual Shoes");
        n22.addChild(n223);
        
//        PathFinder pf = new PathFinder();
//        System.out.println();
//        pf.selectNode(n111);
//        pf.selectNode(n21);
//        pf.selectNode(n2);
//        pf.selectNode(n11);
//        pf.selectNode(n1);
//        
//        pf.printPathOfSelectedNodes();
        
        n11.select();
        n222.select();
        n112.select();
        
        n0.printPath();
        System.out.println();
        
        
        //Nested Class - outer / inner
        Outer outer = new Outer();
        
        //Overriding
//        Bank b1 = new Bank();
        SBI sbi = new SBI();
        System.out.println("SBI ROI: "+ sbi.getRateOfInterest());      
        
        Axis ax = new Axis();
        System.out.println("Axis ROI: "+ ax.getRateOfInterest());
        
        HSBC h = new HSBC();
        System.out.println("HSBC ROI: "+ h.getRateOfInterest());
        
        //Inheritance - Advance // Not possible to access CLassA method via cB
        ClassA cA = new ClassA();
        ClassB cB = new ClassB();
        ClassC cC = new ClassC();
        
        cA.methodA();
        cB.methodB();
        cC.methodC();
        
        Object obj = new ClassA();
        obj.getClass();  
        
        //Access Modifiers
        ClassBeta beta = new ClassBeta();
        int x = beta.betaPub;
//        int y = beta.betaPri; // Cannot access private variable of other class
//        int z = beta.betaDef; // Cannot access default variable of other package
        
        //Nested Interface
        A.NestedIF nif = new B();
        int num = nif.x;
        
        //Multi Stack Implementation
        IntStack intStack = new FixedStack();
        intStack.push(5);
        intStack.push(52);
        intStack.push(5233);
        intStack.push(533);
        intStack.push(50);
        
        PrintStack pStack = new PrintStack();
        pStack.print(intStack);
        
        intStack = new DynStack();
        intStack.push(5);
        intStack.push(52);
        intStack.push(5233);
        intStack.push(533);
        intStack.push(543);
        intStack.push(536);
        intStack.push(530);
        intStack.push(53311);
        pStack.print(intStack);
        
        // Threads
        IntStack stack1 = new DynStack();
        
        Thread1 thread1 = new Thread1(stack1);
        thread1.start();
        
        Thread2 thread2 = new Thread2(stack1);
        thread2.t.start();
        
        try { // To make sure that main thread ends at last
			thread1.join();
			thread2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        PrintStack printStack = new PrintStack();
        printStack.print(stack1);
        		
        //Threads - notifyAll
        NAThread1 naThread1 = new NAThread1();
        NAThread2 naThread2 = new NAThread2(naThread1);
        NAThread3 naThread3 = new NAThread3(naThread1);
        
        naThread1.start();
        naThread2.start();
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        naThread3.start();
    
        //Deadlock
        Common c1 = new Common();
        Common c2 = new Common();
        
        DThread1 dThread1 = new DThread1(c1, c2);
        dThread1.start();
        
        DThread2 dThread2 = new DThread2(c1, c2);
        dThread2.start();
        
	}
}
