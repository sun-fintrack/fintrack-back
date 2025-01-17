/*
 * This file is generated by jOOQ.
 */
package sun.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 자산 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Asset implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long asSeq;
    private final String asNm;
    private final Long asAmt;
    private final Long mbSeq;
    private final LocalDateTime creDt;
    private final LocalDateTime updDt;

    public Asset(Asset value) {
        this.asSeq = value.asSeq;
        this.asNm = value.asNm;
        this.asAmt = value.asAmt;
        this.mbSeq = value.mbSeq;
        this.creDt = value.creDt;
        this.updDt = value.updDt;
    }

    public Asset(
        Long asSeq,
        String asNm,
        Long asAmt,
        Long mbSeq,
        LocalDateTime creDt,
        LocalDateTime updDt
    ) {
        this.asSeq = asSeq;
        this.asNm = asNm;
        this.asAmt = asAmt;
        this.mbSeq = mbSeq;
        this.creDt = creDt;
        this.updDt = updDt;
    }

    /**
     * Getter for <code>fintrack.ASSET.AS_SEQ</code>. 자산 일련번호
     */
    public Long getAsSeq() {
        return this.asSeq;
    }

    /**
     * Getter for <code>fintrack.ASSET.AS_NM</code>. 자산명
     */
    public String getAsNm() {
        return this.asNm;
    }

    /**
     * Getter for <code>fintrack.ASSET.AS_AMT</code>. 자산 금액
     */
    public Long getAsAmt() {
        return this.asAmt;
    }

    /**
     * Getter for <code>fintrack.ASSET.MB_SEQ</code>. 회원 일련번호
     */
    public Long getMbSeq() {
        return this.mbSeq;
    }

    /**
     * Getter for <code>fintrack.ASSET.CRE_DT</code>. 등록일시
     */
    public LocalDateTime getCreDt() {
        return this.creDt;
    }

    /**
     * Getter for <code>fintrack.ASSET.UPD_DT</code>. 수정일시
     */
    public LocalDateTime getUpdDt() {
        return this.updDt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Asset other = (Asset) obj;
        if (this.asSeq == null) {
            if (other.asSeq != null)
                return false;
        }
        else if (!this.asSeq.equals(other.asSeq))
            return false;
        if (this.asNm == null) {
            if (other.asNm != null)
                return false;
        }
        else if (!this.asNm.equals(other.asNm))
            return false;
        if (this.asAmt == null) {
            if (other.asAmt != null)
                return false;
        }
        else if (!this.asAmt.equals(other.asAmt))
            return false;
        if (this.mbSeq == null) {
            if (other.mbSeq != null)
                return false;
        }
        else if (!this.mbSeq.equals(other.mbSeq))
            return false;
        if (this.creDt == null) {
            if (other.creDt != null)
                return false;
        }
        else if (!this.creDt.equals(other.creDt))
            return false;
        if (this.updDt == null) {
            if (other.updDt != null)
                return false;
        }
        else if (!this.updDt.equals(other.updDt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.asSeq == null) ? 0 : this.asSeq.hashCode());
        result = prime * result + ((this.asNm == null) ? 0 : this.asNm.hashCode());
        result = prime * result + ((this.asAmt == null) ? 0 : this.asAmt.hashCode());
        result = prime * result + ((this.mbSeq == null) ? 0 : this.mbSeq.hashCode());
        result = prime * result + ((this.creDt == null) ? 0 : this.creDt.hashCode());
        result = prime * result + ((this.updDt == null) ? 0 : this.updDt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Asset (");

        sb.append(asSeq);
        sb.append(", ").append(asNm);
        sb.append(", ").append(asAmt);
        sb.append(", ").append(mbSeq);
        sb.append(", ").append(creDt);
        sb.append(", ").append(updDt);

        sb.append(")");
        return sb.toString();
    }
}
