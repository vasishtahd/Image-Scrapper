/**
 * This class is generated by jOOQ
 */
package appengine.parser.mysqlmodels.tables;


import appengine.parser.mysqlmodels.Keys;
import appengine.parser.mysqlmodels._6txkrsiwk3;
import appengine.parser.mysqlmodels.tables.records.InstagramunfollowersupdateRecord;

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
public class Instagramunfollowersupdate extends TableImpl<InstagramunfollowersupdateRecord> {

    private static final long serialVersionUID = -932155544;

    /**
     * The reference instance of <code>6txKRsiwk3.instagramunfollowersupdate</code>
     */
    public static final Instagramunfollowersupdate INSTAGRAMUNFOLLOWERSUPDATE = new Instagramunfollowersupdate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InstagramunfollowersupdateRecord> getRecordType() {
        return InstagramunfollowersupdateRecord.class;
    }

    /**
     * The column <code>6txKRsiwk3.instagramunfollowersupdate.pagename</code>.
     */
    public final TableField<InstagramunfollowersupdateRecord, String> PAGENAME = createField("pagename", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>6txKRsiwk3.instagramunfollowersupdate.from_user_name</code>.
     */
    public final TableField<InstagramunfollowersupdateRecord, String> FROM_USER_NAME = createField("from_user_name", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>6txKRsiwk3.instagramunfollowersupdate.followed_till</code>.
     */
    public final TableField<InstagramunfollowersupdateRecord, Integer> FOLLOWED_TILL = createField("followed_till", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>6txKRsiwk3.instagramunfollowersupdate</code> table reference
     */
    public Instagramunfollowersupdate() {
        this("instagramunfollowersupdate", null);
    }

    /**
     * Create an aliased <code>6txKRsiwk3.instagramunfollowersupdate</code> table reference
     */
    public Instagramunfollowersupdate(String alias) {
        this(alias, INSTAGRAMUNFOLLOWERSUPDATE);
    }

    private Instagramunfollowersupdate(String alias, Table<InstagramunfollowersupdateRecord> aliased) {
        this(alias, aliased, null);
    }

    private Instagramunfollowersupdate(String alias, Table<InstagramunfollowersupdateRecord> aliased, Field<?>[] parameters) {
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
    public List<UniqueKey<InstagramunfollowersupdateRecord>> getKeys() {
        return Arrays.<UniqueKey<InstagramunfollowersupdateRecord>>asList(Keys.KEY_INSTAGRAMUNFOLLOWERSUPDATE_INSTAGRAMUNFOLLOWERSUPDATE_PAGENAME_FROM_USER_NAME_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Instagramunfollowersupdate as(String alias) {
        return new Instagramunfollowersupdate(alias, this);
    }

    /**
     * Rename this table
     */
    public Instagramunfollowersupdate rename(String name) {
        return new Instagramunfollowersupdate(name, null);
    }
}
