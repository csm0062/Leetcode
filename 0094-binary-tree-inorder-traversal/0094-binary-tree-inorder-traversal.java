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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>(); // 결과값 나올 리스트만들기
            inorder(root, output);
            return output;
    }
    private void inorder(TreeNode node, List<Integer> output) {
        if (node != null) {
            inorder(node.left, output); // 왼쪽자식 노드 방문
            output.add(node.val); // 현재 노드 값 추가
            inorder(node.right, output); // 오른쪽 자식 노드 방문
        }
    }
}