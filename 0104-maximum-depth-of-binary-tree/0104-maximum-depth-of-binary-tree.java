/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // 노드갯수 (=깊이)로 여기는 정의되어있음
        // 만약 루트노드 자체가 없으면 0
        // 후위 순회로 진행이되게끔 되어있음 왼쪽, 오른쪽, 루트순
        // 예제 1번만 봐도 루트3에서 왼쪽노드9, 오른쪽노드20 -> 오른쪽9에서의 또 왼쪽자식15, 오른쪽자식7
        // 최하위꺼 노드 비교해서 각각 1씩이니까 +2고 그럼 노트 20번의 maxDepth이 2가되고 노드9 maxDepth이 1이니까
        // 결국 루트3노드에서 오른쪽노드하위노드가 더 크니까 2 + 1 해서 3
        if(root == null) return 0;
        int ldepth = maxDepth(root.left);
        int rdepth = maxDepth(root.right);
        return Math.max(ldepth, rdepth) + 1; // 깊이가 노드갯수라서 +1
    }
}