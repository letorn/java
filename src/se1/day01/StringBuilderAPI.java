package se1.day01;

public class StringBuilderAPI {
	public static void main(String[] args){
		StringBuilder builder = new StringBuilder();
		builder.append("李敖先生");
		builder.append("的前妻");
		builder.append("是");
		builder.append("胡茵梦女士");
		builder.append("据说十分漂亮");
		System.out.println(builder.toString());
		
		//从第0位开始追加"大师"
		builder.insert(0,"大师");
		System.out.println(builder.toString());
		
		//删除字符串中下标位4,5的两个字符
		builder.delete(4,6);
		System.out.println(builder.toString());
	}
}
