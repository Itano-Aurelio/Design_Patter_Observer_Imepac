package main;

import observer.ConcreteObserver;
import subject.ConcreteSubject;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver("Assinante 1"));
        subject.attach(new ConcreteObserver("Assinante 2"));
        subject.attach(new ConcreteObserver("Assinante 3"));
        subject.setNews("Nova notícia publicada!");
    }
}
