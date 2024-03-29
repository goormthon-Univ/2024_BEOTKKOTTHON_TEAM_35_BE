package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Lombok Builder 추가
public class FinancialProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fncIstNm; // 금융회사명
    private String prdNm; // 금융상품명
    private String prdSalDscnDt; // 상품판매중단일자
    private String regDate; // 등록일
    private int viewCount; // 조회수
    private int bookmarkCount; // 북마크 수
    private String homepageLink; // 홈페이지 링크

    private String description; // 한줄 설명
}
