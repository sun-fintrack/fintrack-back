package com.sun.fintrack.controller;

import com.sun.fintrack.common.response.ListResponse;
import com.sun.fintrack.common.response.SuccessResponse;
import com.sun.fintrack.payment.command.service.PaymentDeleteService;
import com.sun.fintrack.payment.command.service.PaymentEntryService;
import com.sun.fintrack.payment.command.service.PaymentModifyService;
import com.sun.fintrack.payment.query.service.PaymentListService;
import com.sun.fintrack.payment.request.PaymentEntryRequest;
import com.sun.fintrack.payment.request.PaymentModifyRequest;
import com.sun.fintrack.validation.PaymentValidator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/payments")
@RestController
public class PaymentController {

  private final PaymentEntryService paymentEntryService;
  private final PaymentModifyService paymentModifyService;
  private final PaymentDeleteService paymentDeleteService;
  private final PaymentListService paymentListService;

  /**
   * 결제 정보 삭제
   *
   * @param paymentSeq 결제 일련번호
   * @return 요청 결과
   */
  @DeleteMapping("/{paymentSeq}")
  public ResponseEntity<?> doDelete(@PathVariable("paymentSeq") Long paymentSeq) {
    PaymentValidator.validate(paymentSeq);

    paymentDeleteService.delete(paymentSeq);
    return ResponseEntity.ok(new SuccessResponse());
  }

  /**
   * 결제 카테고리 목록 조회
   *
   * @return 요청 결과
   */
  @GetMapping("/categories")
  public ResponseEntity<?> doGetCategories() {
    return ResponseEntity.ok(new ListResponse(paymentListService.getCategoryList()));
  }

  /**
   * 결제 정보 등록
   *
   * @param param 요청 파라미터
   * @return 요청 결과
   */
  @PostMapping
  public ResponseEntity<?> doPost(@RequestBody PaymentEntryRequest param) {
    PaymentValidator.validate(param);

    paymentEntryService.entry(param);
    return ResponseEntity.ok(new SuccessResponse());
  }

  /**
   * 결제 정보 수정
   *
   * @param param 요청 파라미터
   * @return 요청 결과
   */
  @PutMapping
  public ResponseEntity<?> doPut(@RequestBody PaymentModifyRequest param) {
    PaymentValidator.validate(param);

    paymentModifyService.modify(param);
    return ResponseEntity.ok(new SuccessResponse());
  }
}