package top.hilox.resume;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * <pre>
 *     Hilox-Resume run.
 * </pre>
 *
 * Created by Hilox on 2019/1/24 0024.
 */
@Slf4j
@SpringBootApplication
public class ResumeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ResumeApplication.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        String serverPath = context.getEnvironment().getProperty("server.servlet.context-path");
        String result = String.format("Hilox-Resume started at http://localhost:%s%s", serverPort, serverPath);
        log.info(result);
    }
}
