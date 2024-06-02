/*
 * This file is generated by jOOQ.
 */
package sun.tables.records;


import org.jooq.impl.TableRecordImpl;

import sun.tables.PaymentCategory;


/**
 * 결제 카테고리 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PaymentCategoryRecord extends TableRecordImpl<PaymentCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sun.payment_category.pm_ctg_id</code>. 결제 카테고리 아이디
     */
    public PaymentCategoryRecord setPmCtgId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sun.payment_category.pm_ctg_id</code>. 결제 카테고리 아이디
     */
    public Long getPmCtgId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sun.payment_category.pm_ctg_nm</code>. 카테고리명
     */
    public PaymentCategoryRecord setPmCtgNm(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sun.payment_category.pm_ctg_nm</code>. 카테고리명
     */
    public String getPmCtgNm() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentCategoryRecord
     */
    public PaymentCategoryRecord() {
        super(PaymentCategory.PAYMENT_CATEGORY);
    }

    /**
     * Create a detached, initialised PaymentCategoryRecord
     */
    public PaymentCategoryRecord(Long pmCtgId, String pmCtgNm) {
        super(PaymentCategory.PAYMENT_CATEGORY);

        setPmCtgId(pmCtgId);
        setPmCtgNm(pmCtgNm);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PaymentCategoryRecord
     */
    public PaymentCategoryRecord(sun.tables.pojos.PaymentCategory value) {
        super(PaymentCategory.PAYMENT_CATEGORY);

        if (value != null) {
            setPmCtgId(value.getPmCtgId());
            setPmCtgNm(value.getPmCtgNm());
            resetChangedOnNotNull();
        }
    }
}
