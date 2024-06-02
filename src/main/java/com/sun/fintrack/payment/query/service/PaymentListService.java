package com.sun.fintrack.payment.query.service;

import com.sun.fintrack.payment.query.repository.PaymentCategoryRepository;
import com.sun.fintrack.payment.response.PaymentCategoryListResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import lombok.RequiredArgsConstructor;

/**
 * 결제 목록 조회 서비스
 */
@RequiredArgsConstructor
@Service
public class PaymentListService {

  private final PaymentCategoryRepository paymentCategoryRepository;

  /**
   * 결제 카테고리 목록 조회
   *
   * @return 요청 결과
   */
  @Transactional(readOnly = true)
  public List<PaymentCategoryListResponse> getCategoryList() {
    return paymentCategoryRepository.findAll()
                                    .stream()
                                    .map(c -> new PaymentCategoryListResponse(c.getCategoryId(), c.getName()))
                                    .toList();
  }
}