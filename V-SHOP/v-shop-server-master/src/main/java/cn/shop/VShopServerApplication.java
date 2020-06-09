package cn.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.shop.**.mapper")
@SpringBootApplication
public class VShopServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VShopServerApplication.class, args);
	}

}
