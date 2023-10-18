package oops.abstraction.interfaceDemo;

public interface MessageService1 {
    void sendMessage(String message);

    void receiveMessage();

    public static void main(String[] args) {

        MessageService1 messageService = new MessageService1() {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message : " + message);
            }

            @Override
            public void receiveMessage() {
                System.out.println("message received");
            }
        };
        messageService.sendMessage("Good morning");
        messageService.receiveMessage();
    }
}
