package com.dooioo.service;

import com.dooioo.base.service.BaseService;
import com.dooioo.model.Article;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hqm on 14-6-10.
 */
@Service
public class ArticleService extends BaseService<Article> {

    public List<Article> queryAllArticle(){
        return this.selectList("queryAllArticle");
    }

    public List<Article> queryArticleByPage(int number){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("number",number);
        return this.selectList(sqlId("queryArticleByPage"),map);
    }


}
