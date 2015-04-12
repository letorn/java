package se1.day03;
/*
 * JAVA泛型
 */
public class ShopDemo {
	public static void main(String[] args){
//		Shop shop = new Shop(new Food("面包"));
//		Shop shop = new Shop(new Pet("面包"));
//		Food food = shop.buy();
//		Pet pet = (Pet)shop.buy();
//		System.out.println("买了一个商品" + food );
//		System.out.println("买了一个商品" + pet );
		
		Shop<Pet> shop = new Shop<Pet>(new Pet("芬奇士"));
		Pet pet = shop.buy();
		System.out.println("买了一个商品" + pet);
		
		Shop<Food> shop1 = new Shop<Food>(new Food("面包"));
		Food food = shop1.buy();
		System.out.println("买了一个商品" + food);
		
		Shop shop2 = new Shop(new Food("面包"));
		Food o = (Food)shop2.buy();
		System.out.println("买了一个商品" + o);
	}
}

/* 商店:包含一个属性和一个方法
 *   属性:所买的商品类型
 *   方法:买东西的方法,打印买的商品信息
 *   
 *   泛型P:
 *     在创建当前类的引用类型变量时指定具体类型
 *     这样的P就可以代表所指定的类型,那么当前类中P所代表的属性,以有方法
 *      参数类型和返回值类型就全部确定了
 *     
 *     若创建当前类的引用类型变量时没有指定具体类型
 *     P当做Object类型使用.<===注意!!
 *     
 *     若一个类中要声明多个泛型,那么在声明泛型时以","分割例如
 *     例如
 *     class Shop<K,V>{
 *     	  ......
 *     }
 */
class Shop<P>{
	P product;//销售的商品
	public Shop(P product){
		this.product = product;
	}
	public P buy(){
		System.out.println("商店正在出售:" + product);
		return product;
	}
}

class Food{
	String name;
	public Food(String name){
		this.name = name;
	}
	public String toString(){//将当前商品名返回
		return name;
	}
}
class Pet{
	String name;
	public Pet(String name){
		this.name = name;
	}
	public String toString(){//将当前商品名返回
		return name;
	}
}
