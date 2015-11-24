package exam.test11;

import java.util.Date;
import java.util.Map.Entry;
import java.util.Properties;

public class Tire {
	String maker;
	Properties spec;
	Date createDate;

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public Properties getSpec() {
		return spec;
	}

	public void setSpec(Properties spec) {
		this.spec = spec;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String toString() {
		StringBuilder specInfo = new StringBuilder();
		if(spec != null){
			for(Entry<Object,Object> entry : spec.entrySet()){
				specInfo.append(entry.getKey()+":"+entry.getValue()+",");
			}
		}
		
		return "[Tire : " + maker + " , " + specInfo.toString()
				+ ((createDate != null) ? ("," + createDate.toString()) : "")
				+ "]";
	}
}
