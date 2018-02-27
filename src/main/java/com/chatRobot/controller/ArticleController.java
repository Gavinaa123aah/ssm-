package com.chatRobot.controller;

import com.chatRobot.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2018/2/10.
 */
@RequestMapping("/articles")
@Controller
public class ArticleController {

    @RequestMapping("/index")
    public String index(Model model) {
//        List<Article> articles = articleService.getFirst10Article();

        List<Article> articles = new LinkedList<Article>();


        for (int i = 0;i < 10;i++){
            Article article = new Article();
            article.setId(i);
            article.setCategoryId(i);
            article.setContent("adadad");
            article.setCategory("dadaddad");
            article.setDate("adad");
            article.setSummary("adsasd");
            article.setTitle("mmmmmm");
            articles.add(article);
        }

        for (Article article_TAG : articles) {
            System.out.println(article_TAG.getCategory());
        }
        model.addAttribute("articles", articles);
        return "admin/index";
    }
}
