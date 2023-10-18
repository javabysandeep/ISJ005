package oops.abstraction.interfaceDemo;

public interface MessageService {
    void sendMessage(String message);

    void receiveMessage();

    public static void main(String[] args) {
        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage(String message) {
                System.out.println("sending message : " + message);
            }

            @Override
            public void receiveMessage() {
                System.out.println("message received");
            }
        }

        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("Good morning");
        messageService.receiveMessage();
    }
}
