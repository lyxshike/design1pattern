package composite;

public interface Component {
    void operation();
}

interface Leaf extends Component{
	
}

interface composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}