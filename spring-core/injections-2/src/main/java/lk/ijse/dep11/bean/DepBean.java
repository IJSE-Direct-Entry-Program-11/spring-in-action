package lk.ijse.dep11.bean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Conditional(DepBeanCondition.class)
@Component
public class DepBean {

    public DepBean() {
        System.out.println("DepBean()");
    }
}

class DepBeanCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
