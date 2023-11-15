package com.ll.sb20231114.domain.article.article.service;

import com.ll.sb20231114.domain.article.article.entity.Article;
import com.ll.sb20231114.domain.article.article.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 저는 단 한번만 생성되고, 그 이후에는 재사용되는 객체입니다.
public class ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article write(String title, String body) {
        Article article = new Article(title, body);

        articleRepository.save(article);

        return article;
    }

    public Article findLastArticle() {
        return articleRepository.findLastArticle();
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}