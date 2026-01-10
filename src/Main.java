public class Main {
    public static void main(String[] args) {
        EmailClient client = new EmailClient();
        EmailClient.Email email = client.composeEmail("Thank you for subscription!");
        System.out.println(email.content);
    }
}

class EmailClient {
    class Email {
        String content;

        Email(String content) {
            this.content = content;
        }
    }

    public Email composeEmail(String messageContent) {
        return new Email(messageContent);
    }
}