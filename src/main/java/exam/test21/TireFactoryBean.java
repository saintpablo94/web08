package exam.test21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class TireFactoryBean extends AbstractFactoryBean<Tire> {
	
	String maker;
	
	public void setMaker(String maker) {
		this.maker = maker;
	}

	public Tire createTire(String maker) {
		if (maker.equals("Hankook")) {
			return createHankookTire();
		} else {
			return createKumhoTire();
		}
	}

	private Tire createKumhoTire() {
		Tire tire = new Tire();
		tire.setMaker("Kumho");

		Properties specProp = new Properties();
		specProp.setProperty("width", "185");
		specProp.setProperty("ratio", "75");
		specProp.setProperty("rim.diameter", "16");
		tire.setSpec(specProp);

		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
			tire.setCreateDate(dataFormat.parse("2014-03-01"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return tire;
	}

	private Tire createHankookTire() {
		Tire tire = new Tire();
		tire.setMaker("Hankook");
		Properties specProp = new Properties();
		specProp.setProperty("width", "205");
		specProp.setProperty("ratio", "65");
		specProp.setProperty("rim.diameter", "14");
		tire.setSpec(specProp);

		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			tire.setCreateDate(dataFormat.parse("2014-05-05"));
		} catch (Exception e) {
		}

		return tire;
	}

	@Override
	protected Tire createInstance() throws Exception {
		if (maker.equals("Hankook")) {
			return createHankookTire();
		} else {
			return createKumhoTire();
		}
	}

	@Override
	public Class<?> getObjectType() {
		return exam.test13.Tire.class;
	}
}
