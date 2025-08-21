package br.univille.observer;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        ConcreteSubscriber subscriber1 = new ConcreteSubscriber("Zézinho");
        ConcreteSubscriber subscriber2 = new ConcreteSubscriber("Joãozinho");
        ConcreteSubscriber subscriber3 = new ConcreteSubscriber("Mariazinha");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        publisher.mainBusinessLogic("Initial State");

        publisher.unsubscribe(subscriber2);

        publisher.mainBusinessLogic("Updated State");
    }
}
