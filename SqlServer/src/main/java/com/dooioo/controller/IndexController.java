package com.dooioo.controller;

import com.dooioo.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hqm on 14-6-10.
 */
@Controller
@RequestMapping("/**")
public class IndexController {

    @Autowired
    protected com.dooioo.service.ArticleService articleService;

    @RequestMapping("")
    public String index(Model model){
        List<Article> list = articleService.queryAllArticle();
        model.addAttribute("articleList",list);
        return "index";
    }

    @RequestMapping("/{page}")
    public String page(Model model,@PathVariable int page){
        List<Article> list = articleService.queryArticleByPage(page);
        model.addAttribute("articleList",list);
        return "detail";
    }
}
