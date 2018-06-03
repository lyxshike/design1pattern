package composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
	void killVirus();  //ɱ��
}

class ImageFile implements AbstractFile{
	private String name;
		
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	public void killVirus(){
		System.out.println("---ͼ���ļ�"+name+"���в�ɱ");
	}
}

class TextFile implements AbstractFile{
	private String name;
		
	public TextFile(String name) {
		super();
		this.name = name;
	}

	public void killVirus(){
		System.out.println("---�ı��ļ�~~"+name+"~~���в�ɱ");
	}
}

class VideoFile implements AbstractFile{
	private String name;
		
	public VideoFile(String name) {
		super();
		this.name = name;
	}

	public void killVirus(){
		System.out.println("---��Ƶ�ļ�~~"+name+"~~���в�ɱ");
	}
}

class Folder implements AbstractFile{
	private String name;
	//��������������ű����������µ��ӽڵ�
    private List<AbstractFile> list = new ArrayList<AbstractFile>(); 
	public Folder(String name) {
		super();
		this.name = name;
	}
	public void add(AbstractFile c){
		list.add(c);
	}
	public void remove(AbstractFile c){
		list.remove(c);
	}
	public AbstractFile getChild(int index){
		return list.get(index);
	}
	
	//�ݹ飬 ��Ȼ�ĵݹ�
	public void killVirus(){
		System.out.println("�ļ���~~"+name+"~~~~����ɱ��");
		for(AbstractFile file: list){
			file.killVirus();
		}
	}
	
}