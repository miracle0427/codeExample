package com.bjsxt.pojo;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Demo1 {
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date time;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Demo1 [time=" + time.toLocaleString() + "]";
	}
}
