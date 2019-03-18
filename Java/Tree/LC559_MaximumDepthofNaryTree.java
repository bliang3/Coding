
import java.util.List;

/**
 *
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * For example, given a 3-ary tree:
 *
 *
 *
 *
 *
 * We should return its max depth, which is 3.
 *
 * Note:
 *
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 *
 * Return false.
 *
 * @authorLiu.3502
 * @created2018-01-31 下午6:45
 */

public class LC599_MaximumDepthofNaryTree{

  static class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }
  public static void main(String[] args) {
    Node root = new Node(1,null);
    int ans = maxDepth(root);
    System.out.println(ans);

  }

  //O(N)
  public static int maxDepth(Node root) {
    if(root == null){
      return 0;
    }
    int max = 1;
    for(Node i : root.children){

      max = Math.max(max,maxDepth(i)+1);
    }
    return max;

  }

}
