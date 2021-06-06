package com.dp.example;

public class AddChildSum {
    public Node<Integer> addChildSum(Node<Integer> root){

        //Empty Node
        if( root ==null ){
            return null;
        }

        //for leaf Nodes
        if(root.left==null && root.right==null){
            return root;
        }

        //calling left tree
        Node<Integer> l = addChildSum(root.left);

        //calling right tree
        Node<Integer> r = addChildSum(root.right);

        root.data=l.data+r.data+root.data;

        return root;
    }

    public String leftOrderTraversal(Node<Integer> root)
    {
        if(root==null)
            return "";
        StringBuilder sb = new StringBuilder("");

        sb.append(root.data +"");
        String l = leftOrderTraversal(root.left);

            sb.append(l+"");
        String r = leftOrderTraversal(root.right);
            sb.append(r+"");


        return sb.toString();
    }

}
