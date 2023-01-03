package com.example.case_module3.models;

public class Comment {
    private int commentId;
    private String userName;
    private String commentDetail;
    private int hatId;
    private String star;

    public Comment(int commentId, String userName, String commentDetail, int hatId, String star) {
        this.commentId = commentId;
        this.userName = userName;
        this.commentDetail = commentDetail;
        this.hatId = hatId;
        this.star = star;
    }

    public Comment() {
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail;
    }

    public int getHatId() {
        return hatId;
    }

    public void setHatId(int hatId) {
        this.hatId = hatId;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
}
