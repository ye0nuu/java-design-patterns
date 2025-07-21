package _02_structural_patterns._09_decorator;

public class SpamFilteringCommentDecorator extends CommentDecorator {

    // 구체 데코레이터 1 : 스팸 필터링
    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (isNotSpam(comment)) {
            super.addComment(comment);
        }
    }

    // 댓글에 "http" (스팸링크) 있으면 출력 x
    private boolean isNotSpam(String comment) {
        return !comment.contains("http");
    }
}
