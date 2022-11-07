package com.nttdata.bootcamp.msbankdebitcardassociated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**.*/
@SpringBootApplication
@EnableEurekaClient
public class MsBankDebitCardAssociatedAccountApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsBankDebitCardAssociatedAccountApplication.class, args);
  }

}
