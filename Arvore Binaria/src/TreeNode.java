public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public void add(int x) {
        if (x < val) {
            if (left == null) {
                left = new TreeNode(x);
            } else {
                left.add(x);
            }
        } else {
            if (right == null) {
                right = new TreeNode(x);
            } else {
                right.add(x);
            }
        }
    }

    public boolean contains(int x) {
        if (x == val) {
            return true;
        } else if (x < val) {
            if (left == null) {
                return false;
            } else {
                return left.contains(x);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(x);
            }
        }
    }

    public void remove (int x) {
        if (x < val) {
            if (left != null) {
                left.remove(x);
            }
        } else if (x > val) {
            if (right != null) {
                right.remove(x);
            }
        } else {
            if (left != null && right != null) {
                val = right.min();
                right.remove(val);
            } else if (left != null) {
                val = left.val;
                right = left.right;
                left = left.left;
            } else if (right != null) {
                val = right.val;
                left = right.left;
                right = right.right;
            } else {
                left = null;
                right = null;
            }
        }
    }

    public void print() {
        if (left != null) {
            left.print();
        }
        System.out.println(val);
        if (right != null) {
            right.print();
        }
    }

    public int min() {
        if (left == null) {
            return val;
        } else {
            return left.min();
        }
    }
}
