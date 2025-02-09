package com.busanit501.api5012.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/sample") // API 엔드포인트 기본 경로 설정
public class SampleController {

    @Tag(name = "샘플 레스트",
            description = "AAA, BBB, CCC 출력 테스트")
    @GetMapping("/doA")
    @PreAuthorize("hasRole('ROLE_USER')")
    public List<String> doA() {
        return Arrays.asList("AAA", "BBB", "C");
    }

    @GetMapping("/doB")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<String> doB() {
        return Arrays.asList("AdminAAA", "AdminBBB", "AdminCCC");
    }
}




