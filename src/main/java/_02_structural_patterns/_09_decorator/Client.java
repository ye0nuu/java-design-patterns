package _02_structural_patterns._09_decorator;

public class Client {

    // 댓글을 입력해서 commentService에 전달하는 사용자
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}
