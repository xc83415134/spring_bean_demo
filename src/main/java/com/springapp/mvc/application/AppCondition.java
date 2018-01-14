package com.springapp.mvc.application;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by xuc on 2018/1/7.
 * 条件判断bean是否创建
 */
public class AppCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        if (environment.acceptsProfiles("dev") || environment.acceptsProfiles("test")){
            return true;
        }
        return false;
    }
}
