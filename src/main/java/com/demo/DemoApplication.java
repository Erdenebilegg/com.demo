package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/** documentation. */
@SpringBootApplication
@EnableSwagger2
public class DemoApplication {
  /** documentation. */
  public static void main(String[] args) {
    String aas = "hah";
    System.out.println(aas);
    SpringApplication.run(DemoApplication.class, args);
  }
  /** documentation. */
  
  public Docket apis() {
    return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.demo"))
               .build();
  }

}
