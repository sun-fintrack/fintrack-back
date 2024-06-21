/*
 * This file is generated by jOOQ.
 */
package sun;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import sun.tables.Asset;
import sun.tables.Member;
import sun.tables.Payment;
import sun.tables.PaymentCategory;
import sun.tables.records.AssetRecord;
import sun.tables.records.MemberRecord;
import sun.tables.records.PaymentCategoryRecord;
import sun.tables.records.PaymentRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * fintrack.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AssetRecord> KEY_ASSET_PRIMARY = Internal.createUniqueKey(Asset.ASSET, DSL.name("KEY_ASSET_PRIMARY"), new TableField[] { Asset.ASSET.AS_SEQ }, true);
    public static final UniqueKey<MemberRecord> KEY_MEMBER_PRIMARY = Internal.createUniqueKey(Member.MEMBER, DSL.name("KEY_MEMBER_PRIMARY"), new TableField[] { Member.MEMBER.MB_SEQ }, true);
    public static final UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = Internal.createUniqueKey(Payment.PAYMENT, DSL.name("KEY_PAYMENT_PRIMARY"), new TableField[] { Payment.PAYMENT.PM_SEQ }, true);
    public static final UniqueKey<PaymentCategoryRecord> KEY_PAYMENT_CATEGORY_PRIMARY = Internal.createUniqueKey(PaymentCategory.PAYMENT_CATEGORY, DSL.name("KEY_PAYMENT_CATEGORY_PRIMARY"), new TableField[] { PaymentCategory.PAYMENT_CATEGORY.PM_CTG_ID }, true);
}
