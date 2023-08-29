package mydemo;
import java.util.*;
import java.util.stream.Collectors;
public class ProductOperation {
	private Scanner sc;
	private List<Product> prdlist;
	public ProductOperation()
	{
		sc=new Scanner(System.in);
		prdlist=new ArrayList<Product>();
				
	}
	public void insert()
	{
		System.out.println("Enter no of products u want to enter ");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++)
		{
			Product p=new Product();
			System.out.println("Enter Product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			System.out.println("Enter price ");
			p.setPrice(sc.nextDouble());
			prdlist.add(p);
		}
	}
	public void displayProduct()
	{
		List<Product> productdata=
				prdlist.stream().filter(pobj->pobj.getPrice()>30000).
				collect(Collectors.toList());
		productdata.stream().forEach(p->
		{
			System.out.println("Product name is "+p.getProductname());
			System.out.println("Price is "+p.getPrice());
		});
		
	}
	public void priceincrement()
	{
		prdlist.stream().map(product->product.getPrice()+1000).
		forEach(prd->
		{
			System.out.println("NEw PRice is "+prd);
			//System.out.println("Product price is "+prd.getPrice());
		}
		
		);
	}
	public void displaySortedData()
	{
		prdlist.stream().sorted((product1,product2)->
		product1.getPrice().compareTo(product2.getPrice())).forEach(product->
		{
			System.out.println("Product name is "+product.getProductname());
		});
	}
	public void totalPrice()
	{
		double totalPrice=prdlist.stream().
				collect(Collectors.summingDouble(product->product.getPrice()));
		System.out.println("Total price is "+totalPrice);
	}
	public void summeryrecords()
	{
		DoubleSummaryStatistics data=prdlist.stream().mapToDouble(x->x.getPrice()).summaryStatistics();
		System.out.println("MAximum price is "+data.getMax());
		System.out.println("Minium price is "+data.getMin());
	}
	
	
	public static void main(String[] args) {
		ProductOperation prdop=new ProductOperation();
		prdop.insert();
	//	prdop.displayProduct();
		//prdop.priceincrement();
		//prdop.displaySortedData();
		//prdop.totalPrice();
		prdop.summeryrecords();
	}
	

}
