package com.company;

import com.company.ObserverDesignPattern.A.interfaces.Observer;
import com.company.ObserverDesignPattern.A.model.EmailTopic;
import com.company.ObserverDesignPattern.A.model.EmailTopicSubscriber;
import com.company.ObserverDesignPattern.B.model.AccountNotification;
import com.company.ObserverDesignPattern.B.model.MessageInbox;
import com.company.SingletonPattern.MyClass;
import com.company.StrategyDesignPattern.A.controller.CalculatorController;
import com.company.StrategyDesignPattern.A.model.Circle;
import com.company.StrategyDesignPattern.A.model.Square;
import com.company.StrategyDesignPattern.A.model.Triangle;
import com.company.StrategyDesignPattern.B.controller.CreditCard;
import com.company.StrategyDesignPattern.B.controller.ShoppingCart;
import com.company.StrategyDesignPattern.B.model.Product;
import com.company.PrototypeDesignPattern.A.Person;
import com.company.PrototypeDesignPattern.B.Elephant;


public class Main {

    public static void main(String[] args) {
        //strategyDesignPatternA();
        Elephant elefante1 = new Elephant("Dumbo", 1000);
        System.out.println(elefante1.getName());

        Elephant clonElefante1 = (Elephant) elefante1.clone();
        System.out.println("Clon del elefante 1: "+ clonElefante1.getName());

        clonElefante1.setName("Stampy");
        System.out.println(clonElefante1.getName());

    }


    public static void strategyDesignPatternA(){
        CalculatorController calculator = new CalculatorController();

        System.out.println("Área del cuadrado");
        calculator.shape = new Square();
        calculator.showResult(10);

        System.out.println("Área del triangulo");
        calculator.shape = new Triangle();
        calculator.showResult(10);

        System.out.println("Área del círculo\n");
        calculator.shape = new Circle();
        calculator.showResult(10);

    }


    public static void strategyDesignPatternB(){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product pelota = new Product(10.5, "1234abc");
        Product television = new Product(500, "qwert987654");

        //Proceso de pago
        shoppingCart.addItem(pelota);
        shoppingCart.addItem(pelota);
        shoppingCart.addItem(television);

        //Pagando
        shoppingCart.pay(new CreditCard("correo@email.com", "sakldaksdjl"));
    }

    public static void observerDesignPattern(){
        EmailTopic topic = new EmailTopic();

        Observer observerA = new EmailTopicSubscriber("First subscriber");
        Observer observerB = new EmailTopicSubscriber("Second subscriber");
        Observer observerC = new EmailTopicSubscriber("Third subscriber");

        observerA.setSubject(topic);
        observerB.setSubject(topic);
        observerC.setSubject(topic);

        topic.register(observerA);
        topic.register(observerB);
        topic.register(observerC);

        observerA.update();

        topic.postMessage("Hola");

        observerA.update();
    }

    public static void observerDesignPatternB(){
        AccountNotification notification = new AccountNotification();

        MessageInbox inbox = new MessageInbox(notification);

        notification.setTopic(inbox);

        notification.update();

        inbox.newMessage("Hola, acabo de llegar");

        notification.update();
    }

    public static void SingletonDesignPattern(){
        MyClass A = MyClass.getInstance();
        MyClass B = MyClass.getInstance();

        System.out.println(A);
        System.out.println(B);

        A.setName("Objeto A");

        System.out.println(A.getName());
        System.out.println(B.getName());
    }

    public static void PrototypeDesignPatternA(){
        Person persona1 = new Person("Juan", 30);
        System.out.println(persona1.getName());

        Person clonPersona1 = (Person) persona1.clone();
        System.out.println("Clon de persona 1: " + clonPersona1.getName());

        clonPersona1.setName("María");
        System.out.println("Clon de persona 1: " + clonPersona1.getName());
    }

}