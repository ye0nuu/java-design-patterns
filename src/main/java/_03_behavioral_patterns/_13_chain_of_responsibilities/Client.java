package _03_behavioral_patterns._13_chain_of_responsibilities;

public class Client {
    public static void main(String[] args) {

        Request request = new Request("..");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);

    }
}
