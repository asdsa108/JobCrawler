package com.mcsoft.crawler;

import com.mcsoft.crawler.handler.impl.HtmlJSoupHandler;

import java.util.Map;

/**
 * JSoup处理数据型爬虫
 * Created by Mc on 2017/12/21.
 */
public class HtmlJSoupCrawler extends AbstractCrawler<Map<String, String>> {

    public HtmlJSoupCrawler(String method, String body, Map<String, String> headers, Map<String,
            String> ruleMap) {
        super(method, body, headers, new HtmlJSoupHandler(ruleMap));
    }
}
