package com.macaroni.pannacotta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long articleId;
	@Column(length = 50, nullable = false)
	private String title;
	@Column(length = 50, nullable = false)
	private String text;

	public Article() {
	}
	
	public Article(Long id, String title, String text) {
		this.articleId = id;
		this.title = title;
		this.text = text;
	}

	public Article(String title, String text) {
		this.title = title;
		this.text = text;
	}


	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articleId == null) ? 0 : articleId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (articleId == null) {
			if (other.articleId != null)
				return false;
		} else if (!articleId.equals(other.articleId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", text=" + text + "]";
	}

}
