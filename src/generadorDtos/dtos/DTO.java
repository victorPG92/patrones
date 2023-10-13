package generadorDtos.dtos;

import java.security.Timestamp;
import java.util.Date;

public class DTO {

	private String id;
	private String name;
	private int i;
	private Integer i2;
	private double d;
	private Double d2;
	private float f;
	private Float f2;
	private long l;
	private Long L2;
	
	private boolean b;
	private Boolean b2;
	
	
	private Date date;
	//private Timestamp timestamp;
	
	
	public DTO() {
		super();

	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}

	
	

	public Integer getI2() {
		return i2;
	}


	public void setI2(Integer i2) {
		this.i2 = i2;
	}


	public double getD() {
		return d;
	}


	public void setD(double d) {
		this.d = d;
	}


	public Double getD2() {
		return d2;
	}


	public void setD2(Double d2) {
		this.d2 = d2;
	}


	public float getF() {
		return f;
	}


	public void setF(float f) {
		this.f = f;
	}


	public Float getF2() {
		return f2;
	}


	public void setF2(Float f2) {
		this.f2 = f2;
	}


	public long getL() {
		return l;
	}


	public void setL(long l) {
		this.l = l;
	}


	public Long getL2() {
		return L2;
	}


	public void setL2(Long l2) {
		L2 = l2;
	}


	public boolean isB() {
		return b;
	}


	public void setB(boolean b) {
		this.b = b;
	}


	public Boolean getB2() {
		return b2;
	}


	public void setB2(Boolean b2) {
		this.b2 = b2;
	}
	
	


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	


	@Override
	public String toString() {
		return "DTO [id=" + id + ", name=" + name + ", i=" + i + ", i2=" + i2 + ", d=" + d + ", d2=" + d2 + ", f=" + f
				+ ", f2=" + f2 + ", l=" + l + ", L2=" + L2 + ", b=" + b + ", b2=" + b2 + ", date=" + date
				 + "]";
	}


	


	
	
	
	
	
}
