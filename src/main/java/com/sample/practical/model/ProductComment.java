package com.sample.practical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table (name = "product_comment")
public class ProductComment {
	
	@Id
	@Column(name="product_comment_id")
	private int commentId;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="created_at")
	private Timestamp createdAt;

	@ManyToOne
    @JoinColumn(name="product_product_id", referencedColumnName = "product_id")
    private Product productId;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	
}
