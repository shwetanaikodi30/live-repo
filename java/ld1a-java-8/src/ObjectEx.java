
public class ObjectEx {
public static void main(String[] args) {
	Product product = new Product();
	System.out.println(product);
	System.out.println(product.toString());
}
}

class Product extends Object{
//class Product{
	public String productNameString = "Laptop";
	public float price = 500.50f;
//	@Override
//	public String toString() {
//		return "Product Details : " + productNameString + " " + price;
//	}
	@Override
	public String toString() {
		return "Product [productNameString=" + productNameString + ", price=" + price + "]";
	}
	
}