package com.bichu.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by kaven on 2018/10/5.
 */
public class TokenCache {
    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);

    public static final String TOKEN_PREFIX = "token_";
    private static LoadingCache<String, String> localCache = CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(10000).expireAfterAccess(12, TimeUnit.HOURS)//初始化最大值为10000，如果超过10000，会调用LRU算法
            .build(new CacheLoader<String, String>() {
                //默认数据加载实现，当调用get取值时，如果key没有对应的取值，就会调用该方法返回值
                @Override
                public String load(String s) throws Exception {
                    return "null";//防止null.equal()空指针异常
                }
            });
    public static void setKey(String key, String value) {
        localCache.put(key, value);
    }
    public static String getKey(String key) {
        String value = null;
        try{
            value = localCache.get(key);
            if("null".equals(value)) {
                return null;
            }
        }catch(Exception e) {
            logger.error("loadingCache get error", e);
        }
        return value;
    }
}
