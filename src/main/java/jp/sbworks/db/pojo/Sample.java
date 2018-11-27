package jp.sbworks.db.pojo;

import java.io.Serializable;

public class Sample implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String c1;

    public Sample() {

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("とれたよ [id=");
        builder.append(id);
        builder.append(", c1=");
        builder.append(c1);
        builder.append("]");
        return builder.toString();
    }

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the c1
	 */
	public String getC1() {
		return c1;
	}

	/**
	 * @param c1 the c1 to set
	 */
	public void setC1(String c1) {
		this.c1 = c1;
	}
}
