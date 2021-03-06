/**
 * This class is generated by jOOQ
 */
package appengine.parser.mysqlmodels.tables.records;


import appengine.parser.mysqlmodels.tables.FromfbpageTofbpage;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FromfbpageTofbpageRecord extends UpdatableRecordImpl<FromfbpageTofbpageRecord> implements Record3<String, String, Timestamp> {

    private static final long serialVersionUID = -579775647;

    /**
     * Setter for <code>6txKRsiwk3.fromfbpage_tofbpage.from_page_id</code>.
     */
    public void setFromPageId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>6txKRsiwk3.fromfbpage_tofbpage.from_page_id</code>.
     */
    public String getFromPageId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>6txKRsiwk3.fromfbpage_tofbpage.to_page_id</code>.
     */
    public void setToPageId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>6txKRsiwk3.fromfbpage_tofbpage.to_page_id</code>.
     */
    public String getToPageId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>6txKRsiwk3.fromfbpage_tofbpage.updated_time</code>.
     */
    public void setUpdatedTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>6txKRsiwk3.fromfbpage_tofbpage.updated_time</code>.
     */
    public Timestamp getUpdatedTime() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FromfbpageTofbpage.FROMFBPAGE_TOFBPAGE.FROM_PAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FromfbpageTofbpage.FROMFBPAGE_TOFBPAGE.TO_PAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return FromfbpageTofbpage.FROMFBPAGE_TOFBPAGE.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFromPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getToPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FromfbpageTofbpageRecord value1(String value) {
        setFromPageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FromfbpageTofbpageRecord value2(String value) {
        setToPageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FromfbpageTofbpageRecord value3(Timestamp value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FromfbpageTofbpageRecord values(String value1, String value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FromfbpageTofbpageRecord
     */
    public FromfbpageTofbpageRecord() {
        super(FromfbpageTofbpage.FROMFBPAGE_TOFBPAGE);
    }

    /**
     * Create a detached, initialised FromfbpageTofbpageRecord
     */
    public FromfbpageTofbpageRecord(String fromPageId, String toPageId, Timestamp updatedTime) {
        super(FromfbpageTofbpage.FROMFBPAGE_TOFBPAGE);

        set(0, fromPageId);
        set(1, toPageId);
        set(2, updatedTime);
    }
}
