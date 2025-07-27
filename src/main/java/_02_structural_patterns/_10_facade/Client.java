package _02_structural_patterns._10_facade;

public class Client {
    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("yeonwoo");
        emailMessage.setTo("whiteship");
        emailMessage.setCc("일남");
        emailMessage.setSubject("오징어게임");
        emailMessaeg.setText("...");

        emailSender.sendEmail(emailMessage);

    }
}
