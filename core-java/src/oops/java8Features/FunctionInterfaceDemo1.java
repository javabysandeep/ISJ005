package oops.java8Features;

public class FunctionInterfaceDemo1 {

    @FunctionalInterface
    interface MessageService {
        void sendMessage();
    }

    public static void main(String[] args) {
        // way 1 : traditional option
        class MessageServiceImpl implements MessageService {
            @Override
            public void sendMessage() {
                System.out.println("Sending message");
            }
        }
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();

        //way 2 : anonymous class
        MessageService messageService1 = new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("Sending message");
            }
        };
        messageService1.sendMessage();

    }
}
