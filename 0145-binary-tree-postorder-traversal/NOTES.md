  using 2 stack now 
  
  
	public List<Integer> postorderTraversal(TreeNode curr) {
         ArrayList<Integer> postOrder = new ArrayList<>();
            if (curr == null) return postOrder;

            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(curr);
            while (!s1.isEmpty()) {
                curr = s1.peek();
                s1.pop();
                s2.push(curr);
                if (curr.left != null)
                    s1.push(curr.left);
                if (curr.right != null)
                    s1.push(curr.right);
            }
            while (!s2.isEmpty()) {
                postOrder.add(s2.peek().val);
                s2.pop();
            }
            return postOrder;
    }

using 1 stack
	
	   public ArrayList<Integer> postOrderTrav(Node cur) {
        ArrayList < Integer > postOrder = new ArrayList < > ();
        if (cur == null) return postOrder;

        Stack < Node > st = new Stack < > ();
        while (cur != null || !st.isEmpty()) {

            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.data);
                    }
                } else cur = temp;
            }
        }
        return postOrder;

    }
	
