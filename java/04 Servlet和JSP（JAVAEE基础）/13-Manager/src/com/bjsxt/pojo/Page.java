package com.bjsxt.pojo;

import java.util.List;

public class Page {
	private int pageNum;
	private int pageSize;
	private int pageStart;
	private int count;
	private int pages;
	private List<User> lu;
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageStart() {
		return pageStart;
	}
	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public List<User> getLu() {
		return lu;
	}
	public void setLu(List<User> lu) {
		this.lu = lu;
	}
	@Override
	public String toString() {
		return "Page [pageNum=" + pageNum + ", pageSize=" + pageSize
				+ ", pageStart=" + pageStart + ", count=" + count + ", pages="
				+ pages + ", lu=" + lu + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((lu == null) ? 0 : lu.hashCode());
		result = prime * result + pageNum;
		result = prime * result + pageSize;
		result = prime * result + pageStart;
		result = prime * result + pages;
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
		Page other = (Page) obj;
		if (count != other.count)
			return false;
		if (lu == null) {
			if (other.lu != null)
				return false;
		} else if (!lu.equals(other.lu))
			return false;
		if (pageNum != other.pageNum)
			return false;
		if (pageSize != other.pageSize)
			return false;
		if (pageStart != other.pageStart)
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Page(int pageNum, int pageSize, int pageStart, int count, int pages,
			List<User> lu) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.pageStart = pageStart;
		this.count = count;
		this.pages = pages;
		this.lu = lu;
	}
}
