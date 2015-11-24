package exam.test07;

import java.util.Date;

public class Tire {
	String maker;
	String spec;
	Date createDate;

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String toString() {
		return "[Tire : " + maker + " , " + spec
				+ ((createDate != null) ? ("," + createDate.toString()) : "")
				+ "]";
	}
}
