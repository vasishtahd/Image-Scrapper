/**
 * This class is generated by jOOQ
 */
package appengine.parser.mysqlmodels.tables;


import appengine.parser.mysqlmodels.Keys;
import appengine.parser.mysqlmodels._6txkrsiwk3;
import appengine.parser.mysqlmodels.tables.records.PromotefbpageRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Promotefbpage extends TableImpl<PromotefbpageRecord> {

    private static final long serialVersionUID = -1234766718;

    /**
     * The reference instance of <code>6txKRsiwk3.promotefbpage</code>
     */
    public static final Promotefbpage PROMOTEFBPAGE = new Promotefbpage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PromotefbpageRecord> getRecordType() {
        return PromotefbpageRecord.class;
    }

    /**
     * The column <code>6txKRsiwk3.promotefbpage.fb_page_id</code>.
     */
    public final TableField<PromotefbpageRecord, String> FB_PAGE_ID = createField("fb_page_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>6txKRsiwk3.promotefbpage.updated_time</code>.
     */
    public final TableField<PromotefbpageRecord, Timestamp> UPDATED_TIME = createField("updated_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>6txKRsiwk3.promotefbpage</code> table reference
     */
    public Promotefbpage() {
        this("promotefbpage", null);
    }

    /**
     * Create an aliased <code>6txKRsiwk3.promotefbpage</code> table reference
     */
    public Promotefbpage(String alias) {
        this(alias, PROMOTEFBPAGE);
    }

    private Promotefbpage(String alias, Table<PromotefbpageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Promotefbpage(String alias, Table<PromotefbpageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return _6txkrsiwk3._6TXKRSIWK3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PromotefbpageRecord> getPrimaryKey() {
        return Keys.KEY_PROMOTEFBPAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PromotefbpageRecord>> getKeys() {
        return Arrays.<UniqueKey<PromotefbpageRecord>>asList(Keys.KEY_PROMOTEFBPAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Promotefbpage as(String alias) {
        return new Promotefbpage(alias, this);
    }

    /**
     * Rename this table
     */
    public Promotefbpage rename(String name) {
        return new Promotefbpage(name, null);
    }
}
