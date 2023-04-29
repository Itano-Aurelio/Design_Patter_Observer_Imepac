package subject;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
    public void setNews(String news) {
        this.news = news;
        notifyObservers(news);
    }
}
