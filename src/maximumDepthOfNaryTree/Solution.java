package maximumDepthOfNaryTree;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;

        int numberOfChild = root.children.size();
        int longestDepth = 0;

        for(int i = 0; i < numberOfChild; i++){
            int currentDepth = maxDepth(root.children.get(i));

            if(currentDepth > longestDepth){
                longestDepth = currentDepth;
            }
        }

        return longestDepth+ 1;
    }
}