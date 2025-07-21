package _02_structural_patterns._09_decorator;

public class CommentDecorator implements CommentService {

    // 데코레이터 추상 클래스
    // 모든 데코레이터가 이 클래스를 상속 -> 위임 구조
    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        // commentService에 작업 넘김
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
