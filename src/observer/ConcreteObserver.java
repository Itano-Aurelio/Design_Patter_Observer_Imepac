package observer;

public class ConcreteObserver implements Observer {
    private String name;
    public ConcreteObserver(String name) {
        this.name = name;
    }
    public void update(String news) {
        System.out.println(name + " recebeu a notícia: " + news);
    }
}
