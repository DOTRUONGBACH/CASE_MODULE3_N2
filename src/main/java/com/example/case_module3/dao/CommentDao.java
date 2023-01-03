package com.example.case_module3.dao;

import com.example.case_module3.models.Comment;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.example.case_module3.dao.HatDao.connection;

public class CommentDao implements DaoInterface<Comment> {
    public static CommentDao getInstance() {
        return new CommentDao();
    }

    @Override
    public void insert(Comment comment) {
        String insertSql = "insert into Comment(userName, commentDetail, hatId, star) value (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, comment.getUserName());
            preparedStatement.setString(2, comment.getCommentDetail());
            preparedStatement.setInt(3, comment.getHatId());
            preparedStatement.setString(4, comment.getStar());

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Comment comment) {
        String updateSql = "UPDATE from Comment\n"
                + "Set userName = ?, commentDetail = ?, hatId = ?, star = ?, where commentId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSql);
            preparedStatement.setInt(5, comment.getCommentId());
            preparedStatement.setString(1, comment.getUserName());
            preparedStatement.setString(2, comment.getCommentDetail());
            preparedStatement.setInt(3, comment.getHatId());
            preparedStatement.setString(4, comment.getStar());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void delete(int id) {
        String deleteSql = "delete FROM Comment where commentId = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Comment> selectAll() {
        List<Comment> comments = new ArrayList<>();
        String sql = "Select * from Comment";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int commentId = resultSet.getInt("commentId");
                String userName = resultSet.getString("userName");
                String commentDetail = resultSet.getString("commentDetail");
                int hatId = resultSet.getInt("hatId");
                String star = resultSet.getString("star");

                comments.add(new Comment(commentId, userName, commentDetail, hatId, star));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return comments;
    }

    @Override
    public Comment selectById() {
        String sql = "Select * from Comment where commentId = ?";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int commentId = resultSet.getInt("commentId");
                String userName = resultSet.getString("userName");
                String commentDetail = resultSet.getString("commentDetail");
                int hatId = resultSet.getInt("hatId");
                String star = resultSet.getString("star");
                return new Comment(commentId, userName, commentDetail, hatId, star);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public ArrayList<Comment> selectByCondition(String condition) {
        return null;
    }
}
