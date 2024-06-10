/*
 * This file is generated by jOOQ.
 */
package sun.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import sun.tables.Payment;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>fintrack.PAYMENT.PM_SEQ</code>. 결제 일련번호
     */
    public PaymentRecord setPmSeq(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_SEQ</code>. 결제 일련번호
     */
    public Long getPmSeq() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.MB_SEQ</code>. 회원 일련번호
     */
    public PaymentRecord setMbSeq(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.MB_SEQ</code>. 회원 일련번호
     */
    public Long getMbSeq() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.PM_CTT</code>. 결제 내용
     */
    public PaymentRecord setPmCtt(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_CTT</code>. 결제 내용
     */
    public String getPmCtt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.PM_PRC</code>. 결제 금액
     */
    public PaymentRecord setPmPrc(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_PRC</code>. 결제 금액
     */
    public Long getPmPrc() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.PM_DT</code>. 결제일시
     */
    public PaymentRecord setPmDt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_DT</code>. 결제일시
     */
    public LocalDateTime getPmDt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.PM_CTG_ID</code>. 카테고리 아이디
     */
    public PaymentRecord setPmCtgId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.PM_CTG_ID</code>. 카테고리 아이디
     */
    public Long getPmCtgId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.CRE_DT</code>. 등록일시
     */
    public PaymentRecord setCreDt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.CRE_DT</code>. 등록일시
     */
    public LocalDateTime getCreDt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.UPD_DT</code>. 수정일시
     */
    public PaymentRecord setUpdDt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.UPD_DT</code>. 수정일시
     */
    public LocalDateTime getUpdDt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>fintrack.PAYMENT.column_name</code>.
     */
    public PaymentRecord setColumnName(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>fintrack.PAYMENT.column_name</code>.
     */
    public Integer getColumnName() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Long pmSeq, Long mbSeq, String pmCtt, Long pmPrc, LocalDateTime pmDt, Long pmCtgId, LocalDateTime creDt, LocalDateTime updDt, Integer columnName) {
        super(Payment.PAYMENT);

        setPmSeq(pmSeq);
        setMbSeq(mbSeq);
        setPmCtt(pmCtt);
        setPmPrc(pmPrc);
        setPmDt(pmDt);
        setPmCtgId(pmCtgId);
        setCreDt(creDt);
        setUpdDt(updDt);
        setColumnName(columnName);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(sun.tables.pojos.Payment value) {
        super(Payment.PAYMENT);

        if (value != null) {
            setPmSeq(value.getPmSeq());
            setMbSeq(value.getMbSeq());
            setPmCtt(value.getPmCtt());
            setPmPrc(value.getPmPrc());
            setPmDt(value.getPmDt());
            setPmCtgId(value.getPmCtgId());
            setCreDt(value.getCreDt());
            setUpdDt(value.getUpdDt());
            setColumnName(value.getColumnName());
            resetChangedOnNotNull();
        }
    }
}
