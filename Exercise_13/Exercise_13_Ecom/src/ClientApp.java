import java.util.ArrayList;
import java.util.List;
import com.Ankit.cs106.ex13_ecomSys.Brand;
import com.Ankit.cs106.ex13_ecomSys.Category;
import com.Ankit.cs106.ex13_ecomSys.EcomSystem;
import com.Ankit.cs106.ex13_ecomSys.Product;

public class ClientApp {

	public static void main(String[] args) {
		List<Brand> listOfBrands = new ArrayList<>();
		
		listOfBrands.add(new Brand("Samsung","South Korea"));
		listOfBrands.add(new Brand("Nokia","Finland"));
		listOfBrands.add(new Brand("Apple","US"));
		
		List<Category> listofCategories = new ArrayList<>()
		{
			{
				add(new Category("Mobiles"));
				add(new Category("Laptops"));
				add(new Category("Electronic Accessories"));
			}
		};
		List<Product> listofProducts = new ArrayList<>();
		listofProducts.add(new Product(listOfBrands.get(0),
				754554.66,
				"Galaxy s1",
				new ArrayList<Category>() {{
					add(listofCategories.get(0));
				}}));
		listofProducts.add(new Product(listOfBrands.get(0),
				75.66,
				"Earphone",
				new ArrayList<Category>() {{
					add(listofCategories.get(0));
					add(listofCategories.get(2));
				}}));
		EcomSystem eComSys = new EcomSystem("Rupee", listOfBrands, listofCategories, listofProducts);

	}

}
