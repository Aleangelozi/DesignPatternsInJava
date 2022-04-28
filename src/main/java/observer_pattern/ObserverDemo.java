package observer_pattern;

// Source: https://en.wikipedia.org/wiki/Observer_pattern
public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text : ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(event -> {
            System.out.println("Received response: " + event);
        });

        eventSource.scanSystemIn();
    }
}