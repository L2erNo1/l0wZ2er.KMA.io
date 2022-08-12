package Entities;

public class Product {
	private int productId;
	private String productName;
	private int brandId;
	private int categoryId;
	private int modelYear;
	private double listPrice;
	private double money;

	public Product(int productId, String productName, int brandId, int categoryId, int modelYear, double listPrice, double money) {
		this.productId = productId;
		this.productName = productName;
		this.brandId = brandId;
		this.categoryId = categoryId;
		this.modelYear = modelYear;
		this.listPrice = listPrice;
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName +", money=" + money + "]";
	}

}
