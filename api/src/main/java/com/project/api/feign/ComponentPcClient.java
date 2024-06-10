package com.project.api.feign;

import com.project.api.domain.ComponentPc;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "components-api", url = "https://components-pc-api.s3.us-east-2.amazonaws.com")
public interface ComponentPcClient {

    @GetMapping("/componentsPc.json")
    List<ComponentPc> getComponentsPc();
}
