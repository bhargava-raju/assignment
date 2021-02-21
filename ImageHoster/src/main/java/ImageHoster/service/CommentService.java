package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //This function passes the comments to the repository to store it in the database.
    public Comment postComment(Comment comment) {
        return commentRepository.postComment(comment);
    }

    //This function returns all the comments posted for an image from the database.
    public List<Comment> getComments(Integer imageId) {
        return commentRepository.getAllComments(imageId.toString());
    }


}
