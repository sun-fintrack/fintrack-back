package com.sun.fintrack.payment.command.service;

import com.sun.fintrack.asset.domain.Asset;
import com.sun.fintrack.asset.query.service.AssetOneService;
import com.sun.fintrack.category.domain.Category;
import com.sun.fintrack.category.domain.enums.CategoryType;
import com.sun.fintrack.category.query.service.CategoryOneService;
import com.sun.fintrack.common.utils.DateTimeUtils;
import com.sun.fintrack.payment.domain.Payment;
import com.sun.fintrack.payment.query.service.PaymentOneService;
import com.sun.fintrack.payment.request.PaymentModifyRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * 결제 수정 서비스
 */
@RequiredArgsConstructor
@Service
public class PaymentModifyService {

  private final PaymentOneService paymentOneService;
  private final CategoryOneService categoryOneService;

  private final AssetOneService assetOneService;

  /**
   * 결제 수정
   *
   * @param param 요청 파라미터
   */
  @Transactional
  public void modify(PaymentModifyRequest param) {
    Payment payment = paymentOneService.getOne(param.getPaymentSeq());
    Asset asset = assetOneService.getOne(param.getAssetSeq());
    Category category = payment.getCategory();
    if (!category.getCategorySeq().equals(param.getCategorySeq())) {
      category = categoryOneService.getOne(param.getCategorySeq(), CategoryType.PAYMENT);
    }

    payment.modify(param.getContent(), param.getPrice(), DateTimeUtils.convertToDateTime(param.getPaymentDt()), asset,
        category);
  }
}