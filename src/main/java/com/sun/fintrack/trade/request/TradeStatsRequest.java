package com.sun.fintrack.trade.request;

import lombok.Getter;
import lombok.Setter;

/**
 * 거래 내역 카테고리별 통계 조회 요청
 **/
@Getter
@Setter
public class TradeStatsRequest {

  /**
   * 거래 타입
   */
  private String tradeType;
  /**
   * 기간 타입
   */
  private String periodType;
  /**
   * 일간/주간 검색 날짜
   */
  private String searchDate;
  /**
   * 연도
   */
  private Integer year;
  /**
   * 월
   */
  private Integer month;
  /**
   * 기간 시작날짜
   */
  private String startDate;
  /**
   * 기간 종료날짜
   */
  private String endDate;
}
