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
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }
        // DFS (Depth-First Search)
    private int dfs(TreeNode node) {
        // 높이 차이가 1이하이면 균형으로 간주
        if(node == null) {
             return 0; // 노드 없으면 높이0
        }

        int leftH = dfs(node.left); // 왼쪽 서브트리 높이계산
        int rightH = dfs(node.right); // 오른쪽 서브트리 높이계산
        
        // 만약 서브트리하나라도 균형이 맞지않을경우, 높이차이가 1초과할경우(절대값사용)
        // -> -1반환(불균형을뜻)
        if(leftH == -1 || rightH == -1 || Math.abs(leftH - rightH) > 1){
            return -1;
        }

        // 현재 서브트리의 높이 반환
        return Math.max(leftH, rightH) + 1;
    }
}