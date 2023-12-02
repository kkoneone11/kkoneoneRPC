package org.kkoneone.rpc.provider;

import org.kkoneone.rpc.config.RpcProperties;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * 服务提供方后置处理器
 * @Author：kkoneone11
 * @name：ProviderPostProcessor
 * @Date：2023/12/2 12:45
 */
public class ProviderPostProcessor implements InitializingBean, BeanPostProcessor, EnvironmentAware {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setEnvironment(Environment environment) {
        RpcProperties properties = RpcProperties.getInstance();

    }
}
