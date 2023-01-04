package com.example.case_module3.services;

import com.example.case_module3.dao.CommentDao;
import com.example.case_module3.models.Comment;

import java.util.List;

public class CommentService {
    public static List<Comment> comments = CommentDao.getInstance().selectAll();

    public void Add(Comment comment) {
        CommentDao.getInstance().insert(comment);
        comments = CommentDao.getInstance().selectAll();
    }

    public void Delete(int id) {
        CommentDao.getInstance().delete(id);
        comments = CommentDao.getInstance().selectAll();
    }

    public void Edit() {
//        CommentDao.getInstance().update(CommentDao.getInstance().selectById());
        comments = CommentDao.getInstance().selectAll();
    }
}
