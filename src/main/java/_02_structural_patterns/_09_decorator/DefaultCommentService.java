package _02_structural_patterns._09_decorator;

public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        // 가장 기본 동작 - 댓글을 출력만
        System.out.println(comment);
    }
}
