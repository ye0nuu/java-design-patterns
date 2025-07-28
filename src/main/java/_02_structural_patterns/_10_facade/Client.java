package _02_structural_patterns._10_facade;

public class Client {
    public static void main(String[] args) {

        try {
            EmailSettings emailSettings = new EmailSettings();
            emailSettings.setHost("127.0.0.1");

            EmailSender emailSender = new EmailSender(emailSettings);

            EmailMessage emailMessage = new EmailMessage();
            emailMessage.setFrom("noreply@facadepattern.com");
            emailMessage.setTo("client@yourproject.com");
            emailMessage.setCc("backend@yourproject.com");
            emailMessage.setSubject("요청이 퍼사드에 의해 처리");
            emailMessage.setText("복잡한 서브 시스템은 몰라도 됨");

            // 이 한 줄만 호출하면 메일 전송
            emailSender.sendEmail(emailMessage);

        } catch (Exception e) {
            System.out.println("이메일 전송 중 예외 발생 (실습 환경에서는 무시 가능): " + e.getMessage());
            e.printStackTrace();
        }

    }
}
