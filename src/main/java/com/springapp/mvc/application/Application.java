package com.springapp.mvc.application;

import com.springapp.mvc.easyBean.Braves;
import com.springapp.mvc.easyBean.IArms;
import com.springapp.mvc.easyBean.Machete;
import com.springapp.mvc.easyBean.Sword;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by xuc on 2018/1/7.
 * 配置类
 */
@ComponentScan(basePackages = {"com.springapp.mvc"})
@Configuration
public class Application {
    @Bean
    public Braves braves(IArms arms){
        return new Braves(arms);
    }
    @Bean
    @Profile("dev")
    @Scope(value = WebApplicationContext.SCOPE_GLOBAL_SESSION,
                proxyMode = ScopedProxyMode.INTERFACES)
    public Sword sword() {
        return new Sword();
    }
    @Bean
    @Profile("test")
    public Machete machete(){
        return new Machete();
    }
}
