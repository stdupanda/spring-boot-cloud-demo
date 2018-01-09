package cn.xz.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class SpringContextHelper implements ApplicationContextAware {

    private static final Logger log = LoggerFactory.getLogger(SpringContextHelper.class);

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.debug("ApplicationContextAware....");
        SpringContextHelper.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> t){
        return applicationContext.getBean(t);
    }
}
