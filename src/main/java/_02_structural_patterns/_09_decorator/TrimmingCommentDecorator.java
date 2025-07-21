package _02_structural_patterns._09_decorator;

public class TrimmingCommentDecorator extends CommentDecorator {

    // 구체 데코레이터2 : ... 제거
    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    // 댓글 공백을 제거하고 출력
    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
