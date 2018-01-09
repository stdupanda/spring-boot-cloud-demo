package cn.xz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:my.properties" })
public class MyProperties {

    @Value("${my.config1}")
    private String config1;
    @Value("${my.config1}")
    private String config2;

    public String getConfig1() {
        return config1;
    }

    public String getConfig2() {
        return config2;
    }
}
