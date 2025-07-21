package _02_structural_patterns._09_decorator;

public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        // 기본 구현체 생성 : 콘솔에 단순 출력
        CommentService commentService = new DefaultCommentService();

        // 동적 조합 - 필요한 기능만 선택해서 조합
        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

//        commentService = new TrimmingCommentDecorator(
//                new SpamFilteringCommentDecorator(
//                        new DefaultCommentService()));

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
