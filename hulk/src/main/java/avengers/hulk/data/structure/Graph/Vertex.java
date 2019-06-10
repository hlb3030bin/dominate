package avengers.hulk.data.structure.Graph;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 17:13
 */
//节点
public class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char label){
        this.label = label;
        wasVisited = false;
    }
}