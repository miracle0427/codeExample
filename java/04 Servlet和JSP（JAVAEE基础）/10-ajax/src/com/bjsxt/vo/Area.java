package com.bjsxt.vo;

public class Area {
	private int areaid;
	private String areaname;
	private int parentid;
	private String areaLevel;
	private String status;
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public String getAreaLevel() {
		return areaLevel;
	}
	public void setAreaLevel(String areaLevel) {
		this.areaLevel = areaLevel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaLevel == null) ? 0 : areaLevel.hashCode());
		result = prime * result + areaid;
		result = prime * result + ((areaname == null) ? 0 : areaname.hashCode());
		result = prime * result + parentid;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Area other = (Area) obj;
		if (areaLevel == null) {
			if (other.areaLevel != null)
				return false;
		} else if (!areaLevel.equals(other.areaLevel))
			return false;
		if (areaid != other.areaid)
			return false;
		if (areaname == null) {
			if (other.areaname != null)
				return false;
		} else if (!areaname.equals(other.areaname))
			return false;
		if (parentid != other.parentid)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Area [areaid=" + areaid + ", areaname=" + areaname + ", parentid=" + parentid + ", areaLevel="
				+ areaLevel + ", status=" + status + "]";
	}
	public Area(int areaid, String areaname, int parentid, String areaLevel, String status) {
		super();
		this.areaid = areaid;
		this.areaname = areaname;
		this.parentid = parentid;
		this.areaLevel = areaLevel;
		this.status = status;
	}
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
