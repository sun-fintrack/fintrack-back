/*
 * This file is generated by jOOQ.
 */
package sun;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import sun.tables.Member;
import sun.tables.Payment;
import sun.tables.PaymentCategory;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Sun extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sun</code>
     */
    public static final Sun SUN = new Sun();

    /**
     * 회원 테이블
     */
    public final Member MEMBER = Member.MEMBER;

    /**
     * 결제 테이블
     */
    public final Payment PAYMENT = Payment.PAYMENT;

    /**
     * 결제 카테고리 테이블
     */
    public final PaymentCategory PAYMENT_CATEGORY = PaymentCategory.PAYMENT_CATEGORY;

    /**
     * No further instances allowed
     */
    private Sun() {
        super("sun", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Member.MEMBER,
            Payment.PAYMENT,
            PaymentCategory.PAYMENT_CATEGORY
        );
    }
}