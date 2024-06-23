/*
 * This file is generated by jOOQ.
 */
package sun;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import sun.tables.Asset;
import sun.tables.Category;
import sun.tables.Member;
import sun.tables.Trade;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Fintrack extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>fintrack</code>
     */
    public static final Fintrack FINTRACK = new Fintrack();

    /**
     * 자산 테이블
     */
    public final Asset ASSET = Asset.ASSET;

    /**
     * 카테고리 테이블
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>fintrack.MEMBER</code>.
     */
    public final Member MEMBER = Member.MEMBER;

    /**
     * 거래 내역 테이블
     */
    public final Trade TRADE = Trade.TRADE;

    /**
     * No further instances allowed
     */
    private Fintrack() {
        super("fintrack", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Asset.ASSET,
            Category.CATEGORY,
            Member.MEMBER,
            Trade.TRADE
        );
    }
}
