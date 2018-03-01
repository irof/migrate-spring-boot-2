package hogedriven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class HogedrivenApplication {

    private static final Logger logger = LoggerFactory.getLogger(HogedrivenApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HogedrivenApplication.class, args);

        Environment bean = context.getBean(Environment.class);

        logger.info("application.properties");
        logger.info("tab   : <<<{}>>>", bean.getProperty("hogedriven.properties.tab"));
        logger.info("space : <<<{}>>>", bean.getProperty("hogedriven.properties.space"));
        logger.info("\\u0020: <<<{}>>>", bean.getProperty("hogedriven.properties.space.unicode"));

        logger.info("application-default.yml");
        logger.info("tab   : <<<{}>>>", bean.getProperty("hogedriven.yml.tab"));
        logger.info("space : <<<{}>>>", bean.getProperty("hogedriven.yml.space"));
        logger.info("\\u0020: <<<{}>>>", bean.getProperty("hogedriven.yml.space.unicode"));
    }
}
