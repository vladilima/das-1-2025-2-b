package br.univille.observer;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String mainState;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed.");
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.mainState);
        }
    }

    public void mainBusinessLogic(String newState) {
        this.mainState = newState;
        notifySubscribers();
    }

}
