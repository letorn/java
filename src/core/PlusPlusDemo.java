package core;

public class PlusPlusDemo {
	public static void main(String[] args) {
		int a = 1;
		a++;
		++a;
		System.out.println(a);

		int b;
		a = 1;
		b = a++;
		System.out.println("a=" + a + ",b=" + b);
		// 后++:1 先取a的值作为a++表达式的值,a++为1
		// 2 然后将a增加1,a为2
		// 3 将a++表达式的值赋值给b,b为1
		// 注意:++运算优先于赋值运算=执行

		a = 1;
		b = ++a;
		System.out.println("a=" + a + ",b=" + b);
		// 先++:1 先将a的值增加1,a为2
		// 2 取a的值作为++a表达式的值,++a的值为2
		// 3 赋值:将++a的值2赋值给b,b为2
		// 注意:++运算优先于赋值运算=执行

		a = 1;
		a = a++;
		System.out.println("a=" + a);
		// 后++:1 先取a的值作为a++表达式的值,a++为1
		// 2 然后将a增加1,a为2
		// 3 将a++表达式的值赋值给a,a为1
		// 注意:++运算优先于赋值运算=执行

		int i = 0;
		System.out.println(i++ % 3);// 0
		// 后++:1 先取i的值作为i++表达式的值,i++为1
		// 2 然后将i增加1,i为2
		// 3 将i++表达式的值赋值给i,i为1
		System.out.println(i++ % 3);// 1
		System.out.println(i++ % 3);// 2
		System.out.println(i++ % 3);// 0
		System.out.println(i++ % 3);// 1
		System.out.println(i++ % 3);// 2
		System.out.println(i++ % 3);// 0
		System.out.println(i++ % 3);// 1
		System.out.println(i++ % 3);// 2

		System.out.println("---------------");

		String[] players = { "邓丽君", "林青霞", "林志玲" };
		// 0 1 2
		String name = players[1];// name="林青霞"
		i = 0;
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);
		System.out.println(players[i++ % 3]);

		System.out.println("-------------------");
	}
}
