package avengers.hulk.data.structure.Graph;

/**
 * @description: TODO
 * @author: huanglb
 * @date 2019/6/10 17:15
 */
//无权无向图，用邻接表表示，
public class Graph {
    private final int MAX_VERTS = 20;//表示定点的个数
    private Vertex vertexList[];//用来存储定点的数组
    private int adjMat[][];//用邻接矩阵来存储边，数组元素0表示没有边界，1表示有边界
    private int nVerts;
    private StackX theStack;//用栈实现深度优先搜多
    private QueueX queue;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;//初始化顶点个数为0
        //初始化邻接矩阵所有元素都为0，即所有顶点都没有边
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
        theStack = new StackX();
        queue = new QueueX();
    }

    //将顶点添加到数组中，是否访问标志置为wasVisited=false（未访问）
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    //注意用临界矩阵表示边，是对称的，两部分都要赋值
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    //打印某个顶点表示的值
    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }

    /**
     * 深度优先搜索算法
     * 1.用peek()方法检查栈顶的顶点
     * 2.用getAdjUnvisitedVertex()方法找到当前栈顶邻接且未被访问的顶点
     * 3.第二步方法值不等-1则找到下一个未访问的邻接顶点，访问这个顶点，并入栈
     * 如果第二步方法返回值等于-1,则没有找到，出栈
     */
    public void depthFirstSearch() {
        vertexList[0].wasVisited = true;//访问之后标记未true
        displayVertex(0);
        theStack.push(0);

        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        for (int i = 0; i < nVerts; i++) {

            vertexList[i].wasVisited = false;
        }
    }

    //找到与某一点邻接且未被访问的顶点
    public int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 广度优先搜索算法：
     * 1.用remove()方法检查栈顶的顶点
     * 2.试图找到这个顶点还未访问的邻接点
     * 3.如果没有找到，该顶点出列
     * 4.如果找到这样的顶点，访问这个顶点，并把它放入队列中
     */
    public void breadthFirstSearch() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.insert(0);
        int v2;

        while (!queue.isEmpty()) {
            int v1 = queue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                queue.insert(v2);
            }
        }

        for (int i = 0; i < nVerts; i++) {

            vertexList[i].wasVisited = false;
        }
    }
    //最小生成树

    /**
     * 基于深度优先搜索找到最小生成树
     * 这里是指，用最少的边连接所有顶点。对于一组顶点，可能有多种最小生成树，但是最小生成树的边的数量E总是比顶点V的数量小1，即：V = E+1
     */
    public void mst() {
        vertexList[0].wasVisited = true;
        theStack.push(0);

        while (!theStack.isEmpty()) {
            int currentVertex = theStack.peek();
            int v = getAdjUnvisitedVertex(currentVertex);
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                theStack.push(v);

                displayVertex(currentVertex);
                displayVertex(v);
                System.out.print(" ");
            }
        }

        //搜索完毕，初始化，以便于下次搜索
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }
}