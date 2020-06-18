
public class Box {
	int width;
	int height;
	int depth;
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
public int volume()
{
	return width*height*depth;
}
public static void main(String[] args)
{
	Box b=new Box(2,1,3);
	System.out.println(b.volume());
	
}
}
