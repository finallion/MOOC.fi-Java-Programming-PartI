
public class Main {

    public static void main(String[] args) {
        MessagingService ms = new MessagingService();
        
        System.out.println(ms.getMessages());
        ms.add(new Message("Github", "Hi"));
        System.out.println(ms.getMessages());
    }
}
