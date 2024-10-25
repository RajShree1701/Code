public class treeheight {
    public static void main(String[] args) {
        //int tree[][]={{10,4},{23,5},{21,2}};
        int tree[][]={{11,5},{10,9}};
        System.out.println(trees(tree));
    }
    public static int trees(int tree[][])
    {
        if(tree.length==0)
        {
            return -1;
        }
        int max=0;
        for(int i=0;i<tree.length;i++)
        {
            int feet=tree[i][0];
            int inch=tree[i][1];
            int currentheight=feet*12+inch;
            if(currentheight>max)
            {
                max=currentheight;
            }
        }
        return max;
    }
}
