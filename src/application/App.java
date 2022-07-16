package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date moment = sdf.parse("21/06/2018 13:05:44");
        String title = "Traveling to new Zealand";
        String content = "I`m going to visit this wonderful country";
        int likes = 12;

        Post post = new Post(moment, title, content, likes);

        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that´s awesome");

        post.addComment(comment1);
        post.addComment(comment2);

        System.out.println(post);
        post.showComments();
    }
}
