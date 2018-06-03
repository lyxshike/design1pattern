package composite;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFile f2,f3,f4,f5;
		Folder f1 = new Folder("我的收藏");
		
		f2 = new ImageFile("老高的大头像.jpg");
		f3 = new TextFile("Hello.txt");
		
		f1.add(f2);
		f1.add(f3);
		
		Folder f11 = new Folder("我的电影");
		
		f4 = new VideoFile("天龙八部");
		f5 = new VideoFile("神雕侠侣");
		
		f11.add(f4);
		f11.add(f5);
		
		f1.add(f11);
		
		f1.killVirus();
	}

}
