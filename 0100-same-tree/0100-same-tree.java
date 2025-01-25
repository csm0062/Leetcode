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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // boolean값이다 정신차려라
        // 두 트리가 null값이면 결국 같은거니까 true
        // 두 트리의 값이다르거나, p트리가 null이거나 q트리가 null이면 여튼 값이든, 존재든 안맞으니까 false
        // 두 트리의 왼쪽자식이나 오른쪽자식 비교해서
        // 
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        } //false가 아니면 true
        // 여기서 else true를 넣어버리면 서브트리를 비교하지 않은상태에서 true가 되기때문에 서브트리를 비교하기위해서는 일단 true를 넣지 않고
        // true로 간주하게함.즉, if 조건에 해당하지 않으면 다음 단계로 넘어가서 진행

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        // 결국 루트노드가같아야하고, 왼쪽자식과 오른쪽자식같아야 이모든걸 충족해야하니 && 이걸 전부 충족하면true , 아니면 false
        
        /*
            if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
                return true;
            } else {
                return false;
            }
            이렇게써도된다 그치만 바로 그냥 내뱉기 위해서 return문에 박아버리기 더 깔끔하니까


            아예 줄여버려도됌
            return (p == null && q == null) || 
                   (!(p == null || q == null || p.val != q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
                   그치만 가독성 떨어짐
         */

    }
}